package com.example.ipcd.app.reports

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ipcd.MainApplication
import com.example.ipcd.R
import com.example.ipcd.data.ObservationForm
import com.example.ipcd.data.Type
import com.example.ipcd.database.getDatabase
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class ReportViewModel : ViewModel() {

    private val database = getDatabase(MainApplication.instance)

    private val _observationFormList = MutableLiveData<List<ObservationForm>?>()
    val observationFormList: LiveData<List<ObservationForm>?>
        get() = _observationFormList

    private val _statisticsCount = MutableLiveData<String?>()
    val statisticsCount: LiveData<String?>
        get() = _statisticsCount

    private val filterTypes: MutableList<Type> = mutableListOf(Type.Doctor, Type.Nurse, Type.Worker)


    private val _filterStartDate = MutableLiveData<Date?>()
    val filterStartDate: LiveData<Date?>
        get() = _filterStartDate


    private val _filterEndDate = MutableLiveData<Date?>()
    val filterEndDate: LiveData<Date?>
        get() = _filterEndDate

    private fun setStatisticsCount(observationFormList: List<ObservationForm>) {
        val doctorsCount = observationFormList.count { it.selectedType == Type.Doctor }
        val nursesCount = observationFormList.count { it.selectedType == Type.Nurse }
        val workersCount = observationFormList.count { it.selectedType == Type.Worker }

        _statisticsCount.value = MainApplication.instance.getString(
            R.string.value_statistics_count,
            doctorsCount,
            nursesCount,
            workersCount
        )
    }

    fun getAllSavedObservationForms() {
        val savedObservationForms = mutableListOf<ObservationForm>()

        database.savedFormsDao().getAllSavedForms().forEach {
            savedObservationForms.add(
                ObservationForm(
                    id = it.id,
                    date = Date(it.timestamp),
                    selectedType = Type.fromValue(it.type),
                    selectedAnswers = database.savedFormsDao().getSavedFormAnswers(it.id)
                        .toMutableList()
                )
            )
        }

        val filteredList = savedObservationForms.filter { filterTypes.contains(it.selectedType) }
        setStatisticsCount(filteredList)

        _observationFormList.value =
            if (_filterStartDate.value != null && _filterEndDate.value != null) {
                filteredList.filter {
                    removeHoursFromDate(it.date)?.let { date ->
                        date.time <= removeHoursFromDate(_filterEndDate.value!!)!!.time && date.time >= removeHoursFromDate(_filterStartDate.value!!)!!.time
                    } ?: false
                }
            } else {
                filteredList
            }.sortedByDescending { it.date.time }
    }

    fun updateTypesFilters(type: Type, isChecked: Boolean) {
        if (isChecked) {
            filterTypes.add(type)
        } else {
            filterTypes.remove(type)
        }
    }

    fun updateStartDate(startDate: Date) {
        _filterStartDate.value = startDate
    }

    fun updateEndDate(endDate: Date) {
        _filterEndDate.value = endDate
    }

    private fun removeHoursFromDate(date: Date): Date? {
        val formatter = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
        return formatter.parse(formatter.format(date))
    }
}
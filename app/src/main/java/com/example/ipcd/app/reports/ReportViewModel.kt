package com.example.ipcd.app.reports

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ipcd.MainApplication
import com.example.ipcd.R
import com.example.ipcd.data.ObservationForm
import com.example.ipcd.data.Type
import com.example.ipcd.database.getDatabase

class ReportViewModel : ViewModel() {

    private val database = getDatabase(MainApplication.instance)

    private val _observationFormList = MutableLiveData<List<ObservationForm>?>()
    val observationFormList: LiveData<List<ObservationForm>?>
        get() = _observationFormList

    private val _statisticsCount = MutableLiveData<String?>()
    val statisticsCount: LiveData<String?>
        get() = _statisticsCount


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
                    selectedType = Type.fromValue(it.type),
                    selectedAnswers = database.savedFormsDao().getSavedFormAnswers(it.id)
                        .toMutableList()
                )
            )
        }

        setStatisticsCount(savedObservationForms)

        _observationFormList.value = savedObservationForms
    }
}
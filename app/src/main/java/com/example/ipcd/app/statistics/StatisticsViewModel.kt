package com.example.ipcd.app.statistics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ipcd.MainApplication
import com.example.ipcd.data.AnswerStatistics
import com.example.ipcd.data.Type
import com.example.ipcd.database.getDatabase
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class StatisticsViewModel : ViewModel() {
    private val database = getDatabase(MainApplication.instance)

    private val _filterStartDate = MutableLiveData<Date?>()
    val filterStartDate: LiveData<Date?>
        get() = _filterStartDate

    private val _filterEndDate = MutableLiveData<Date?>()
    val filterEndDate: LiveData<Date?>
        get() = _filterEndDate

    private val _answersStatistics = MutableLiveData<List<AnswerStatistics>>()
    val answersStatistics: LiveData<List<AnswerStatistics>>
        get() = _answersStatistics

    fun getData() {
        val allSavedAnswers = database.savedFormsDao().getAllSavedFormAnswers()
        val allAnswers = database.savedFormsDao().getAllAnswers()

        val filteredList = if (_filterStartDate.value != null && _filterEndDate.value != null) {
            allSavedAnswers.filter {
                removeHoursFromDate(Date(it.timestamp))?.let { date ->
                    date.time <= removeHoursFromDate(_filterEndDate.value!!)!!.time && date.time >= removeHoursFromDate(
                        _filterStartDate.value!!
                    )!!.time
                } ?: false
            }
        } else allSavedAnswers

        val answersStatistics = mutableListOf<AnswerStatistics>()
        var HR = 0
        var HW = 0
        var Missed = 0
        allAnswers.forEachIndexed { _, answer ->
            val missedAnswers = allAnswers.filter { it.text == "missed" }
            val doctorsCount =
                filteredList.count { answer.id == it.answerId && it.type == Type.Doctor.getId() }
            val nursesCount =
                filteredList.count { answer.id == it.answerId && it.type == Type.Nurse.getId() }
            val workersCount =
                filteredList.count { answer.id == it.answerId && it.type == Type.Worker.getId() }
            HR +=
                filteredList.count { answer.id == it.answerId && answer.text == "HR" }
            HW +=
                filteredList.count { answer.id == it.answerId && answer.text == "HW" }
            Missed +=
                missedAnswers.size
            answersStatistics.add(
                AnswerStatistics(
                    answerId = answer.id,
                    answerText = answer.text,
                    doctorsCount = doctorsCount,
                    nursesCount = nursesCount,
                    workersCount = workersCount,
                    totalCount = missedAnswers.size,
                    HR = HR,
                    HW = HW,
                    Missed = Missed,
                )
            )
        }

        _answersStatistics.value = answersStatistics
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
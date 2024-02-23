package com.example.ipcd.data

import com.example.ipcd.MainApplication
import com.example.ipcd.R

data class AnswerStatistics(
    val answerId: Int,
    val answerText: String,
    val totalCount: Int,
    val doctorsCount: Int,
    val nursesCount: Int,
    val workersCount: Int
) {
    private val resources = MainApplication.instance.resources

    fun getTotal(): String =
        resources.getString(R.string.value_answer_total_count, answerText, totalCount)

    fun getDoctorsPercentage(): String =
        resources.getString(
            R.string.value_doctors_count,
            doctorsCount,
            String.format("%.2f", doctorsCount / totalCount.toFloat() * 100)
        )

    fun getNursesPercentage(): String =
        resources.getString(
            R.string.value_nurses_count,
            nursesCount,
            String.format("%.2f", nursesCount / totalCount.toFloat() * 100)
        )

    fun getWorkersPercentage(): String =
        resources.getString(
            R.string.value_workers_count,
            workersCount,
            String.format("%.2f", workersCount / totalCount.toFloat() * 100)
        )

}

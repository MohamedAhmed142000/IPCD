package com.example.ipcd.data

import com.example.ipcd.MainApplication
import com.example.ipcd.R

data class AnswerStatistics(
    val answerId: Int,
    val answerText: String,
    var HR: Int,
    var HW: Int,
    var Missed: Int


) {

    private val resources = MainApplication.instance.resources
    fun getStatisticsCount() :String=
        resources.getString(
            R.string.value_statistics_counter,
            HR,
            HW,
            Missed
        )
    fun getHRPercentage(): String =
        resources.getString(
            R.string.value_hr_percentage,
            HR,
            String.format("%.2f", HR / (HR + HW + Missed).toFloat() * 100)
        )

    fun getHWPercentage(): String =
        resources.getString(
            R.string.value_hw_percentage,
            HW,
            String.format("%.2f", HW / (HR + HW + Missed).toFloat() * 100)
        )

    fun getCombinedPercentage(): String =
        resources.getString(
            R.string.value_combined_percentage,
            (HR + HW),
            String.format("%.2f", (HR + HW) / (HR + HW + Missed).toFloat() * 100)
        )
}

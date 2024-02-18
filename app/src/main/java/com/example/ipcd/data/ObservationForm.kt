package com.example.ipcd.data

import com.example.ipcd.MainApplication
import com.example.ipcd.database.AnswerEntity
import com.example.ipcd.database.getDatabase
import java.util.Date

class ObservationForm(
    val id: Int,
    val types: List<Type> = listOf(Type.Doctor, Type.Nurse, Type.Worker),
    val date: Date = Date(),
    val answers: List<AnswerEntity> = getDatabase(MainApplication.instance).savedFormsDao()
        .getAllAnswers(),
    var selectedType: Type? = null,
    val selectedAnswers: MutableList<AnswerEntity> = mutableListOf()
) {
    companion object {
        val FORMS_LIST = listOf(
            ObservationForm(1),
            ObservationForm(2),
            ObservationForm(3),
            ObservationForm(4),
            ObservationForm(5)
        )
    }
}
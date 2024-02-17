package com.example.ipcd.data

import com.example.ipcd.MainApplication
import com.example.ipcd.database.AnswerEntity
import com.example.ipcd.database.getDatabase

class ObservationForm(
    val id: Int,
    val types: List<Type> = listOf(Type.Doctor, Type.Nurse, Type.Worker),
    val answers: List<AnswerEntity> = getDatabase(MainApplication.instance).savedFormsDao().getAllAnswers(),
    var selectedType: Type? = null,
    val selectedAnswers: MutableList<AnswerEntity> = mutableListOf()
)
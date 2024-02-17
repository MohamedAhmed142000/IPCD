package com.example.ipcd.data

class ObservationForm(
    val id: Int,
    val types: List<Type> = listOf(Type.Doctor, Type.Nurse, Type.Worker),
    val answers: List<Answer> = Answer.ANSWERS_LIST,
    var selectedType: Type? = null,
    val selectedAnswers: MutableList<Answer> = mutableListOf()
)
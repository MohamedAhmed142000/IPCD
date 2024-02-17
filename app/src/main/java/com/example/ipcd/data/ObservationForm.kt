package com.example.ipcd.data

class ObservationForm(
    val id: Int,
    val types: List<Type> = listOf(Type.Doctor, Type.Nurse, Type.Worker),
    val answers: List<Answer> = Answer.ANSWERS_LIST
) {

    companion object {
        val OBSERVATION_FORMS_LIST = listOf(
            ObservationForm(1),
            ObservationForm(2),
            ObservationForm(3),
            ObservationForm(4),
            ObservationForm(5)
        )
    }
}
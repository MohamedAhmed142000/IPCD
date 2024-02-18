package com.example.ipcd.app.reports

import androidx.lifecycle.ViewModel
import com.example.ipcd.MainApplication
import com.example.ipcd.data.ObservationForm
import com.example.ipcd.data.Type
import com.example.ipcd.database.getDatabase

class ReportViewModel : ViewModel() {

    private val database = getDatabase(MainApplication.instance)

    fun getAllSavedObservationForms(): List<ObservationForm> {
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

        return savedObservationForms
    }
}
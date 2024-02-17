package com.example.ipcd.app.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ipcd.MainApplication
import com.example.ipcd.data.Answer
import com.example.ipcd.data.ObservationForm
import com.example.ipcd.data.Type
import com.example.ipcd.database.SavedFormAnswers
import com.example.ipcd.database.SavedFormEntity
import com.example.ipcd.database.getDatabase

class HomeViewModel : ViewModel() {

    private val database = getDatabase(MainApplication.instance)

    private val _observationFormList = MutableLiveData<List<ObservationForm>?>()
    val observationFormList: LiveData<List<ObservationForm>?>
        get() = _observationFormList

    init {
        _observationFormList.value = listOf(
            ObservationForm(1),
            ObservationForm(2),
            ObservationForm(3),
            ObservationForm(4),
            ObservationForm(5)
        )
    }

    fun updateObservationFormAnswer(formId: Int, answer: Answer, isChecked: Boolean) {
        _observationFormList.value?.toMutableList()?.let {
            val formIndex = it.indexOfFirst { item -> item.id == formId }
            val observationForm = it[formIndex]

            if (isChecked) {
                observationForm.selectedAnswers.add(answer)
            } else {
                observationForm.selectedAnswers.remove(answer)
            }

            it.removeAt(formIndex)
            it.add(observationForm)
            it.sortBy { it.id }

            _observationFormList.value = it
        }
    }

    fun updateObservationFormType(formId: Int, selectedType: Type) {
        _observationFormList.value?.toMutableList()?.let {
            val formIndex = it.indexOfFirst { item -> item.id == formId }
            val observationForm = it[formIndex]

            observationForm.selectedType = selectedType

            it.removeAt(formIndex)
            it.add(observationForm)
            it.sortBy { it.id }

            _observationFormList.value = it
        }
    }

    fun save() {
        _observationFormList.value?.let {
            it.forEach { form ->
                form.selectedType?.let { type ->
                    val insertedFormId = database.savedFormsDao().insertSavedForm(SavedFormEntity(type = type.getId()))

                    form.selectedAnswers.forEach { answer ->
                        database.savedFormsDao().insertSavedFormAnswers(
                            SavedFormAnswers(
                                formId = insertedFormId.toInt(),
                                answerId = answer.id
                            )
                        )
                    }

                }
            }
        }
    }
}
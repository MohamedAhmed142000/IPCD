package com.example.ipcd.app.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ipcd.data.Answer
import com.example.ipcd.data.ObservationForm
import com.example.ipcd.data.Type

class HomeViewModel : ViewModel() {

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
        _observationFormList.value?.let { forms ->
            forms.forEach {
                Log.i("ZZZ", "save: ${it.id} selectedType: ${it.selectedType} selectedAnswers: ${it.selectedAnswers}")
            }
        }
    }
}
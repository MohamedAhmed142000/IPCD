package com.example.ipcd.app.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ipcd.MainApplication
import com.example.ipcd.data.ObservationForm
import com.example.ipcd.data.Type
import com.example.ipcd.database.AnswerEntity
import com.example.ipcd.database.SavedFormAnswersEntity
import com.example.ipcd.database.SavedFormEntity
import com.example.ipcd.database.getDatabase

class HomeViewModel : ViewModel() {

    private val database = getDatabase(MainApplication.instance)

    private val _observationFormList = MutableLiveData<List<ObservationForm>?>()
    val observationFormList: LiveData<List<ObservationForm>?>
        get() = _observationFormList

    private val _savedSuccess = MutableLiveData<Boolean>()
    val savedSuccess: LiveData<Boolean>
        get() = _savedSuccess

    init {
        resetForms()
    }

    fun updateObservationFormAnswer(formId: Int, answer: AnswerEntity, isChecked: Boolean) {
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
        var isSaveSuccess = false
        _observationFormList.value?.let {
            it.forEach { form ->
                form.selectedType?.let { type ->
                    isSaveSuccess = true
                    val insertedFormId = database.savedFormsDao()
                        .insertSavedForm(SavedFormEntity(type = type.getId()))

                    form.selectedAnswers.forEach { answer ->
                        database.savedFormsDao().insertSavedFormAnswers(
                            SavedFormAnswersEntity(
                                type = type.getId(),
                                formId = insertedFormId.toInt(),
                                answerId = answer.id
                            )
                        )
                    }

                }
            }

            _savedSuccess.value = isSaveSuccess
            if (isSaveSuccess) {
                resetForms()
            }
        }
    }

    fun onSavedSuccessDone() {
        _savedSuccess.value = false
    }

    fun resetForms() {
        _observationFormList.value = ObservationForm.getFormsList()
    }
}
package com.example.ipcd.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SavedFormsDao {
    @Insert
    fun insertSavedForm(form: SavedFormEntity): Long

    @Insert
    fun insertSavedFormAnswers(savedFormAnswers: SavedFormAnswersEntity)

    @Query("select * from answers")
    fun getAllAnswers(): List<AnswerEntity>

    @Query("select answers.* from answers, saved_form_answers where answers.id = saved_form_answers.answer_id and saved_form_answers.form_id = :formId")
    fun getSavedFormAnswers(formId: Int): List<AnswerEntity>

    @Query("select saved_forms.* from saved_forms")
    fun getAllSavedForms(): List<SavedFormEntity>
}
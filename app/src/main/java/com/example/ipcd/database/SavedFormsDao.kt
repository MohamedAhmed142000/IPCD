package com.example.ipcd.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SavedFormsDao {
    @Insert
    fun insertSavedForm(form: SavedFormEntity): Long

    @Insert
    fun insertSavedFormAnswers(savedFormAnswers: SavedFormAnswers)

    @Query("select * from answers")
    fun getAllAnswers(): List<AnswerEntity>
}
package com.example.ipcd.database

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface SavedFormsDao {
    @Insert
    fun insertSavedForm(form: SavedFormEntity): Long

    @Insert
    fun insertSavedFormAnswers(savedFormAnswers: SavedFormAnswers)
}
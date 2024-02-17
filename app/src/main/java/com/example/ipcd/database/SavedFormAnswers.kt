package com.example.ipcd.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "saved_form_answers")
data class SavedFormAnswers(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "form_id") val formId: Int,
    @ColumnInfo(name = "answer_id") val answerId: Int,
) {
    constructor(formId: Int, answerId: Int) : this(
        0,
        formId, answerId
    )
}
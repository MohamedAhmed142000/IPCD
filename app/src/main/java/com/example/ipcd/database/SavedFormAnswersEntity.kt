package com.example.ipcd.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "saved_form_answers")
data class SavedFormAnswersEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "form_id") val formId: Int,
    @ColumnInfo(name = "answer_id") val answerId: Int,
    @ColumnInfo(name = "type") val type: Int,
    @ColumnInfo(name = "timestamp") val timestamp: Long,
    ) {
    constructor(formId: Int, answerId: Int, type: Int) : this(
        0,
        formId, answerId, type, System.currentTimeMillis()
    )
}
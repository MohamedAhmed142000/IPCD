package com.example.ipcd.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "saved_forms")
data class SavedFormEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo val type: Int,
) {
    constructor(type: Int) : this(
        0,
        type
    )
}

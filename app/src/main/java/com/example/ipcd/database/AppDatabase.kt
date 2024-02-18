package com.example.ipcd.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [SavedFormEntity::class, SavedFormAnswersEntity::class, AnswerEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun savedFormsDao(): SavedFormsDao
}

private lateinit var INSTANCE: AppDatabase

fun getDatabase(context: Context): AppDatabase =
    synchronized(AppDatabase::class.java) {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java, "saved_forms_db"
            ).allowMainThreadQueries().createFromAsset("saved_forms_db.db").build()
        }
        return INSTANCE
    }
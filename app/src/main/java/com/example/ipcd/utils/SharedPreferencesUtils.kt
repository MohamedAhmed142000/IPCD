package com.example.ipcd.utils

import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.example.ipcd.MainApplication

object SharedPreferencesUtils {
    private val sharedPref: SharedPreferences by lazy {
        PreferenceManager.getDefaultSharedPreferences(MainApplication.instance)
    }

    private val sharedPrefEditor: SharedPreferences.Editor by lazy {
        sharedPref.edit()
    }

    fun saveString(key: String, value: String) = sharedPrefEditor.putString(key, value).apply()
    fun getString(key: String, defaultValue: String? = null) = sharedPref.getString(key, defaultValue)

    fun clear() = sharedPrefEditor.clear().apply()
}
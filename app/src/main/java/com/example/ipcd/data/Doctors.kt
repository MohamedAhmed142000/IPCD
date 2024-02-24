package com.example.ipcd.data

import android.graphics.Gainmap
import com.example.ipcd.utils.SharedPreferencesUtils
import com.google.gson.Gson

data class Doctor(
    val id: Int,
    val username: String,
    val password: String,
    val isAdmin: Boolean = false
) {
    companion object {
        val DOCTOR_KEY = "doctor.key"

        val DOCTORS_LIST = listOf(
            Doctor(1, "main hospital", "#main001", true),
            Doctor(2, "student hospital", "#stud002"),
            Doctor(3, "om el-kosor hospital", "#omel003"),
            Doctor(4, "traume hospital", "#trau004"),
            Doctor(5, "new assiut hospital", "#newa005"),
            Doctor(6, "pediatric hospital", "#pedi006"),
            Doctor(7, "neurology psychiatry hospital ", "#neps007"),
            Doctor(8, "urology hospital", "#urol008"),
            Doctor(9, "woman hospital", "#woma009"),
            Doctor(10, "cardiology hospital", "#card010"),
            Doctor(11, "al raghi  hospital", "#alra011"),
        )

        fun saveLoggedInDoctor(doctor: Doctor) {
            SharedPreferencesUtils.saveString(DOCTOR_KEY, Gson().toJson(doctor))
        }

        fun getLoggedInDoctor(): Doctor? {
            val jsonString = SharedPreferencesUtils.getString(DOCTOR_KEY, null) ?: return null
            val gson = Gson()
            return gson.fromJson(jsonString, Doctor::class.java)
        }

        fun isLoggedIn(): Boolean = getLoggedInDoctor() != null

        fun logout() {
            SharedPreferencesUtils.clear()
        }
    }
}
package com.example.ipcd.app.login

import android.text.Editable
import android.text.TextWatcher
import android.widget.CompoundButton.OnCheckedChangeListener
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ipcd.data.Doctor

class LoginViewModel : ViewModel() {

    private val _loggedInSuccess = MutableLiveData<Boolean?>()
    val loggedInSuccess: LiveData<Boolean?>
        get() = _loggedInSuccess

    private val _showPassword = MutableLiveData<Boolean?>()
    val showPassword: LiveData<Boolean?>
        get() = _showPassword

    private val _showError = MutableLiveData<String?>()
    val showError: LiveData<String?>
        get() = _showError

    private var password: String = ""
    private var username: String = ""

    val usernameTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            username = s.toString()
        }

        override fun afterTextChanged(s: Editable?) {}
    }

    val passwordTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            password = s.toString()
        }

        override fun afterTextChanged(s: Editable?) {}
    }

    val showPasswordCheckedListener = OnCheckedChangeListener { view, isChecked ->
        _showPassword.value = isChecked
    }

    fun login() {
        val doctor = isValidCredentials(username, password)
        if (doctor != null) {
            Doctor.saveLoggedInDoctor(doctor)
            _loggedInSuccess.value = isAdminUser(username)
        } else {
            _showError.value = "wrong credentials"
        }
    }

    private fun isValidCredentials(username: String, password: String): Doctor? {
        // Replace this with your validation logic (e.g., check against a local database)
        return Doctor.DOCTORS_LIST.firstOrNull { user -> user.username == username && user.password == password }
    }

    private fun isAdminUser(username: String): Boolean {
        val user = Doctor.DOCTORS_LIST.firstOrNull { it.username == username }
        return user?.isAdmin ?: false
    }
}
package com.example.ipcd.domain

import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import androidx.databinding.BindingAdapter


@BindingAdapter("showPassword")
fun bindEditTextViewShowPassword(editText: EditText?, showPassword: Boolean) {
    editText?.let {
        it.transformationMethod = if (showPassword) HideReturnsTransformationMethod.getInstance()
        else PasswordTransformationMethod.getInstance()
    }
}
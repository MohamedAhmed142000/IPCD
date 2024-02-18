package com.example.ipcd.domain

import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


@BindingAdapter("showPassword")
fun bindEditTextViewShowPassword(editText: EditText?, showPassword: Boolean) {
    editText?.let {
        it.transformationMethod = if (showPassword) HideReturnsTransformationMethod.getInstance()
        else PasswordTransformationMethod.getInstance()
    }
}

@BindingAdapter("viewVisibility")
fun bindViewVisibility(view: View, isVisible: Boolean) {
    view.visibility = if (isVisible) View.VISIBLE else View.GONE
}

@BindingAdapter("date")
fun bindTextViewDateVisibility(textView: TextView, date: Date?) {
    date?.let {
        textView.text = SimpleDateFormat("EEE dd MMM yyyy 'at' hh:mm aaa", Locale.ENGLISH).run {
            this.format(date)
        }
    }
}
package com.example.ipcd.app.home

import com.example.ipcd.data.Type

class OnTypeClickListener(val clickListener: (formId: Int, type: Type?) -> Unit) {
    fun onClick(formId: Int, type: Type?) = clickListener(formId, type)
}
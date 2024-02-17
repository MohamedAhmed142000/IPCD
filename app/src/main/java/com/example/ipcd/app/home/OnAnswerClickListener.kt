package com.example.ipcd.app.home

import com.example.ipcd.data.Answer


class OnAnswerClickListener(val clickListener: (formId: Int, isChecked: Boolean, answer: Answer?) -> Unit) {
    fun onClick(formId: Int, isChecked: Boolean, answer: Answer?) =
        clickListener(formId, isChecked, answer)
}
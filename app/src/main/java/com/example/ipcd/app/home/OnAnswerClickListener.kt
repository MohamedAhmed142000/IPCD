package com.example.ipcd.app.home

import com.example.ipcd.database.AnswerEntity

class OnAnswerClickListener(val clickListener: (formId: Int, isChecked: Boolean, answer: AnswerEntity?) -> Unit) {
    fun onClick(formId: Int, isChecked: Boolean, answer: AnswerEntity?) =
        clickListener(formId, isChecked, answer)
}
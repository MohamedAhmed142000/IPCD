package com.example.ipcd.data

data class Answer(val id: Int, val text: String) {

    companion object {
        val ANSWERS_LIST = listOf(
            Answer(1, "bef-pat"),
            Answer(2, "bef-asept"),
            Answer(3, "aft-b.f"),
            Answer(4, "aft-pat"),
            Answer(5, "aft.p.surr"),
            Answer(6, "HR"),
            Answer(7, "HW"),
            Answer(8, "missed")
        )
    }
}
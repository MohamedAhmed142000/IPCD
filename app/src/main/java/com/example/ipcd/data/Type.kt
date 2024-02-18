package com.example.ipcd.data

enum class Type {
    Doctor {
        override fun getId(): Int {
            return 1
        }
    },
    Nurse {
        override fun getId(): Int {
            return 2
        }
    },
    Worker {
        override fun getId(): Int {
            return 3
        }
    };

    abstract fun getId(): Int

    companion object {
        fun fromValue(value: Int): Type {
            return when (value) {
                1 -> Doctor
                2 -> Nurse
                else -> Worker
            }
        }
    }
}
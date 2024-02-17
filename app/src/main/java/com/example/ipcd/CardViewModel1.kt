//package com.example.ipcd
//
//
//import IPCDSQLiteOpenHelper
//import android.content.Context
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import data.UserCount
//import kotlinx.coroutines.launch
//
//class CardViewModel1 (
//    context: Context
//)  : ViewModel() {
//
//
//
//    val dbHelper = IPCDSQLiteOpenHelper(context)
//    init {
//        viewModelScope.launch {
//            initializeUserCountInDatabase()
//        }
//    }
//    private fun initializeUserCountInDatabase() {
//        val currentCount = dbHelper.getUserCount()
//
//        if (currentCount == null) {
//            val defaultUserCount = UserCount(
//                doctorsCount = 0,
//                workersCount = 0,
//                nursesCount = 0,
//
//                befPatCount = 0,
//                befAseptCount = 0,
//                aftBFCount = 0,
//                aftPatCount = 0,
//                aftPSurrCount = 0,
//
//                hrCount = 0,
//                hwCount = 0,
//                missedCount = 0,
//
//                befPatCount_doctor = 0,
//                befAseptCount_doctor = 0,
//                aftBFCount_doctor = 0,
//                aftPatCount_doctor = 0,
//                aftPSurrCount_doctor = 0,
//
//                hrCount_doctor = 0,
//                hwCount_doctor = 0,
//                missedCount_doctor = 0,
//
//                befPatCount_nurses = 0,
//                befAseptCount_nurses = 0,
//                aftBFCount_nurses = 0,
//                aftPatCount_nurses = 0,
//                aftPSurrCount_nurses = 0,
//
//                hrCount_nurses = 0,
//                hwCount_nurses = 0,
//                missedCount_nurses = 0,
//
//                befPatCount_workers = 0,
//                befAseptCount_workers = 0,
//                aftBFCount_workers = 0,
//                aftPatCount_workers = 0,
//                aftPSurrCount_workers = 0,
//
//                hrCount_workers = 0,
//                hwCount_workers = 0,
//                missedCount_workers = 0
//            ) // Provide default values as needed
//            dbHelper.insertUserCount(defaultUserCount)
//        }
//    }
//    fun onCheckBoxCheckedChanged(id: Int, isChecked: Boolean) {
//        viewModelScope.launch {
//            val currentCount = dbHelper.getUserCount() ?: return@launch
//
//            when (id) {
//                R.id.Doctors ,R.id.Doctors1-> {
//                    val updatedCount = currentCount.copy(
//                        doctorsCount = currentCount.doctorsCount + if (isChecked) 1 else 0
//                    )
//                    dbHelper.insertUserCount(updatedCount)
//
//                    if (isChecked) {
//                        val updatedCountWithDoctor = updatedCount.copy(
//                            befPatCount_doctor = updatedCount.befPatCount_doctor + 1,
//                            befAseptCount_doctor = updatedCount.befAseptCount_doctor + 1,
//                            aftBFCount_doctor = updatedCount.aftBFCount_doctor + 1,
//                            aftPatCount_doctor = updatedCount.aftPatCount_doctor + 1,
//                            aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor + 1,
//                            hrCount_doctor = updatedCount.hrCount_doctor + 1,
//                            hwCount_doctor = updatedCount.hwCount_doctor + 1,
//                            missedCount_doctor = updatedCount.missedCount_doctor + 1
//                        )
//                        dbHelper.insertUserCount(updatedCountWithDoctor)
//                    } else {
//                        val updatedCountWithoutDoctor = updatedCount.copy(
//                            befPatCount = updatedCount.befPatCount_doctor,
//                            befAseptCount = updatedCount.befAseptCount_doctor,
//                            aftBFCount_doctor = updatedCount.aftBFCount_doctor,
//                            aftPatCount_doctor = updatedCount.aftPatCount_doctor,
//                            aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor,
//                            hrCount_doctor = updatedCount.hrCount_doctor,
//                            hwCount_doctor = updatedCount.hwCount_doctor,
//                            missedCount_doctor = updatedCount.missedCount_doctor
//                        )
//                        dbHelper.insertUserCount(updatedCountWithoutDoctor)
//                    }
//                }
//
//                R.id.Narses -> {
//                    val updatedCount = currentCount.copy(
//                        nursesCount = currentCount.nursesCount + if (isChecked) 1 else 0
//                    )
//                    dbHelper.insertUserCount(updatedCount)
//                    if (isChecked) {
//                        val updatedCountWithNurses = updatedCount.copy(
//                            befPatCount_nurses = updatedCount.befPatCount_nurses + 1,
//                            befAseptCount_nurses = updatedCount.befAseptCount_nurses + 1,
//                            aftBFCount_nurses = updatedCount.aftBFCount_nurses + 1,
//                            aftPatCount_nurses = updatedCount.aftPatCount_nurses + 1,
//                            aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses + 1,
//                            hrCount_nurses = updatedCount.hrCount_nurses + 1,
//                            hwCount_nurses = updatedCount.hwCount_nurses + 1,
//                            missedCount_nurses = updatedCount.missedCount_nurses + 1
//                        )
//                        dbHelper.insertUserCount(updatedCountWithNurses)
//                    } else {
//                        val updatedCountWithoutNurese = updatedCount.copy(
//                            befPatCount_nurses = updatedCount.befPatCount_nurses,
//                            befAseptCount_nurses = updatedCount.befAseptCount_nurses,
//                            aftBFCount_nurses = updatedCount.aftBFCount_nurses,
//                            aftPatCount_nurses = updatedCount.aftPatCount_nurses,
//                            aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses,
//                            hrCount_nurses = updatedCount.hrCount_nurses,
//                            hwCount_nurses = updatedCount.hwCount_nurses,
//                            missedCount_nurses = updatedCount.missedCount_nurses
//                        )
//                        dbHelper.insertUserCount(updatedCountWithoutNurese)
//                    }
//                }
//
//                R.id.workers -> {
//                    val updatedCount = currentCount.copy(
//                        workersCount = currentCount.workersCount + if (isChecked) 1 else 0
//                    )
//                    dbHelper.insertUserCount(updatedCount)
//                    if (isChecked) {
//                        val updatedCountWithWorker = updatedCount.copy(
//                            befPatCount_workers = updatedCount.befPatCount_workers + 1,
//                            befAseptCount_workers = updatedCount.befAseptCount_workers + 1,
//                            aftBFCount_workers = updatedCount.aftBFCount_workers + 1,
//                            aftPatCount_workers = updatedCount.aftPatCount_workers + 1,
//                            aftPSurrCount_workers = updatedCount.aftPSurrCount_workers + 1,
//                            hrCount_workers = updatedCount.hrCount_workers + 1,
//                            hwCount_workers = updatedCount.hwCount_workers + 1,
//                            missedCount_workers = updatedCount.missedCount_workers + 1
//                        )
//                        dbHelper.insertUserCount(updatedCountWithWorker)
//                    } else {
//                        val updatedCountWithoutWorker = updatedCount.copy(
//                            befPatCount_workers = updatedCount.befPatCount_workers,
//                            befAseptCount_workers = updatedCount.befAseptCount_workers,
//                            aftBFCount_workers = updatedCount.aftBFCount_workers,
//                            aftPatCount_workers = updatedCount.aftPatCount_workers,
//                            aftPSurrCount_workers = updatedCount.aftPSurrCount_workers,
//                            hrCount_workers = updatedCount.hrCount_workers,
//                            hwCount_workers = updatedCount.hwCount_workers,
//                            missedCount_workers = updatedCount.missedCount_workers
//                        )
//                        dbHelper.insertUserCount(updatedCountWithoutWorker)
//                    }
//                }
//
//                R.id.bef_pat -> {
//                    dbHelper.insertUserCount(
//                        currentCount.copy(
//                            befPatCount = currentCount.befPatCount + if (isChecked) 1 else 0
//                        )
//                    )
//                }
//
//                R.id.bef_asept -> {
//                    dbHelper.insertUserCount(
//                        currentCount.copy(
//                            befAseptCount = currentCount.befAseptCount + if (isChecked) 1 else 0
//                        )
//                    )
//                }
//
//                R.id.aft_b_f -> {
//                    dbHelper.insertUserCount(
//                        currentCount.copy(
//                            aftBFCount = currentCount.aftBFCount + if (isChecked) 1 else 0
//                        )
//                    )
//                }
//
//                R.id.aft_pat -> {
//                    dbHelper.insertUserCount(
//                        currentCount.copy(
//                            aftPatCount = currentCount.aftPatCount + if (isChecked) 1 else 0
//                        )
//                    )
//                }
//
//                R.id.aft_p_surr -> {
//                    dbHelper.insertUserCount(
//                        currentCount.copy(
//                            aftPSurrCount = currentCount.aftPSurrCount + if (isChecked) 1 else 0
//                        )
//                    )
//                }
//
//                R.id.missed -> {
//                    dbHelper.insertUserCount(
//                        currentCount.copy(
//                            missedCount = currentCount.missedCount + if (isChecked) 1 else 0
//                        )
//                    )
//                }
//
//                R.id.HR -> {
//                    dbHelper.insertUserCount(
//                        currentCount.copy(
//                            hrCount = currentCount.hrCount + if (isChecked) 1 else 0
//                        )
//                    )
//                }
//
//                R.id.HW -> {
//                    dbHelper.insertUserCount(
//                        currentCount.copy(
//                            hwCount = currentCount.hwCount + if (isChecked) 1 else 0
//                        )
//                    )
//                }
//                // Add more checkboxes as needed
//            }
//        }
//    }
//
//
//    fun onSaveClearButtonClicked() {
//        viewModelScope.launch {
//            val currentCount = dbHelper.getUserCount() ?: return@launch
//            // حفظ البيانات في قاعدة البيانات
//            dbHelper.insertUserCount(currentCount)
//            // قم بتنفيذ أي إجراء إضافي بعد حفظ البيانات إذا كان ذلك ضروريًا
//        }
//    }
//
//
//}

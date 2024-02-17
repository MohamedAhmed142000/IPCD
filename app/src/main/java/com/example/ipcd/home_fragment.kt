package com.example.ipcd

import android.content.Context
import database.IPCDSQLiteOpenHelper
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import data.UserCount
import database.DatabaseContract.CardView1.TABLE_CARD_VIEW_1

class home_fragment : Fragment() {
    private lateinit var rootView: View
    private lateinit var dbHelper: IPCDSQLiteOpenHelper
    private var updatedCountList: MutableList<UserCount> = mutableListOf()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rootView = inflater.inflate(R.layout.fragment_home_fragment, container, false)

        dbHelper = IPCDSQLiteOpenHelper(requireContext())

        // Find the CardView in the layout
        val cardView: CardView = rootView.findViewById(R.id.cardView2)
        val cardView1: CardView = rootView.findViewById(R.id.cardView)
        val cardView2: CardView = rootView.findViewById(R.id.cardView3)
        val cardView3: CardView = rootView.findViewById(R.id.cardView4)
        val cardView4: CardView = rootView.findViewById(R.id.cardView5)
        setUpRadioGroupAndCheckBoxes(cardView)
        setUpRadioGroupAndCheckBoxes1(cardView1)
        setUpRadioGroupAndCheckBoxes2(cardView2)
        setUpRadioGroupAndCheckBoxes3(cardView3)
        setUpRadioGroupAndCheckBoxes4(cardView4)

        //listeners for save and clear buttons
        val saveClearButton: Button = rootView.findViewById(R.id.buttonSaveClear)
        saveClearButton.setOnClickListener {
            handleSaveClearButtonClick()
        }


        return rootView
    }


    private fun setUpRadioGroupAndCheckBoxes(view: View) {
        // RadioGroup and RadioButtons for the first CardView
        val radioGroup: RadioGroup = view.findViewById(R.id.radioGroup)
        val doctorsRadioButton: RadioButton = view.findViewById(R.id.Doctors)
        val workersRadioButton: RadioButton = view.findViewById(R.id.workers)
        val nursesRadioButton: RadioButton = view.findViewById(R.id.Narses)

        // CheckBoxes for the first CardView
        val befPatCheckBox: CheckBox = view.findViewById(R.id.bef_pat)
        val befAseptCheckBox: CheckBox = view.findViewById(R.id.bef_asept)
        val aftBFCheckBox: CheckBox = view.findViewById(R.id.aft_b_f)
        val aftPatCheckBox: CheckBox = view.findViewById(R.id.aft_pat)
        val aftPSurrCheckBox: CheckBox = view.findViewById(R.id.aft_p_surr)

        val hrCheckBox: CheckBox = view.findViewById(R.id.HR)
        val hwCheckBox: CheckBox = view.findViewById(R.id.HW)
        val missedCheckBox: CheckBox = view.findViewById(R.id.missed)

        // Set up listeners for the first CardView
        doctorsRadioButton.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged1(R.id.Doctors, isChecked)
        }

        workersRadioButton.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged1(R.id.workers, isChecked)
        }

        nursesRadioButton.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged1(R.id.Narses, isChecked)
        }

        befPatCheckBox.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged1(R.id.bef_pat, isChecked)
        }

        befAseptCheckBox.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged1(R.id.bef_asept, isChecked)
        }

        aftBFCheckBox.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged1(R.id.aft_b_f, isChecked)
        }

        aftPatCheckBox.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged1(R.id.aft_pat, isChecked)
        }

        aftPSurrCheckBox.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged1(R.id.aft_p_surr, isChecked)
        }

        hrCheckBox.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged1(R.id.HR, isChecked)
        }
        hwCheckBox.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged1(R.id.HW, isChecked)
        }
        missedCheckBox.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged1(R.id.missed, isChecked)
        }
    }

    private fun setUpRadioGroupAndCheckBoxes1(view: View) {
// RadioGroup and RadioButtons for the Second CardView
        val radioGroup1: RadioGroup = view.findViewById(R.id.radioGroup1)
        val doctorsRadioButton1: RadioButton = view.findViewById(R.id.Doctors1)
        val workersRadioButton1: RadioButton = view.findViewById(R.id.workers1)
        val nursesRadioButton1: RadioButton = view.findViewById(R.id.Narses1)

        // CheckBoxes for the first CardView
        val befPatCheckBox1: CheckBox = view.findViewById(R.id.bef_pat1)
        val befAseptCheckBox1: CheckBox = view.findViewById(R.id.bef_asept1)
        val aftBFCheckBox1: CheckBox = view.findViewById(R.id.aft_b_f1)
        val aftPatCheckBox1: CheckBox = view.findViewById(R.id.aft_pat1)
        val aftPSurrCheckBox1: CheckBox = view.findViewById(R.id.aft_p_surr1)

        val hrCheckBox1: CheckBox = view.findViewById(R.id.HR1)
        val hwCheckBox1: CheckBox = view.findViewById(R.id.HW1)
        val missedCheckBox1: CheckBox = view.findViewById(R.id.missed1)
        // Set up listeners for the Second CardView
        doctorsRadioButton1.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged2(R.id.Doctors1, isChecked)
        }

        workersRadioButton1.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged2(R.id.workers1, isChecked)
        }

        nursesRadioButton1.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged2(R.id.Narses1, isChecked)
        }

        befPatCheckBox1.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged2(R.id.bef_pat1, isChecked)
        }

        befAseptCheckBox1.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged2(R.id.bef_asept1, isChecked)
        }

        aftBFCheckBox1.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged2(R.id.aft_b_f1, isChecked)
        }

        aftPatCheckBox1.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged2(R.id.aft_pat1, isChecked)
        }

        aftPSurrCheckBox1.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged2(R.id.aft_p_surr1, isChecked)
        }

        hrCheckBox1.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged2(R.id.HR1, isChecked)
        }
        hwCheckBox1.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged2(R.id.HW1, isChecked)
        }
        missedCheckBox1.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged2(R.id.missed1, isChecked)
        }
    }

    private fun setUpRadioGroupAndCheckBoxes2(view: View) {
        // RadioGroup and RadioButtons for the thrid CardView
        val radioGroup2: RadioGroup = view.findViewById(R.id.radioGroup2)
        val doctorsRadioButton2: RadioButton = view.findViewById(R.id.Doctors2)
        val workersRadioButton2: RadioButton = view.findViewById(R.id.workers2)
        val nursesRadioButton2: RadioButton = view.findViewById(R.id.Narses2)

        // CheckBoxes for the Third CardView
        val befPatCheckBox2: CheckBox = view.findViewById(R.id.bef_pat2)
        val befAseptCheckBox2: CheckBox = view.findViewById(R.id.bef_asept2)
        val aftBFCheckBox2: CheckBox = view.findViewById(R.id.aft_b_f2)
        val aftPatCheckBox2: CheckBox = view.findViewById(R.id.aft_pat2)
        val aftPSurrCheckBox2: CheckBox = view.findViewById(R.id.aft_p_surr2)

        val hrCheckBox2: CheckBox = view.findViewById(R.id.HR2)
        val hwCheckBox2: CheckBox = view.findViewById(R.id.HW2)
        val missedCheckBox2: CheckBox = view.findViewById(R.id.missed2)
        // Set up listeners for the Third CardView
        doctorsRadioButton2.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged3(R.id.Doctors2, isChecked)
        }

        workersRadioButton2.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged3(R.id.workers2, isChecked)
        }

        nursesRadioButton2.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged3(R.id.Narses2, isChecked)
        }

        befPatCheckBox2.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged3(R.id.bef_pat2, isChecked)
        }

        befAseptCheckBox2.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged3(R.id.bef_asept2, isChecked)
        }

        aftBFCheckBox2.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged3(R.id.aft_b_f2, isChecked)
        }

        aftPatCheckBox2.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged3(R.id.aft_pat2, isChecked)
        }

        aftPSurrCheckBox2.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged3(R.id.aft_p_surr2, isChecked)
        }

        hrCheckBox2.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged3(R.id.HR2, isChecked)
        }
        hwCheckBox2.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged3(R.id.HW2, isChecked)
        }
        missedCheckBox2.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged3(R.id.missed2, isChecked)
        }

    }

    private fun setUpRadioGroupAndCheckBoxes3(view: View) {
        // RadioGroup and RadioButtons for the Fourth CardView
        val radioGroup3: RadioGroup = view.findViewById(R.id.radioGroup3)
        val doctorsRadioButton3: RadioButton = view.findViewById(R.id.Doctors3)
        val workersRadioButton3: RadioButton = view.findViewById(R.id.workers3)
        val nursesRadioButton3: RadioButton = view.findViewById(R.id.Narses3)

        // CheckBoxes for the Fourth CardView
        val befPatCheckBox3: CheckBox = view.findViewById(R.id.bef_pat3)
        val befAseptCheckBox3: CheckBox = view.findViewById(R.id.bef_asept3)
        val aftBFCheckBox3: CheckBox = view.findViewById(R.id.aft_b_f3)
        val aftPatCheckBox3: CheckBox = view.findViewById(R.id.aft_pat3)
        val aftPSurrCheckBox3: CheckBox = view.findViewById(R.id.aft_p_surr3)

        val hrCheckBox3: CheckBox = view.findViewById(R.id.HR3)
        val hwCheckBox3: CheckBox = view.findViewById(R.id.HW3)
        val missedCheckBox3: CheckBox = view.findViewById(R.id.missed3)

        // Set up listeners for the Fourth CardView
        doctorsRadioButton3.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged4(R.id.Doctors3, isChecked)
        }

        workersRadioButton3.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged4(R.id.workers3, isChecked)
        }

        nursesRadioButton3.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged4(R.id.Narses3, isChecked)
        }

        befPatCheckBox3.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged4(R.id.bef_pat3, isChecked)
        }

        befAseptCheckBox3.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged4(R.id.bef_asept3, isChecked)
        }

        aftBFCheckBox3.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged4(R.id.aft_b_f3, isChecked)
        }

        aftPatCheckBox3.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged4(R.id.aft_pat3, isChecked)
        }

        aftPSurrCheckBox3.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged4(R.id.aft_p_surr3, isChecked)
        }

        hrCheckBox3.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged4(R.id.HR3, isChecked)
        }
        hwCheckBox3.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged4(R.id.HW3, isChecked)
        }
        missedCheckBox3.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged4(R.id.missed3, isChecked)
        }
    }

    private fun setUpRadioGroupAndCheckBoxes4(view: View) {
        // RadioGroup and RadioButtons for the Fifth CardView
        val radioGroup4: RadioGroup = view.findViewById(R.id.radioGroup4)
        val doctorsRadioButton4: RadioButton = view.findViewById(R.id.Doctors4)
        val workersRadioButton4: RadioButton = view.findViewById(R.id.workers4)
        val nursesRadioButton4: RadioButton = view.findViewById(R.id.Narses4)

        // CheckBoxes for the Fifth CardView
        val befPatCheckBox4: CheckBox = view.findViewById(R.id.bef_pat4)
        val befAseptCheckBox4: CheckBox = view.findViewById(R.id.bef_asept4)
        val aftBFCheckBox4: CheckBox = view.findViewById(R.id.aft_b_f4)
        val aftPatCheckBox4: CheckBox = view.findViewById(R.id.aft_pat4)
        val aftPSurrCheckBox4: CheckBox = view.findViewById(R.id.aft_p_surr4)

        val hrCheckBox4: CheckBox = view.findViewById(R.id.HR4)
        val hwCheckBox4: CheckBox = view.findViewById(R.id.HW4)
        val missedCheckBox4: CheckBox = view.findViewById(R.id.missed4)

        // Set up listeners for the Fifth CardView
        doctorsRadioButton4.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged5(R.id.Doctors4, isChecked)
        }

        workersRadioButton4.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged5(R.id.workers4, isChecked)
        }

        nursesRadioButton4.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged5(R.id.Narses4, isChecked)
        }

        befPatCheckBox4.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged5(R.id.bef_pat4, isChecked)
        }

        befAseptCheckBox4.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged5(R.id.bef_asept4, isChecked)
        }

        aftBFCheckBox4.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged5(R.id.aft_b_f4, isChecked)
        }

        aftPatCheckBox4.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged5(R.id.aft_pat4, isChecked)
        }

        aftPSurrCheckBox4.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged5(R.id.aft_p_surr4, isChecked)
        }

        hrCheckBox4.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged5(R.id.HR4, isChecked)
        }
        hwCheckBox4.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged5(R.id.HW4, isChecked)
        }
        missedCheckBox4.setOnCheckedChangeListener { _, isChecked ->
            onCheckBoxCheckedChanged5(R.id.missed4, isChecked)
        }
    }

    private fun onCheckBoxCheckedChanged1(id: Int, isChecked: Boolean) {
        val currentCount = dbHelper.getCardViewCount().firstOrNull()
        when (id) {
            R.id.Doctors -> {
                val updatedCount = currentCount?.copy(
                    doctorsCount = currentCount.doctorsCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount1(updatedCount)
                }


                if (isChecked) {
                    // Increment counts for Doctor with Aft and HR
                    val updatedCountWithDoctor = updatedCount?.copy(
                        befPatCount_doctor = updatedCount.befPatCount_doctor + 1,
                        befAseptCount_doctor = updatedCount.befAseptCount_doctor + 1,
                        aftBFCount_doctor = updatedCount.aftBFCount_doctor + 1,
                        aftPatCount_doctor = updatedCount.aftPatCount_doctor + 1,
                        aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor + 1,
                        hrCount_doctor = updatedCount.hrCount_doctor + 1,
                        hwCount_doctor = updatedCount.hwCount_doctor + 1,
                        missedCount_doctor = updatedCount.missedCount_doctor + 1
                    )
                    if (updatedCountWithDoctor != null) {
                        dbHelper.insertOrUpdateCount1(updatedCountWithDoctor)
                    }
                } else {
                    // Copy counts from Doctor to Doctor without Aft and HR
                    val updatedCountWithoutDoctor = updatedCount?.copy(
                        befPatCount = updatedCount.befPatCount_doctor,
                        befAseptCount = updatedCount.befAseptCount_doctor,
                        aftBFCount_doctor = updatedCount.aftBFCount_doctor,
                        aftPatCount_doctor = updatedCount.aftPatCount_doctor,
                        aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor,
                        hrCount_doctor = updatedCount.hrCount_doctor,
                        hwCount_doctor = updatedCount.hwCount_doctor,
                        missedCount_doctor = updatedCount.missedCount_doctor
                    )
                    if (updatedCountWithoutDoctor != null) {
                        dbHelper.insertOrUpdateCount1(updatedCountWithoutDoctor)
                    }
                }
            }

            R.id.Narses -> {
                val updatedCount = currentCount?.copy(
                    nursesCount = currentCount.nursesCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount1(updatedCount)

                }
                if (isChecked) {
                    val updatedCountWithNurses = updatedCount?.copy(
                        befPatCount_nurses = updatedCount.befPatCount_nurses + 1,
                        befAseptCount_nurses = updatedCount.befAseptCount_nurses + 1,
                        aftBFCount_nurses = updatedCount.aftBFCount_nurses + 1,
                        aftPatCount_nurses = updatedCount.aftPatCount_nurses + 1,
                        aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses + 1,
                        hrCount_nurses = updatedCount.hrCount_nurses + 1,
                        hwCount_nurses = updatedCount.hwCount_nurses + 1,
                        missedCount_nurses = updatedCount.missedCount_nurses + 1
                    )
                    if (updatedCountWithNurses != null) {
                        dbHelper.insertOrUpdateCount1(updatedCountWithNurses)

                    }
                } else {
                    val updatedCountWithoutNurese = updatedCount?.copy(
                        befPatCount_nurses = updatedCount.befPatCount_nurses,
                        befAseptCount_nurses = updatedCount.befAseptCount_nurses,
                        aftBFCount_nurses = updatedCount.aftBFCount_nurses,
                        aftPatCount_nurses = updatedCount.aftPatCount_nurses,
                        aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses,
                        hrCount_nurses = updatedCount.hrCount_nurses,
                        hwCount_nurses = updatedCount.hwCount_nurses,
                        missedCount_nurses = updatedCount.missedCount_nurses
                    )
                    if (updatedCountWithoutNurese != null) {
                        dbHelper.insertOrUpdateCount1(updatedCountWithoutNurese)

                    }
                }
            }

            R.id.workers -> {
                val updatedCount = currentCount?.copy(
                    workersCount = currentCount.workersCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount1(updatedCount)
                    updatedCountList.add(updatedCount)
                }
                if (isChecked) {
                    val updatedCountWithWorker = updatedCount?.copy(
                        befPatCount_workers = updatedCount.befPatCount_workers + 1,
                        befAseptCount_workers = updatedCount.befAseptCount_workers + 1,
                        aftBFCount_workers = updatedCount.aftBFCount_workers + 1,
                        aftPatCount_workers = updatedCount.aftPatCount_workers + 1,
                        aftPSurrCount_workers = updatedCount.aftPSurrCount_workers + 1,
                        hrCount_workers = updatedCount.hrCount_workers + 1,
                        hwCount_workers = updatedCount.hwCount_workers + 1,
                        missedCount_workers = updatedCount.missedCount_workers + 1
                    )
                    if (updatedCountWithWorker != null) {
                        dbHelper.insertOrUpdateCount1(updatedCountWithWorker)
                    }
                } else {
                    val updatedCountWithoutWorker = updatedCount?.copy(
                        befPatCount_workers = updatedCount.befPatCount_workers,
                        befAseptCount_workers = updatedCount.befAseptCount_workers,
                        aftBFCount_workers = updatedCount.aftBFCount_workers,
                        aftPatCount_workers = updatedCount.aftPatCount_workers,
                        aftPSurrCount_workers = updatedCount.aftPSurrCount_workers,
                        hrCount_workers = updatedCount.hrCount_workers,
                        hwCount_workers = updatedCount.hwCount_workers,
                        missedCount_workers = updatedCount.missedCount_workers
                    )
                    if (updatedCountWithoutWorker != null) {
                        dbHelper.insertOrUpdateCount1(updatedCountWithoutWorker)
                    }
                }
            }

            R.id.bef_pat -> {
                val updatedCount = currentCount?.copy(
                    befPatCount = currentCount.befPatCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount1(updatedCount)
                }
            }

            R.id.bef_asept -> {
                val updatedCount = currentCount?.copy(
                    befAseptCount = currentCount.befAseptCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount1(updatedCount)
                }
            }

            R.id.aft_b_f -> {
                val updatedCount = currentCount?.copy(
                    aftBFCount = currentCount.aftBFCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount1(updatedCount)
                }
            }

            R.id.aft_pat -> {
                val updatedCount = currentCount?.copy(
                    aftPatCount = currentCount.aftPatCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount1(updatedCount)
                }
            }

            R.id.aft_p_surr -> {
                val updatedCount = currentCount?.copy(
                    aftPSurrCount = currentCount.aftPSurrCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount1(updatedCount)

                }
            }

            R.id.missed -> {
                val updatedCount = currentCount?.copy(
                    missedCount = currentCount.missedCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount1(updatedCount)

                }
            }

            R.id.HR -> {
                val updatedCount = currentCount?.copy(
                    hrCount = currentCount.hrCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount1(updatedCount)

                }
            }

            R.id.HW -> {
                val updatedCount = currentCount?.copy(
                    hwCount = currentCount.hwCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount1(updatedCount)
                }
            }
        }
        Toast.makeText(requireContext(), "Data saved successfully", Toast.LENGTH_SHORT).show()

    }

    private fun onCheckBoxCheckedChanged2(id: Int, isChecked: Boolean) {
        val currentCount = dbHelper.getCardViewCount2().firstOrNull()
        when (id) {
            R.id.Doctors1 -> {
                val updatedCount = currentCount?.copy(
                    doctorsCount = currentCount.doctorsCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount2(updatedCount)
                    updatedCountList.add(updatedCount)
                }


                if (isChecked) {
                    // Increment counts for Doctor with Aft and HR
                    val updatedCountWithDoctor = updatedCount?.copy(
                        befPatCount_doctor = updatedCount.befPatCount_doctor + 1,
                        befAseptCount_doctor = updatedCount.befAseptCount_doctor + 1,
                        aftBFCount_doctor = updatedCount.aftBFCount_doctor + 1,
                        aftPatCount_doctor = updatedCount.aftPatCount_doctor + 1,
                        aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor + 1,
                        hrCount_doctor = updatedCount.hrCount_doctor + 1,
                        hwCount_doctor = updatedCount.hwCount_doctor + 1,
                        missedCount_doctor = updatedCount.missedCount_doctor + 1
                    )
                    if (updatedCountWithDoctor != null) {
                        dbHelper.insertOrUpdateCount2(updatedCountWithDoctor)
                        updatedCountList.add(updatedCountWithDoctor)
                    }
                } else {
                    // Copy counts from Doctor to Doctor without Aft and HR
                    val updatedCountWithoutDoctor = updatedCount?.copy(
                        befPatCount = updatedCount.befPatCount_doctor,
                        befAseptCount = updatedCount.befAseptCount_doctor,
                        aftBFCount_doctor = updatedCount.aftBFCount_doctor,
                        aftPatCount_doctor = updatedCount.aftPatCount_doctor,
                        aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor,
                        hrCount_doctor = updatedCount.hrCount_doctor,
                        hwCount_doctor = updatedCount.hwCount_doctor,
                        missedCount_doctor = updatedCount.missedCount_doctor
                    )
                    if (updatedCountWithoutDoctor != null) {
                        dbHelper.insertOrUpdateCount2(updatedCountWithoutDoctor)
                        updatedCountList.add(updatedCountWithoutDoctor)

                    }
                }
            }

            R.id.Narses1 -> {
                val updatedCount = currentCount?.copy(
                    nursesCount = currentCount.nursesCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount2(updatedCount)
                    updatedCountList.add(updatedCount)
                }
                if (isChecked) {
                    val updatedCountWithNurses = updatedCount?.copy(
                        befPatCount_nurses = updatedCount.befPatCount_nurses + 1,
                        befAseptCount_nurses = updatedCount.befAseptCount_nurses + 1,
                        aftBFCount_nurses = updatedCount.aftBFCount_nurses + 1,
                        aftPatCount_nurses = updatedCount.aftPatCount_nurses + 1,
                        aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses + 1,
                        hrCount_nurses = updatedCount.hrCount_nurses + 1,
                        hwCount_nurses = updatedCount.hwCount_nurses + 1,
                        missedCount_nurses = updatedCount.missedCount_nurses + 1
                    )
                    if (updatedCountWithNurses != null) {
                        dbHelper.insertOrUpdateCount2(updatedCountWithNurses)
                        updatedCountList.add(updatedCountWithNurses)
                    }
                } else {
                    val updatedCountWithoutNurese = updatedCount?.copy(
                        befPatCount_nurses = updatedCount.befPatCount_nurses,
                        befAseptCount_nurses = updatedCount.befAseptCount_nurses,
                        aftBFCount_nurses = updatedCount.aftBFCount_nurses,
                        aftPatCount_nurses = updatedCount.aftPatCount_nurses,
                        aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses,
                        hrCount_nurses = updatedCount.hrCount_nurses,
                        hwCount_nurses = updatedCount.hwCount_nurses,
                        missedCount_nurses = updatedCount.missedCount_nurses
                    )
                    if (updatedCountWithoutNurese != null) {
                        dbHelper.insertOrUpdateCount2(updatedCountWithoutNurese)
                        updatedCountList.add(updatedCountWithoutNurese)

                    }
                }
            }

            R.id.workers1 -> {
                val updatedCount = currentCount?.copy(
                    workersCount = currentCount.workersCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount2(updatedCount)
                    updatedCountList.add(updatedCount)
                }
                if (isChecked) {
                    val updatedCountWithWorker = updatedCount?.copy(
                        befPatCount_workers = updatedCount.befPatCount_workers + 1,
                        befAseptCount_workers = updatedCount.befAseptCount_workers + 1,
                        aftBFCount_workers = updatedCount.aftBFCount_workers + 1,
                        aftPatCount_workers = updatedCount.aftPatCount_workers + 1,
                        aftPSurrCount_workers = updatedCount.aftPSurrCount_workers + 1,
                        hrCount_workers = updatedCount.hrCount_workers + 1,
                        hwCount_workers = updatedCount.hwCount_workers + 1,
                        missedCount_workers = updatedCount.missedCount_workers + 1
                    )
                    if (updatedCountWithWorker != null) {
                        dbHelper.insertOrUpdateCount2(updatedCountWithWorker)
                        updatedCountList.add(updatedCountWithWorker)

                    }
                } else {
                    val updatedCountWithoutWorker = updatedCount?.copy(
                        befPatCount_workers = updatedCount.befPatCount_workers,
                        befAseptCount_workers = updatedCount.befAseptCount_workers,
                        aftBFCount_workers = updatedCount.aftBFCount_workers,
                        aftPatCount_workers = updatedCount.aftPatCount_workers,
                        aftPSurrCount_workers = updatedCount.aftPSurrCount_workers,
                        hrCount_workers = updatedCount.hrCount_workers,
                        hwCount_workers = updatedCount.hwCount_workers,
                        missedCount_workers = updatedCount.missedCount_workers
                    )
                    if (updatedCountWithoutWorker != null) {
                        dbHelper.insertOrUpdateCount2(updatedCountWithoutWorker)
                        updatedCountList.add(updatedCountWithoutWorker)

                    }
                }
            }

            R.id.bef_pat1 -> {
                val updatedCount = currentCount?.copy(
                    befPatCount = currentCount.befPatCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount2(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.bef_asept1 -> {
                val updatedCount = currentCount?.copy(
                    befAseptCount = currentCount.befAseptCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount2(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_b_f1 -> {
                val updatedCount = currentCount?.copy(
                    aftBFCount = currentCount.aftBFCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount2(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_pat1 -> {
                val updatedCount = currentCount?.copy(
                    aftPatCount = currentCount.aftPatCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount2(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_p_surr1 -> {
                val updatedCount = currentCount?.copy(
                    aftPSurrCount = currentCount.aftPSurrCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount2(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.missed1 -> {
                val updatedCount = currentCount?.copy(
                    missedCount = currentCount.missedCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount2(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.HR1 -> {
                val updatedCount = currentCount?.copy(
                    hrCount = currentCount.hrCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount2(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.HW1 -> {
                val updatedCount = currentCount?.copy(
                    hwCount = currentCount.hwCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount2(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }
        }
    }

    private fun onCheckBoxCheckedChanged3(id: Int, isChecked: Boolean) {
        val currentCount = dbHelper.getCardViewCount3().firstOrNull()
        when (id) {
            R.id.Doctors2 -> {
                val updatedCount = currentCount?.copy(
                    doctorsCount = currentCount.doctorsCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount3(updatedCount)
                    updatedCountList.add(updatedCount)


                }


                if (isChecked) {
                    // Increment counts for Doctor with Aft and HR
                    val updatedCountWithDoctor = updatedCount?.copy(
                        befPatCount_doctor = updatedCount.befPatCount_doctor + 1,
                        befAseptCount_doctor = updatedCount.befAseptCount_doctor + 1,
                        aftBFCount_doctor = updatedCount.aftBFCount_doctor + 1,
                        aftPatCount_doctor = updatedCount.aftPatCount_doctor + 1,
                        aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor + 1,
                        hrCount_doctor = updatedCount.hrCount_doctor + 1,
                        hwCount_doctor = updatedCount.hwCount_doctor + 1,
                        missedCount_doctor = updatedCount.missedCount_doctor + 1
                    )
                    if (updatedCountWithDoctor != null) {
                        dbHelper.insertOrUpdateCount3(updatedCountWithDoctor)
                        updatedCountList.add(updatedCountWithDoctor)

                    }
                } else {
                    // Copy counts from Doctor to Doctor without Aft and HR
                    val updatedCountWithoutDoctor = updatedCount?.copy(
                        befPatCount = updatedCount.befPatCount_doctor,
                        befAseptCount = updatedCount.befAseptCount_doctor,
                        aftBFCount_doctor = updatedCount.aftBFCount_doctor,
                        aftPatCount_doctor = updatedCount.aftPatCount_doctor,
                        aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor,
                        hrCount_doctor = updatedCount.hrCount_doctor,
                        hwCount_doctor = updatedCount.hwCount_doctor,
                        missedCount_doctor = updatedCount.missedCount_doctor
                    )
                    if (updatedCountWithoutDoctor != null) {
                        dbHelper.insertOrUpdateCount3(updatedCountWithoutDoctor)
                        updatedCountList.add(updatedCountWithoutDoctor)

                    }
                }
            }

            R.id.Narses2 -> {
                val updatedCount = currentCount?.copy(
                    nursesCount = currentCount.nursesCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount3(updatedCount)
                    updatedCountList.add(updatedCount)


                }
                if (isChecked) {
                    val updatedCountWithNurses = updatedCount?.copy(
                        befPatCount_nurses = updatedCount.befPatCount_nurses + 1,
                        befAseptCount_nurses = updatedCount.befAseptCount_nurses + 1,
                        aftBFCount_nurses = updatedCount.aftBFCount_nurses + 1,
                        aftPatCount_nurses = updatedCount.aftPatCount_nurses + 1,
                        aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses + 1,
                        hrCount_nurses = updatedCount.hrCount_nurses + 1,
                        hwCount_nurses = updatedCount.hwCount_nurses + 1,
                        missedCount_nurses = updatedCount.missedCount_nurses + 1
                    )
                    if (updatedCountWithNurses != null) {
                        dbHelper.insertOrUpdateCount3(updatedCountWithNurses)
                        updatedCountList.add(updatedCountWithNurses)

                    }
                } else {
                    val updatedCountWithoutNurese = updatedCount?.copy(
                        befPatCount_nurses = updatedCount.befPatCount_nurses,
                        befAseptCount_nurses = updatedCount.befAseptCount_nurses,
                        aftBFCount_nurses = updatedCount.aftBFCount_nurses,
                        aftPatCount_nurses = updatedCount.aftPatCount_nurses,
                        aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses,
                        hrCount_nurses = updatedCount.hrCount_nurses,
                        hwCount_nurses = updatedCount.hwCount_nurses,
                        missedCount_nurses = updatedCount.missedCount_nurses
                    )
                    if (updatedCountWithoutNurese != null) {
                        dbHelper.insertOrUpdateCount3(updatedCountWithoutNurese)
                        updatedCountList.add(updatedCountWithoutNurese)


                    }
                }
            }

            R.id.workers2 -> {
                val updatedCount = currentCount?.copy(
                    workersCount = currentCount.workersCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount3(updatedCount)
                    updatedCountList.add(updatedCount)
                }
                if (isChecked) {
                    val updatedCountWithWorker = updatedCount?.copy(
                        befPatCount_workers = updatedCount.befPatCount_workers + 1,
                        befAseptCount_workers = updatedCount.befAseptCount_workers + 1,
                        aftBFCount_workers = updatedCount.aftBFCount_workers + 1,
                        aftPatCount_workers = updatedCount.aftPatCount_workers + 1,
                        aftPSurrCount_workers = updatedCount.aftPSurrCount_workers + 1,
                        hrCount_workers = updatedCount.hrCount_workers + 1,
                        hwCount_workers = updatedCount.hwCount_workers + 1,
                        missedCount_workers = updatedCount.missedCount_workers + 1
                    )
                    if (updatedCountWithWorker != null) {
                        dbHelper.insertOrUpdateCount3(updatedCountWithWorker)
                        updatedCountList.add(updatedCountWithWorker)

                    }
                } else {
                    val updatedCountWithoutWorker = updatedCount?.copy(
                        befPatCount_workers = updatedCount.befPatCount_workers,
                        befAseptCount_workers = updatedCount.befAseptCount_workers,
                        aftBFCount_workers = updatedCount.aftBFCount_workers,
                        aftPatCount_workers = updatedCount.aftPatCount_workers,
                        aftPSurrCount_workers = updatedCount.aftPSurrCount_workers,
                        hrCount_workers = updatedCount.hrCount_workers,
                        hwCount_workers = updatedCount.hwCount_workers,
                        missedCount_workers = updatedCount.missedCount_workers
                    )
                    if (updatedCountWithoutWorker != null) {
                        dbHelper.insertOrUpdateCount3(updatedCountWithoutWorker)
                        updatedCountList.add(updatedCountWithoutWorker)

                    }
                }
            }

            R.id.bef_pat2 -> {
                val updatedCount = currentCount?.copy(
                    befPatCount = currentCount.befPatCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount3(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.bef_asept2 -> {
                val updatedCount = currentCount?.copy(
                    befAseptCount = currentCount.befAseptCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount3(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_b_f2 -> {
                val updatedCount = currentCount?.copy(
                    aftBFCount = currentCount.aftBFCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount3(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_pat2 -> {
                val updatedCount = currentCount?.copy(
                    aftPatCount = currentCount.aftPatCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount3(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_p_surr2 -> {
                val updatedCount = currentCount?.copy(
                    aftPSurrCount = currentCount.aftPSurrCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount3(updatedCount)
                    updatedCountList.add(updatedCount)


                }
            }

            R.id.missed2 -> {
                val updatedCount = currentCount?.copy(
                    missedCount = currentCount.missedCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount3(updatedCount)
                    updatedCountList.add(updatedCount)


                }
            }

            R.id.HR2 -> {
                val updatedCount = currentCount?.copy(
                    hrCount = currentCount.hrCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount3(updatedCount)
                    updatedCountList.add(updatedCount)


                }
            }

            R.id.HW2 -> {
                val updatedCount = currentCount?.copy(
                    hwCount = currentCount.hwCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount3(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }
        }
    }

    private fun onCheckBoxCheckedChanged4(id: Int, isChecked: Boolean) {
        val currentCount = dbHelper.getCardViewCount4().firstOrNull()
        when (id) {
            R.id.Doctors3 -> {
                val updatedCount = currentCount?.copy(
                    doctorsCount = currentCount.doctorsCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount4(updatedCount)
                    updatedCountList.add(updatedCount)

                }


                if (isChecked) {
                    // Increment counts for Doctor with Aft and HR
                    val updatedCountWithDoctor = updatedCount?.copy(
                        befPatCount_doctor = updatedCount.befPatCount_doctor + 1,
                        befAseptCount_doctor = updatedCount.befAseptCount_doctor + 1,
                        aftBFCount_doctor = updatedCount.aftBFCount_doctor + 1,
                        aftPatCount_doctor = updatedCount.aftPatCount_doctor + 1,
                        aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor + 1,
                        hrCount_doctor = updatedCount.hrCount_doctor + 1,
                        hwCount_doctor = updatedCount.hwCount_doctor + 1,
                        missedCount_doctor = updatedCount.missedCount_doctor + 1
                    )
                    if (updatedCountWithDoctor != null) {
                        dbHelper.insertOrUpdateCount4(updatedCountWithDoctor)
                        updatedCountList.add(updatedCountWithDoctor)

                    }
                } else {
                    // Copy counts from Doctor to Doctor without Aft and HR
                    val updatedCountWithoutDoctor = updatedCount?.copy(
                        befPatCount = updatedCount.befPatCount_doctor,
                        befAseptCount = updatedCount.befAseptCount_doctor,
                        aftBFCount_doctor = updatedCount.aftBFCount_doctor,
                        aftPatCount_doctor = updatedCount.aftPatCount_doctor,
                        aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor,
                        hrCount_doctor = updatedCount.hrCount_doctor,
                        hwCount_doctor = updatedCount.hwCount_doctor,
                        missedCount_doctor = updatedCount.missedCount_doctor
                    )
                    if (updatedCountWithoutDoctor != null) {
                        dbHelper.insertOrUpdateCount4(updatedCountWithoutDoctor)
                        updatedCountList.add(updatedCountWithoutDoctor)

                    }
                }
            }

            R.id.Narses3 -> {
                val updatedCount = currentCount?.copy(
                    nursesCount = currentCount.nursesCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount4(updatedCount)
                    updatedCountList.add(updatedCount)


                }
                if (isChecked) {
                    val updatedCountWithNurses = updatedCount?.copy(
                        befPatCount_nurses = updatedCount.befPatCount_nurses + 1,
                        befAseptCount_nurses = updatedCount.befAseptCount_nurses + 1,
                        aftBFCount_nurses = updatedCount.aftBFCount_nurses + 1,
                        aftPatCount_nurses = updatedCount.aftPatCount_nurses + 1,
                        aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses + 1,
                        hrCount_nurses = updatedCount.hrCount_nurses + 1,
                        hwCount_nurses = updatedCount.hwCount_nurses + 1,
                        missedCount_nurses = updatedCount.missedCount_nurses + 1
                    )
                    if (updatedCountWithNurses != null) {
                        dbHelper.insertOrUpdateCount4(updatedCountWithNurses)
                        updatedCountList.add(updatedCountWithNurses)


                    }
                } else {
                    val updatedCountWithoutNurese = updatedCount?.copy(
                        befPatCount_nurses = updatedCount.befPatCount_nurses,
                        befAseptCount_nurses = updatedCount.befAseptCount_nurses,
                        aftBFCount_nurses = updatedCount.aftBFCount_nurses,
                        aftPatCount_nurses = updatedCount.aftPatCount_nurses,
                        aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses,
                        hrCount_nurses = updatedCount.hrCount_nurses,
                        hwCount_nurses = updatedCount.hwCount_nurses,
                        missedCount_nurses = updatedCount.missedCount_nurses
                    )
                    if (updatedCountWithoutNurese != null) {
                        dbHelper.insertOrUpdateCount4(updatedCountWithoutNurese)
                        updatedCountList.add(updatedCountWithoutNurese)


                    }
                }
            }

            R.id.workers3 -> {
                val updatedCount = currentCount?.copy(
                    workersCount = currentCount.workersCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount4(updatedCount)
                    updatedCountList.add(updatedCount)
                }
                if (isChecked) {
                    val updatedCountWithWorker = updatedCount?.copy(
                        befPatCount_workers = updatedCount.befPatCount_workers + 1,
                        befAseptCount_workers = updatedCount.befAseptCount_workers + 1,
                        aftBFCount_workers = updatedCount.aftBFCount_workers + 1,
                        aftPatCount_workers = updatedCount.aftPatCount_workers + 1,
                        aftPSurrCount_workers = updatedCount.aftPSurrCount_workers + 1,
                        hrCount_workers = updatedCount.hrCount_workers + 1,
                        hwCount_workers = updatedCount.hwCount_workers + 1,
                        missedCount_workers = updatedCount.missedCount_workers + 1
                    )
                    if (updatedCountWithWorker != null) {
                        dbHelper.insertOrUpdateCount4(updatedCountWithWorker)
                        updatedCountList.add(updatedCountWithWorker)

                    }
                } else {
                    val updatedCountWithoutWorker = updatedCount?.copy(
                        befPatCount_workers = updatedCount.befPatCount_workers,
                        befAseptCount_workers = updatedCount.befAseptCount_workers,
                        aftBFCount_workers = updatedCount.aftBFCount_workers,
                        aftPatCount_workers = updatedCount.aftPatCount_workers,
                        aftPSurrCount_workers = updatedCount.aftPSurrCount_workers,
                        hrCount_workers = updatedCount.hrCount_workers,
                        hwCount_workers = updatedCount.hwCount_workers,
                        missedCount_workers = updatedCount.missedCount_workers
                    )
                    if (updatedCountWithoutWorker != null) {
                        dbHelper.insertOrUpdateCount4(updatedCountWithoutWorker)
                        updatedCountList.add(updatedCountWithoutWorker)

                    }
                }
            }

            R.id.bef_pat3 -> {
                val updatedCount = currentCount?.copy(
                    befPatCount = currentCount.befPatCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount4(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.bef_asept3 -> {
                val updatedCount = currentCount?.copy(
                    befAseptCount = currentCount.befAseptCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount4(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_b_f3 -> {
                val updatedCount = currentCount?.copy(
                    aftBFCount = currentCount.aftBFCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount4(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_pat3 -> {
                val updatedCount = currentCount?.copy(
                    aftPatCount = currentCount.aftPatCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount4(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_p_surr3 -> {
                val updatedCount = currentCount?.copy(
                    aftPSurrCount = currentCount.aftPSurrCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount4(updatedCount)
                    updatedCountList.add(updatedCount)


                }
            }

            R.id.missed3 -> {
                val updatedCount = currentCount?.copy(
                    missedCount = currentCount.missedCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount4(updatedCount)
                    updatedCountList.add(updatedCount)


                }
            }

            R.id.HR3 -> {
                val updatedCount = currentCount?.copy(
                    hrCount = currentCount.hrCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount4(updatedCount)
                    updatedCountList.add(updatedCount)


                }
            }

            R.id.HW3 -> {
                val updatedCount = currentCount?.copy(
                    hwCount = currentCount.hwCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount4(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }
        }
    }

    private fun onCheckBoxCheckedChanged5(id: Int, isChecked: Boolean) {
        val currentCount = dbHelper.getCardViewCount5().firstOrNull()
        when (id) {
            R.id.Doctors4 -> {
                val updatedCount = currentCount?.copy(
                    doctorsCount = currentCount.doctorsCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount5(updatedCount)
                    updatedCountList.add(updatedCount)

                }


                if (isChecked) {
                    // Increment counts for Doctor with Aft and HR
                    val updatedCountWithDoctor = updatedCount?.copy(
                        befPatCount_doctor = updatedCount.befPatCount_doctor + 1,
                        befAseptCount_doctor = updatedCount.befAseptCount_doctor + 1,
                        aftBFCount_doctor = updatedCount.aftBFCount_doctor + 1,
                        aftPatCount_doctor = updatedCount.aftPatCount_doctor + 1,
                        aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor + 1,
                        hrCount_doctor = updatedCount.hrCount_doctor + 1,
                        hwCount_doctor = updatedCount.hwCount_doctor + 1,
                        missedCount_doctor = updatedCount.missedCount_doctor + 1
                    )
                    if (updatedCountWithDoctor != null) {
                        dbHelper.insertOrUpdateCount5(updatedCountWithDoctor)
                        updatedCountList.add(updatedCountWithDoctor)

                    }
                } else {
                    // Copy counts from Doctor to Doctor without Aft and HR
                    val updatedCountWithoutDoctor = updatedCount?.copy(
                        befPatCount = updatedCount.befPatCount_doctor,
                        befAseptCount = updatedCount.befAseptCount_doctor,
                        aftBFCount_doctor = updatedCount.aftBFCount_doctor,
                        aftPatCount_doctor = updatedCount.aftPatCount_doctor,
                        aftPSurrCount_doctor = updatedCount.aftPSurrCount_doctor,
                        hrCount_doctor = updatedCount.hrCount_doctor,
                        hwCount_doctor = updatedCount.hwCount_doctor,
                        missedCount_doctor = updatedCount.missedCount_doctor
                    )
                    if (updatedCountWithoutDoctor != null) {
                        dbHelper.insertOrUpdateCount5(updatedCountWithoutDoctor)
                        updatedCountList.add(updatedCountWithoutDoctor)

                    }
                }
            }

            R.id.Narses4 -> {
                val updatedCount = currentCount?.copy(
                    nursesCount = currentCount.nursesCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount5(updatedCount)
                    updatedCountList.add(updatedCount)


                }
                if (isChecked) {
                    val updatedCountWithNurses = updatedCount?.copy(
                        befPatCount_nurses = updatedCount.befPatCount_nurses + 1,
                        befAseptCount_nurses = updatedCount.befAseptCount_nurses + 1,
                        aftBFCount_nurses = updatedCount.aftBFCount_nurses + 1,
                        aftPatCount_nurses = updatedCount.aftPatCount_nurses + 1,
                        aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses + 1,
                        hrCount_nurses = updatedCount.hrCount_nurses + 1,
                        hwCount_nurses = updatedCount.hwCount_nurses + 1,
                        missedCount_nurses = updatedCount.missedCount_nurses + 1
                    )
                    if (updatedCountWithNurses != null) {
                        dbHelper.insertOrUpdateCount5(updatedCountWithNurses)
                        updatedCountList.add(updatedCountWithNurses)


                    }
                } else {
                    val updatedCountWithoutNurese = updatedCount?.copy(
                        befPatCount_nurses = updatedCount.befPatCount_nurses,
                        befAseptCount_nurses = updatedCount.befAseptCount_nurses,
                        aftBFCount_nurses = updatedCount.aftBFCount_nurses,
                        aftPatCount_nurses = updatedCount.aftPatCount_nurses,
                        aftPSurrCount_nurses = updatedCount.aftPSurrCount_nurses,
                        hrCount_nurses = updatedCount.hrCount_nurses,
                        hwCount_nurses = updatedCount.hwCount_nurses,
                        missedCount_nurses = updatedCount.missedCount_nurses
                    )
                    if (updatedCountWithoutNurese != null) {
                        dbHelper.insertOrUpdateCount5(updatedCountWithoutNurese)
                        updatedCountList.add(updatedCountWithoutNurese)


                    }
                }
            }

            R.id.workers4 -> {
                val updatedCount = currentCount?.copy(
                    workersCount = currentCount.workersCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount5(updatedCount)
                    updatedCountList.add(updatedCount)
                }
                if (isChecked) {
                    val updatedCountWithWorker = updatedCount?.copy(
                        befPatCount_workers = updatedCount.befPatCount_workers + 1,
                        befAseptCount_workers = updatedCount.befAseptCount_workers + 1,
                        aftBFCount_workers = updatedCount.aftBFCount_workers + 1,
                        aftPatCount_workers = updatedCount.aftPatCount_workers + 1,
                        aftPSurrCount_workers = updatedCount.aftPSurrCount_workers + 1,
                        hrCount_workers = updatedCount.hrCount_workers + 1,
                        hwCount_workers = updatedCount.hwCount_workers + 1,
                        missedCount_workers = updatedCount.missedCount_workers + 1
                    )
                    if (updatedCountWithWorker != null) {
                        dbHelper.insertOrUpdateCount5(updatedCountWithWorker)
                        updatedCountList.add(updatedCountWithWorker)

                    }
                } else {
                    val updatedCountWithoutWorker = updatedCount?.copy(
                        befPatCount_workers = updatedCount.befPatCount_workers,
                        befAseptCount_workers = updatedCount.befAseptCount_workers,
                        aftBFCount_workers = updatedCount.aftBFCount_workers,
                        aftPatCount_workers = updatedCount.aftPatCount_workers,
                        aftPSurrCount_workers = updatedCount.aftPSurrCount_workers,
                        hrCount_workers = updatedCount.hrCount_workers,
                        hwCount_workers = updatedCount.hwCount_workers,
                        missedCount_workers = updatedCount.missedCount_workers
                    )
                    if (updatedCountWithoutWorker != null) {
                        dbHelper.insertOrUpdateCount5(updatedCountWithoutWorker)
                        updatedCountList.add(updatedCountWithoutWorker)

                    }
                }
            }

            R.id.bef_pat4 -> {
                val updatedCount = currentCount?.copy(
                    befPatCount = currentCount.befPatCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount5(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.bef_asept -> {
                val updatedCount = currentCount?.copy(
                    befAseptCount = currentCount.befAseptCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount5(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_b_f4 -> {
                val updatedCount = currentCount?.copy(
                    aftBFCount = currentCount.aftBFCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount5(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_pat4 -> {
                val updatedCount = currentCount?.copy(
                    aftPatCount = currentCount.aftPatCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount5(updatedCount)
                    updatedCountList.add(updatedCount)

                }
            }

            R.id.aft_p_surr4 -> {
                val updatedCount = currentCount?.copy(
                    aftPSurrCount = currentCount.aftPSurrCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount5(updatedCount)
                    updatedCountList.add(updatedCount)
                }
            }

            R.id.missed4 -> {
                val updatedCount = currentCount?.copy(
                    missedCount = currentCount.missedCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount5(updatedCount)
                    updatedCountList.add(updatedCount)
                }
            }

            R.id.HR4 -> {
                val updatedCount = currentCount?.copy(
                    hrCount = currentCount.hrCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount5(updatedCount)
                    updatedCountList.add(updatedCount)
                }
            }

            R.id.HW4 -> {
                val updatedCount = currentCount?.copy(
                    hwCount = currentCount.hwCount + if (isChecked) 1 else 0
                )
                if (updatedCount != null) {
                    dbHelper.insertOrUpdateCount5(updatedCount)
                    updatedCountList.add(updatedCount)
                }
            }
        }
    }


    private fun handleSaveClearButtonClick() {
        // Calculate values based on selected options
        // Save the values to the local database
        //   saveValuesToDatabase(doctorsValue, workersValue, nursesValue)
        // Insert all the updated counts saved during checkbox changes
//        for (updatedCount in updatedCountList) {
//            dbHelper.insertOrUpdateCount1(updatedCount)
//            dbHelper.insertOrUpdateCount2(updatedCount)
//            dbHelper.insertOrUpdateCount3(updatedCount)
//            dbHelper.insertOrUpdateCount4(updatedCount)
//            dbHelper.insertOrUpdateCount5(updatedCount)
//        }
//        // Clear the list after saving
//        updatedCountList.clear()






        // Clear UI selections
        clearUISelections()
    }



    private fun clearUISelections() {
        // Clear the selections in RadioGroups, CheckBoxes, or any other UI elements
        // For example, if you have a RadioGroup named radioGroup, you can clear it using:
        val radioGroup: RadioGroup = requireView().findViewById(R.id.radioGroup)
        radioGroup.clearCheck()
        val radioGroup1: RadioGroup = requireView().findViewById(R.id.radioGroup1)
        radioGroup1.clearCheck()
        val radioGroup2: RadioGroup = requireView().findViewById(R.id.radioGroup2)
        radioGroup2.clearCheck()
        val radioGroup3: RadioGroup = requireView().findViewById(R.id.radioGroup3)
        radioGroup3.clearCheck()
        val radioGroup4: RadioGroup = requireView().findViewById(R.id.radioGroup4)
        radioGroup4.clearCheck()

        val befPatCheckBox: CheckBox = requireView().findViewById(R.id.bef_pat)
        val befAseptCheckBox: CheckBox = requireView().findViewById(R.id.bef_asept)
        val aftBFCheckBox: CheckBox = requireView().findViewById(R.id.aft_b_f)
        val aftPatCheckBox: CheckBox = requireView().findViewById(R.id.aft_pat)
        val aftPSurrCheckBox: CheckBox = requireView().findViewById(R.id.aft_p_surr)

        val hrCheckBox: CheckBox = requireView().findViewById(R.id.HR)
        val hwCheckBox: CheckBox = requireView().findViewById(R.id.HW)
        val missedCheckBox: CheckBox = requireView().findViewById(R.id.missed)

        val befPatCheckBox1: CheckBox = requireView().findViewById(R.id.bef_pat1)
        val befAseptCheckBox1: CheckBox = requireView().findViewById(R.id.bef_asept1)
        val aftBFCheckBox1: CheckBox = requireView().findViewById(R.id.aft_b_f1)
        val aftPatCheckBox1: CheckBox = requireView().findViewById(R.id.aft_pat1)
        val aftPSurrCheckBox1: CheckBox = requireView().findViewById(R.id.aft_p_surr1)

        val hrCheckBox1: CheckBox = requireView().findViewById(R.id.HR1)
        val hwCheckBox1: CheckBox = requireView().findViewById(R.id.HW1)
        val missedCheckBox1: CheckBox = requireView().findViewById(R.id.missed1)

        val befPatCheckBox2: CheckBox = requireView().findViewById(R.id.bef_pat2)
        val befAseptCheckBox2: CheckBox = requireView().findViewById(R.id.bef_asept2)
        val aftBFCheckBox2: CheckBox = requireView().findViewById(R.id.aft_b_f2)
        val aftPatCheckBox2: CheckBox = requireView().findViewById(R.id.aft_pat2)
        val aftPSurrCheckBox2: CheckBox = requireView().findViewById(R.id.aft_p_surr2)

        val hrCheckBox2: CheckBox = requireView().findViewById(R.id.HR2)
        val hwCheckBox2: CheckBox = requireView().findViewById(R.id.HW2)
        val missedCheckBox2: CheckBox = requireView().findViewById(R.id.missed2)

        val befPatCheckBox3: CheckBox = requireView().findViewById(R.id.bef_pat3)
        val befAseptCheckBox3: CheckBox = requireView().findViewById(R.id.bef_asept3)
        val aftBFCheckBox3: CheckBox = requireView().findViewById(R.id.aft_b_f3)
        val aftPatCheckBox3: CheckBox = requireView().findViewById(R.id.aft_pat3)
        val aftPSurrCheckBox3: CheckBox = requireView().findViewById(R.id.aft_p_surr3)

        val hrCheckBox3: CheckBox = requireView().findViewById(R.id.HR3)
        val hwCheckBox3: CheckBox = requireView().findViewById(R.id.HW3)
        val missedCheckBox3: CheckBox = requireView().findViewById(R.id.missed3)

        val befPatCheckBox4: CheckBox = requireView().findViewById(R.id.bef_pat4)
        val befAseptCheckBox4: CheckBox = requireView().findViewById(R.id.bef_asept4)
        val aftBFCheckBox4: CheckBox = requireView().findViewById(R.id.aft_b_f4)
        val aftPatCheckBox4: CheckBox = requireView().findViewById(R.id.aft_pat4)
        val aftPSurrCheckBox4: CheckBox = requireView().findViewById(R.id.aft_p_surr4)

        val hrCheckBox4: CheckBox = requireView().findViewById(R.id.HR4)
        val hwCheckBox4: CheckBox = requireView().findViewById(R.id.HW4)
        val missedCheckBox4: CheckBox = requireView().findViewById(R.id.missed4)

        clearCheckBoxes(
            befPatCheckBox,
            befAseptCheckBox,
            aftBFCheckBox,
            aftPatCheckBox,
            aftPSurrCheckBox,
            hrCheckBox,
            hwCheckBox,
            missedCheckBox,
            befPatCheckBox1,
            befAseptCheckBox1,
            aftBFCheckBox1,
            aftPatCheckBox1,
            aftPSurrCheckBox1,
            hrCheckBox1,
            hwCheckBox1,
            missedCheckBox1,
            befPatCheckBox2,
            befAseptCheckBox2,
            aftBFCheckBox2,
            aftPatCheckBox2,
            aftPSurrCheckBox2,
            hrCheckBox2,
            hwCheckBox2,
            missedCheckBox2,
            befPatCheckBox3,
            befAseptCheckBox3,
            aftBFCheckBox3,
            aftPatCheckBox3,
            aftPSurrCheckBox3,
            hrCheckBox3,
            hwCheckBox3,
            missedCheckBox3,
            befPatCheckBox4,
            befAseptCheckBox4,
            aftBFCheckBox4,
            aftPatCheckBox4,
            aftPSurrCheckBox4,
            hrCheckBox4,
            hwCheckBox4,
            missedCheckBox4
        )
    }

    fun clearCheckBoxes(vararg checkBoxes: CheckBox) {
        checkBoxes.forEach { it.isChecked = false }
    }

}

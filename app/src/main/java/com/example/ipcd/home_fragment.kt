package com.example.ipcd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlin.properties.Delegates

class home_fragment : Fragment() {
    private lateinit var viewModel: CardViewModel1
    private lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_home_fragment, container, false)

        // Find the CardView in the layout
        val cardView: CardView = rootView.findViewById(R.id.cardView2)



        val saveClearButton: Button = rootView.findViewById(R.id.buttonSaveClear)
        saveClearButton.setOnClickListener {
         //   viewModel.onSaveClearButtonClick()
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
        // ... add other CheckBoxes for the first CardView

        // Set up listeners for the first CardView
        doctorsRadioButton.setOnCheckedChangeListener { _, isChecked ->
            viewModel.onCheckBoxCheckedChanged(R.id.Doctors, isChecked)
        }

        workersRadioButton.setOnCheckedChangeListener { _, isChecked ->
            viewModel.onCheckBoxCheckedChanged(R.id.workers, isChecked)
        }

        nursesRadioButton.setOnCheckedChangeListener { _, isChecked ->
            viewModel.onCheckBoxCheckedChanged(R.id.Narses, isChecked)
        }

        befPatCheckBox.setOnCheckedChangeListener { _, isChecked ->
            viewModel.onCheckBoxCheckedChanged(R.id.bef_pat, isChecked)
        }

        befAseptCheckBox.setOnCheckedChangeListener { _, isChecked ->
            viewModel.onCheckBoxCheckedChanged(R.id.bef_asept, isChecked)
        }


        // Add similar code for other RadioGroups and CheckBoxes
    }

    private fun handleSaveClearButtonClick() {
        // Calculate values based on selected options
        val doctorsValue = viewModel.getDoctorsValue()
        val workersValue = viewModel.getWorkersValue()
        val nursesValue = viewModel.getNursesValue()

        // Save the values to the local database
     //   saveValuesToDatabase(doctorsValue, workersValue, nursesValue)

        // Clear UI selections
        clearUISelections()
    }

    private fun clearUISelections() {
        // Clear the selections in RadioGroups, CheckBoxes, or any other UI elements
        // For example, if you have a RadioGroup named radioGroup, you can clear it using:
        val radioGroup: RadioGroup = requireView().findViewById(R.id.radioGroup)
        radioGroup.clearCheck()

        // Similarly, clear other UI elements as needed
    }
}

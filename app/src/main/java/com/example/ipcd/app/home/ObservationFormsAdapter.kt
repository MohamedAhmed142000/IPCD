package com.example.ipcd.app.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
import androidx.core.view.forEach
import androidx.core.view.forEachIndexed
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.ipcd.data.ObservationForm
import com.example.ipcd.data.Type
import com.example.ipcd.databinding.ItemObservationFormBinding

class ObservationFormsAdapter(
    private val context: Context,
    private val onTypeClickListener: OnTypeClickListener,
    private val onAnswerClickListener: OnAnswerClickListener,
    private val isReport: Boolean,
) :
    ListAdapter<ObservationForm, ObservationFormsAdapter.ViewHolder>(ObservationFormDiffCallback()) {

    class ViewHolder(private val binding: ItemObservationFormBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private fun disableOtherButtonswhenselectmissed(checkBox: CheckBox) {
            binding.chipGroup.forEach { view ->
                if (view is CheckBox && view != checkBox) {
                    view.isEnabled = false
                    view.isChecked=false
                }
            }
        }
        private fun disableOtherthefirstfiveelements(clickedCheckBox: CheckBox, observationForm: ObservationForm, disable: Boolean) {
            binding.chipGroup.forEachIndexed { index, view ->
                if (view is CheckBox) {
                    // Check if it's within the first five elements
                    val isWithinFirstFive = index < 5
                    if (isWithinFirstFive && view != clickedCheckBox) {
                        view.isChecked = !disable
                        // You might also want to uncheck it, depends on your logic
                        // view.isChecked = false
                    }
                }
            }
        }
        private fun disableHRandHWButtons(clickedCheckBox: CheckBox, observationForm: ObservationForm, disable: Boolean) {
            binding.chipGroup.forEachIndexed { index, view ->
                if (view is CheckBox) {
                    // Check if it's within the HR and HW  elements
                    val isWithinHRElement = index == 5
                    val isWithinHWElement = index == 6
                    if (isWithinHRElement && view != clickedCheckBox) {
                        view.isChecked = !disable
                        // You might also want to uncheck it, depends on your logic
                        // view.isChecked = false
                    }else if (isWithinHWElement&&view!=clickedCheckBox){
                        view.isChecked = !disable

                    }
                }
            }
        }
        fun bind(
            observationForm: ObservationForm,
            onTypeClickListener: OnTypeClickListener,
            onAnswerClickListener: OnAnswerClickListener,
            isReport: Boolean,
            context: Context,
        ) {
            binding.observationForm = observationForm
            binding.isReport = isReport
            binding.executePendingBindings()

            binding.radioGroup.removeAllViews()
            observationForm.types.forEach {
                binding.radioGroup.addView(RadioButton(context).apply {
                    id = it.getId()
                    text = it.name
                    isEnabled = !isReport
                    isChecked = observationForm.selectedType == it
                })
            }

            if (!isReport) {
                binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
                    onTypeClickListener.onClick(
                        observationForm.id,
                        Type.entries.first { it.getId() == checkedId })
                }
            } else {
                binding.radioGroup.setOnCheckedChangeListener(null)
            }

            var lastselectedCheckBox: CheckBox? = null
            binding.chipGroup.removeAllViews()
            observationForm.answers.forEachIndexed { answerIndex, answer ->
                val isLastElement = answerIndex == observationForm.answers.size - 1
                val isWithinFirstFive = answerIndex < 5
                val isWithinHRElement = answerIndex == 5
                val isWithinHWElement = answerIndex == 6
                val checkBox = CheckBox(context).apply {
                    id = answer.id
                    text = answer.text
                    isEnabled = !isReport
                    isChecked = observationForm.selectedAnswers.contains(answer)

                    if (!isReport) {
                        setOnCheckedChangeListener { _, isChecked ->
                            onAnswerClickListener.onClick(observationForm.id, isChecked, answer)
                            if (isChecked) {
                                // Deselect the last selected radio button if it's not the last element
                                if (!isLastElement && lastselectedCheckBox != null) {
                                    lastselectedCheckBox?.isChecked = false
                                }
                            }
                            // Disable other radio buttons if this is the last element
                            if (isLastElement) {
                                disableOtherButtonswhenselectmissed(this)
                            }
                            if (isWithinFirstFive && isChecked) {
                                disableOtherthefirstfiveelements(this, observationForm, true)
                            }
                            if (isWithinHRElement && isChecked||isWithinHWElement&&isChecked) {
                                disableHRandHWButtons(this, observationForm, true)
                            }

                        }
                    } else {
                        setOnCheckedChangeListener(null)
                    }
                }
                binding.chipGroup.addView(checkBox)
            }
        }



        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemObservationFormBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(
            getItem(position),
            onTypeClickListener,
            onAnswerClickListener,
            isReport,
            context
        )
    }
}

class ObservationFormDiffCallback : DiffUtil.ItemCallback<ObservationForm>() {
    override fun areItemsTheSame(
        oldItem: ObservationForm,
        newItem: ObservationForm
    ): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(
        oldItem: ObservationForm,
        newItem: ObservationForm
    ): Boolean {
        return oldItem.id == newItem.id
    }
}

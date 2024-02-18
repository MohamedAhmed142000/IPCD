package com.example.ipcd.app.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
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

            binding.chipGroup.removeAllViews()
            observationForm.answers.forEach {
                binding.chipGroup.addView(CheckBox(context).apply {
                    id = it.id
                    text = it.text
                    isEnabled = !isReport
                    isChecked = observationForm.selectedAnswers.contains(it)

                    if (!isReport) {
                        setOnCheckedChangeListener { _, isChecked ->
                            onAnswerClickListener.onClick(observationForm.id, isChecked, it)
                        }
                    } else {
                        setOnCheckedChangeListener(null)
                    }
                })
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

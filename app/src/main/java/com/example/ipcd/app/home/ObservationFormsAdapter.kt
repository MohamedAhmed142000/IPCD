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
import com.example.ipcd.databinding.ItemObservationFormBinding

class ObservationFormsAdapter(private val context: Context) :
    ListAdapter<ObservationForm, ObservationFormsAdapter.ViewHolder>(ObservationFormDiffCallback()) {

    class ViewHolder(private val binding: ItemObservationFormBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(
            observationForm: ObservationForm,
            context: Context,
        ) {
            binding.observationForm = observationForm
            binding.executePendingBindings()

            observationForm.types.forEach {
                binding.radioGroup.addView(RadioButton(context).apply {
                    id = it.getId()
                    text = it.name
                })
            }

            observationForm.answers.forEach {
                binding.chipGroup.addView(CheckBox(context).apply {
                    id = it.id
                    text = it.text
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
        holder.bind(getItem(position), context)
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

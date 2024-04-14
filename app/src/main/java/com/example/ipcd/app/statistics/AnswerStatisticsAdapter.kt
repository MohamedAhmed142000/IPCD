package com.example.ipcd.app.statistics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.ipcd.data.AnswerStatistics
import com.example.ipcd.databinding.ItemAnswerStatisticsBinding

class AnswerStatisticsAdapter :
    ListAdapter<AnswerStatistics, AnswerStatisticsAdapter.ViewHolder>(AnswerStatisticsDiffCallback()) {

    class ViewHolder(private val binding: ItemAnswerStatisticsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(
            answerStatistics: AnswerStatistics,
            isLastItem: Boolean
        ) {
            binding.item = answerStatistics
            binding.isLastItem = isLastItem
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemAnswerStatisticsBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val isLastItem = position == itemCount - 1
        holder.bind(getItem(position), isLastItem)
    }
}

class AnswerStatisticsDiffCallback : DiffUtil.ItemCallback<AnswerStatistics>() {
    override fun areItemsTheSame(
        oldItem: AnswerStatistics,
        newItem: AnswerStatistics
    ): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(
        oldItem: AnswerStatistics,
        newItem: AnswerStatistics
    ): Boolean {
        return oldItem.answerId == newItem.answerId
    }
}
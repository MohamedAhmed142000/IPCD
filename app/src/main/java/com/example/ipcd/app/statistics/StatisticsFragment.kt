package com.example.ipcd.app.statistics

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.lifecycle.ViewModelProvider
import com.example.ipcd.data.Type
import com.example.ipcd.databinding.FragmentStatisticsBinding
import java.util.Calendar

class StatisticsFragment : Fragment() {

    private val statisticsViewModel by lazy { ViewModelProvider(this)[StatisticsViewModel::class.java] }

    private lateinit var answerStatisticsAdapter: AnswerStatisticsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentStatisticsBinding.inflate(inflater, container, false)
        binding.viewModel = statisticsViewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.executePendingBindings()

        answerStatisticsAdapter = AnswerStatisticsAdapter()
        binding.recyclerView.adapter = answerStatisticsAdapter

        val calender = Calendar.getInstance()
        val cYear = calender.get(Calendar.YEAR)
        val cMonth = calender.get(Calendar.MONTH)
        val cDay = calender.get(Calendar.DAY_OF_MONTH)

        val startDateDialog = DatePickerDialog(
            requireContext(),
            { _, year, monthOfYear, dayOfMonth ->
                calender.set(Calendar.YEAR, year)
                calender.set(Calendar.MONTH, monthOfYear)
                calender.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                statisticsViewModel.updateStartDate(calender.time)
            },
            cYear,
            cMonth,
            cDay
        )
        binding.textViewStartDate.setOnClickListener { startDateDialog.show() }

        val endDateDialog = DatePickerDialog(
            requireContext(),
            { _, year, monthOfYear, dayOfMonth ->
                calender.set(Calendar.YEAR, year)
                calender.set(Calendar.MONTH, monthOfYear)
                calender.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                statisticsViewModel.updateEndDate(calender.time)
            },
            cYear,
            cMonth,
            cDay
        )
        binding.textViewEndDate.setOnClickListener { endDateDialog.show() }

        statisticsViewModel.answersStatistics.observe(viewLifecycleOwner) {
            if (it != null) {
                answerStatisticsAdapter.submitList(it)
            }
        }

        return binding.root
    }
}
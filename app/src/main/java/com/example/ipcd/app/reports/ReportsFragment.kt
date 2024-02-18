package com.example.ipcd.app.reports

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ipcd.app.home.ObservationFormsAdapter
import com.example.ipcd.app.home.OnAnswerClickListener
import com.example.ipcd.app.home.OnTypeClickListener
import com.example.ipcd.data.Type
import com.example.ipcd.databinding.FragmentReportsBinding
import java.util.Calendar
import java.util.Date


class ReportsFragment : Fragment() {

    private val reportsVideModel by lazy { ViewModelProvider(this)[ReportViewModel::class.java] }

    private lateinit var formsAdapter: ObservationFormsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentReportsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = reportsVideModel
        binding.executePendingBindings()

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

                reportsVideModel.updateStartDate(calender.time)
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

                reportsVideModel.updateEndDate(calender.time)
            },
            cYear,
            cMonth,
            cDay
        )
        binding.textViewEndDate.setOnClickListener { endDateDialog.show() }

        Type.entries.forEach {
            binding.chipGroup.addView(CheckBox(requireContext()).apply {
                id = it.getId()
                text = it.name
                isChecked = true
                setOnCheckedChangeListener { _, isChecked ->
                    reportsVideModel.updateTypesFilters(it, isChecked)
                }
            })
        }

        val onAnswerClickListener = OnAnswerClickListener { _, _, _ -> }
        val onTypeClickListener = OnTypeClickListener { _, _ -> }

        formsAdapter =
            ObservationFormsAdapter(
                requireContext(),
                onTypeClickListener,
                onAnswerClickListener,
                true
            )
        binding.recyclerView.adapter = formsAdapter

        reportsVideModel.observationFormList.observe(viewLifecycleOwner) {
            if (it != null) {
                formsAdapter.submitList(it)
            }
        }

        return binding.root
    }
}
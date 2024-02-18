package com.example.ipcd.app.reports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ipcd.app.home.ObservationFormsAdapter
import com.example.ipcd.app.home.OnAnswerClickListener
import com.example.ipcd.app.home.OnTypeClickListener
import com.example.ipcd.databinding.FragmentReportsBinding


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

        val onAnswerClickListener = OnAnswerClickListener { _, _, _ -> }
        val onTypeClickListener = OnTypeClickListener { _, _ -> }

        formsAdapter =
            ObservationFormsAdapter(requireContext(), onTypeClickListener, onAnswerClickListener, true)
        binding.recyclerView.adapter = formsAdapter

        reportsVideModel.observationFormList.observe(viewLifecycleOwner) {
            if (it != null) {
                formsAdapter.submitList(it)
            }
        }

        return binding.root
    }
}
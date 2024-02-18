package com.example.ipcd.app.reports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ipcd.databinding.FragmentReportsBinding


class ReportsFragment : Fragment() {

    private val reportsVideModel by lazy { ViewModelProvider(this)[ReportViewModel::class.java] }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentReportsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = reportsVideModel
        binding.executePendingBindings()

        return binding.root
    }
}
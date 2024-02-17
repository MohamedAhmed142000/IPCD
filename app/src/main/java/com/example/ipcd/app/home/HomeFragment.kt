package com.example.ipcd.app.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.ipcd.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private val TAG = "HomeFragment"

    private val homeViewModel by lazy { ViewModelProvider(this)[HomeViewModel::class.java] }


    private lateinit var formsAdapter: ObservationFormsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = homeViewModel
        binding.executePendingBindings()

        val onAnswerClickListener = OnAnswerClickListener { formId, isChecked, answer ->
            if (answer != null)
                homeViewModel.updateObservationFormAnswer(formId, answer, isChecked)
        }

        val onTypeClickListener = OnTypeClickListener { formId, type ->
            if (type != null)
                homeViewModel.updateObservationFormType(formId, type)
        }

        formsAdapter =
            ObservationFormsAdapter(requireContext(), onTypeClickListener, onAnswerClickListener)
        binding.recyclerView.adapter = formsAdapter

        homeViewModel.observationFormList.observe(viewLifecycleOwner) {
            if (it != null) {
                formsAdapter.submitList(it)
            }
        }


        return binding.root
    }
}
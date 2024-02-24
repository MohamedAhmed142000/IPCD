package com.example.ipcd.app.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.ipcd.R
import com.example.ipcd.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

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
            ObservationFormsAdapter(
                requireContext(),
                onTypeClickListener,
                onAnswerClickListener,
                false
            )
        binding.recyclerView.adapter = formsAdapter

        homeViewModel.observationFormList.observe(viewLifecycleOwner) {
            if (it != null) {
                formsAdapter.submitList(it)
            }
        }
        homeViewModel.savedSuccess.observe(viewLifecycleOwner) {
            if (it != null && it) {
                Toast.makeText(
                    requireContext(),
                    getString(R.string.message_saved_success), Toast.LENGTH_SHORT
                ).show()

                homeViewModel.resetForms()
                homeViewModel.onSavedSuccessDone()
            }
        }

        return binding.root
    }
}
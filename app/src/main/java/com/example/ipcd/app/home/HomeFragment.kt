package com.example.ipcd.app.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ipcd.data.ObservationForm
import com.example.ipcd.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var formsAdapter: ObservationFormsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.executePendingBindings()

        formsAdapter = ObservationFormsAdapter(requireContext())
        binding.recyclerView.adapter = formsAdapter

        formsAdapter.submitList(ObservationForm.OBSERVATION_FORMS_LIST)

        return binding.root
    }
}
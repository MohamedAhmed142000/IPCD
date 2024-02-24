package com.example.ipcd.app.sheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.ipcd.R
import com.example.ipcd.app.reports.ReportViewModel

class SheetFragment : Fragment() {

    private val sheetViewModel by lazy { ViewModelProvider(this)[SheetViewModel::class.java] }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        val binding= inflater.inflate(R.layout.fragment_sheet, container, false)
        return binding.rootView

    }

}
package com.example.ipcd

import Adapter.UserCountAdapter
import database.IPCDSQLiteOpenHelper
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import data.UserCount



class qr_fragment : Fragment() {

    private lateinit var dbHelper: IPCDSQLiteOpenHelper
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_qr_fragment, container, false)
        dbHelper = IPCDSQLiteOpenHelper(requireContext())

        val showDataButton: Button = view.findViewById(R.id.showDataButton)
        val textViewResult: TextView = view.findViewById(R.id.textViewResult)

        showDataButton.setOnClickListener {

            // جلب البيانات من قاعدة البيانات


             val userCounts = dbHelper.getCardViewCount()

            if (userCounts != null) {
                if (userCounts.isNotEmpty()) {
                    // Convert the list of UserCount objects to a string representation
                    val resultText = StringBuilder()
                    for (userCount in userCounts) {
                        resultText.append("Doctors Count: ${userCount.doctorsCount}\n")
                        resultText.append("Workers Count: ${userCount.workersCount}\n")
                        resultText.append("Nurses Count: ${userCount.nursesCount}\n")
                        // Add more fields as needed
                        resultText.append("\n") // Add a line break between each user count
                    }

                    // Set the resultText to the TextView
                    textViewResult.text = resultText.toString()
                } else {
                    textViewResult.text = "No data available."
                }
            }
            // قم بربط الـ ListView بمحول البيانات
//            val listView = view.findViewById<ListView>(R.id.listView)
//            val adapter = UserCountAdapter(requireActivity(), R.layout.list_item_user_count, userCounts)
//            listView.adapter = adapter

        }


        return view
    }}
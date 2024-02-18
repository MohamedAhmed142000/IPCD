package Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.ipcd.R
import data.UserCount

class UserCountAdapter(context: Context, resource: Int, objects: List<UserCount>) :
ArrayAdapter<UserCount>(context, resource, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item_user_count, parent, false)

        val userCount = getItem(position)

        // قم بتعيين النصوص أو البيانات الأخرى إلى العناصر المناسبة في تخطيط العنصر
        val doctorsCountTextView: TextView = itemView.findViewById(R.id.textViewDoctorsCount)
        doctorsCountTextView.text = "Doctors Count: ${userCount?.doctorsCount}"

        val nursesCountTextView: TextView = itemView.findViewById(R.id.textViewWorkersCount)
        nursesCountTextView.text = "Nurses Count: ${userCount?.nursesCount}"

        val workersCountTextView: TextView = itemView.findViewById(R.id.textViewWorkersCount)
        workersCountTextView.text = "workers Count: ${userCount?.workersCount}"

        val befPatCount: TextView = itemView.findViewById(R.id.textViewbefPatCount)
        befPatCount.text = "befPatCount Count: ${userCount?.befPatCount}"

        val befAseptCount: TextView = itemView.findViewById(R.id.textViewbefAseptCount)
        befAseptCount.text = "befAseptCount Count: ${userCount?.befAseptCount}"

        val aftBFCount: TextView = itemView.findViewById(R.id.textViewaftBFCount)
        aftBFCount.text = "aftBFCount Count: ${userCount?.aftBFCount}"

        val aftPatCount: TextView = itemView.findViewById(R.id.textViewaftPatCount)
        aftPatCount.text = "aftPatCount Count: ${userCount?.aftPatCount}"

        val aftPSurrCount: TextView = itemView.findViewById(R.id.textViewaftPSurrCount)
        aftPSurrCount.text = "Nurses Count: ${userCount?.aftPSurrCount}"

        val hrCount: TextView = itemView.findViewById(R.id.textViewhrCount)
        hrCount.text = "Doctors Count: ${userCount?.hrCount}"

        val hwCount: TextView = itemView.findViewById(R.id.textViewhwCount)
        hwCount.text = "Nurses Count: ${userCount?.hwCount}"

        val missedCount: TextView = itemView.findViewById(R.id.textViewmissedCount)
        missedCount.text = "Doctors Count: ${userCount?.missedCount}"

        val befPatCount_doctor: TextView = itemView.findViewById(R.id.textViewbefPatCount_doctor)
        befPatCount_doctor.text = "befPatCount Count: ${userCount?.befPatCount_doctor}"

        val befAseptCount_doctor: TextView = itemView.findViewById(R.id.textViewbefAseptCount_doctor)
        befAseptCount_doctor.text = "befAseptCount Count: ${userCount?.befAseptCount_doctor}"

        val aftBFCount_doctor: TextView = itemView.findViewById(R.id.textViewaftBFCount_doctor)
        aftBFCount_doctor.text = "aftBFCount Count: ${userCount?.aftBFCount_doctor}"

        val aftPatCount_doctor: TextView = itemView.findViewById(R.id.textViewaftPatCount_doctor)
        aftPatCount_doctor.text = "aftPatCount Count: ${userCount?.aftPatCount_doctor}"

        val aftPSurrCount_doctor: TextView = itemView.findViewById(R.id.textViewaftPSurrCount_doctor)
        aftPSurrCount_doctor.text = "Nurses Count: ${userCount?.aftPSurrCount_doctor}"

        val hrCount_doctor: TextView = itemView.findViewById(R.id.textViewhrCount_doctor)
        hrCount_doctor.text = "Doctors Count: ${userCount?.hrCount_doctor}"

        val hwCount_doctor: TextView = itemView.findViewById(R.id.textViewhwCount_doctor)
        hwCount_doctor.text = "Nurses Count: ${userCount?.hwCount_doctor}"

        val missedCount_doctor: TextView = itemView.findViewById(R.id.textViewmissedCount_doctor)
        missedCount_doctor.text = "Doctors Count: ${userCount?.missedCount_doctor}"

        val befPatCount_nurses: TextView = itemView.findViewById(R.id.textViewbefPatCount_nurses)
        befPatCount_nurses.text = "befPatCount Count: ${userCount?.befPatCount_nurses}"

        val befAseptCount_nurses: TextView = itemView.findViewById(R.id.textViewbefAseptCount_nurses)
        befAseptCount_nurses.text = "befAseptCount Count: ${userCount?.befAseptCount_nurses}"

        val aftBFCount_nurses: TextView = itemView.findViewById(R.id.textViewaftBFCount_nurses)
        aftBFCount_nurses.text = "aftBFCount Count: ${userCount?.aftBFCount_nurses}"

        val aftPatCount_nurses: TextView = itemView.findViewById(R.id.textViewaftPatCount_nurses)
        aftPatCount_nurses.text = "aftPatCount Count: ${userCount?.aftPatCount_nurses}"

        val aftPSurrCount_nurses: TextView = itemView.findViewById(R.id.textViewaftPSurrCount_nurses)
        aftPSurrCount_nurses.text = "Nurses Count: ${userCount?.aftPSurrCount_nurses}"

        val hrCount_nurses: TextView = itemView.findViewById(R.id.textViewhrCount_nurses)
        hrCount_nurses.text = "Doctors Count: ${userCount?.hrCount_nurses}"

        val hwCount_nurses: TextView = itemView.findViewById(R.id.textViewhwCount_nurses)
        hwCount_nurses.text = "Nurses Count: ${userCount?.hwCount_nurses}"

        val missedCount_nurses: TextView = itemView.findViewById(R.id.textViewmissedCount_nurses)
        missedCount_nurses.text = "Doctors Count: ${userCount?.missedCount_nurses}"

        val befPatCount_workers: TextView = itemView.findViewById(R.id.textViewbefPatCount_workers)
        befPatCount_workers.text = "befPatCount Count: ${userCount?.befPatCount_workers}"

        val befAseptCount_workers: TextView = itemView.findViewById(R.id.textViewbefAseptCount_workers)
        befAseptCount_workers.text = "befAseptCount Count: ${userCount?.befAseptCount_workers}"

        val aftBFCount_workers: TextView = itemView.findViewById(R.id.textViewaftBFCount_workers)
        aftBFCount_workers.text = "aftBFCount Count: ${userCount?.aftBFCount_workers}"

        val aftPatCount_workers: TextView = itemView.findViewById(R.id.textViewaftPatCount_workers)
        aftPatCount_workers.text = "aftPatCount Count: ${userCount?.aftPatCount_workers}"

        val aftPSurrCount_workers: TextView = itemView.findViewById(R.id.textViewaftPSurrCount_workers)
        aftPSurrCount_workers.text = "Nurses Count: ${userCount?.aftPSurrCount_workers}"

        val hrCount_workers: TextView = itemView.findViewById(R.id.textViewhrCount_workers)
        hrCount_workers.text = "Doctors Count: ${userCount?.hrCount_workers}"

        val hwCount_workers: TextView = itemView.findViewById(R.id.textViewhwCount_workers)
        hwCount_workers.text = "Nurses Count: ${userCount?.hwCount_workers}"

        val missedCount_workers: TextView = itemView.findViewById(R.id.textViewmissedCount_workers)
        missedCount_workers.text = "Doctors Count: ${userCount?.missedCount_workers}"

        // قم بتكرار هذا لبقية البيانات

        return itemView
    }
}
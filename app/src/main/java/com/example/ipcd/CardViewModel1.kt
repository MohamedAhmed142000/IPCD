package com.example.ipcd
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CardViewModel1 : ViewModel() {

    private val doctorsValue = MutableLiveData<Int>()
    private val workersValue = MutableLiveData<Int>()
    private val nursesValue = MutableLiveData<Int>()

    // Getter methods for LiveData
    fun getDoctorsValue(): LiveData<Int> = doctorsValue
    fun getWorkersValue(): LiveData<Int> = workersValue
    fun getNursesValue(): LiveData<Int> = nursesValue

    // Setter methods for updating LiveData
    fun setDoctorsValue(value: Int) {
        doctorsValue.value = value
    }

    fun setWorkersValue(value: Int) {
        workersValue.value = value
    }

    fun setNursesValue(value: Int) {
        nursesValue.value = value
    }
    var isHRChecked: Int = 0
    var isHWChecked: Int = 0
    var isMissedChecked: Int = 0
    var isBefPatChecked: Int = 0
    var isBefAseptChecked: Int = 0
    var isAftBFChecked: Int = 0
    var isAftPatChecked: Int = 0
    var isAftPSurrChecked: Int = 0

//    fun onRadioGroupClicked(profCategory: String) {
//        selectedProfCategory = profCategory
//    }
//
//    fun onRadioOptionSelected(option: String) {
//        _selectedRadioOption.value = option
//        _doctorsValue.value = if (option == "Doctors") 1 else 0
//        _workersValue.value = if (option == "workers") 1 else 0
//        _nursesValue.value = if (option == "Nerses") 1 else 0
//    }


    fun onCheckBoxCheckedChanged(id: Int, isChecked: Boolean) {
        when (id) {
            // Update isHRChecked, isHWChecked, etc., based on checkbox changes
            R.id.HR -> isHRChecked = if (isChecked) 1 else 0
            R.id.HW -> isHWChecked = if (isChecked) 1 else 0
            R.id.missed -> isMissedChecked = if (isChecked) 1 else 0
            R.id.bef_pat -> isBefPatChecked = if (isChecked) 1 else 0
            R.id.bef_asept -> isBefAseptChecked = if (isChecked) 1 else 0
            R.id.aft_b_f -> isAftBFChecked = if (isChecked) 1 else 0
            R.id.aft_pat -> isAftPatChecked = if (isChecked) 1 else 0
            R.id.aft_p_surr -> isAftPSurrChecked = if (isChecked) 1 else 0
            // Add more checkboxes as needed
        }
    }




    fun saveDataToDatabase() {
        // Replace this with your actual database interaction logic
        // For example, you might create a YourEntity object and save it using a DAO
        // yourDao.insert(YourEntity(doctorsValue.value, workersValue.value, nursesValue.value))
    }
    // Define a data class to hold CheckBox values
    data class CheckBoxValues(
        val hrChecked: Int,
        val hwChecked: Int,
        val missedChecked: Int,
        val befPatChecked: Int,
        val befAseptChecked: Int,
        val aftBFChecked: Int,
        val aftPatChecked: Int,
        val aftPSurrChecked: Int
        // Add other properties as needed
    )
}

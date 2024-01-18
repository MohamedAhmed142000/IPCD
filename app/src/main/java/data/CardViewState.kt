package data

data class CardViewState(
    val isDoctorsSelected: Boolean,
    val isWorkersSelected: Boolean,
    val isNursesSelected: Boolean,
    val isHRChecked: Int,
    val isHWChecked: Int,
    val isMissedChecked: Int,
    val isBefPatChecked: Int,
    val isBefAseptChecked: Int,
    val isAftBFChecked: Int,
    val isAftPatChecked: Int,
    val isAftPSurrChecked: Int
)

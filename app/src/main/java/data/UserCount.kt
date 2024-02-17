package data

import android.database.Cursor

data class UserCount(

    var doctorsCount: Int=0,
    var workersCount: Int=0,
    var nursesCount: Int=0,
    var befPatCount: Int=0,
    var befAseptCount: Int=0,
    var aftBFCount: Int=0,
    var aftPatCount: Int=0,
    var aftPSurrCount: Int=0,
    var befPatCount_doctor: Int=0,
    var befAseptCount_doctor: Int=0,
    var aftBFCount_doctor: Int=0,
    var aftPatCount_doctor: Int=0,
    var aftPSurrCount_doctor: Int=0,
    var befPatCount_nurses: Int=0,
    var befAseptCount_nurses: Int=0,
    var aftBFCount_nurses: Int=0,
    var aftPatCount_nurses: Int=0,
    var aftPSurrCount_nurses: Int=0,
    var befPatCount_workers: Int=0,
    var befAseptCount_workers: Int=0,
    var aftBFCount_workers: Int=0,
    var aftPatCount_workers: Int=0,
    var aftPSurrCount_workers: Int=0,
    var hrCount: Int=0,
    var hwCount: Int=0,
    var missedCount: Int=0,
    var hrCount_doctor: Int=0,
    var hwCount_doctor: Int=0,
    var missedCount_doctor: Int=0,
    var hrCount_nurses: Int=0,
    var hwCount_nurses: Int=0,
    var missedCount_nurses: Int=0,
    var hrCount_workers: Int=0,
    var hwCount_workers: Int=0,
    var missedCount_workers: Int=0
)// {
//
//    companion object {
//        fun fromCursor(cursor: Cursor): UserCount {
//            return UserCount(
//                doctorsCount =  getColumnValue(cursor,"doctorsCount"),
//                workersCount =  getColumnValue(cursor,"workersCount"),
//                nursesCount =  getColumnValue(cursor,"nursesCount"),
//                befPatCount =  getColumnValue(cursor,"befPatCount"),
//                befAseptCount =  getColumnValue(cursor,"befAseptCount"),
//                aftBFCount =  getColumnValue(cursor,"aftBFCount"),
//                aftPatCount =  getColumnValue(cursor,"aftPatCount"),
//                aftPSurrCount =  getColumnValue(cursor,"aftPSurrCount"),
//                befPatCount_doctor =  getColumnValue(cursor,"befPatCount_doctor"),
//                befAseptCount_doctor =  getColumnValue(cursor,"befAseptCount_doctor"),
//                aftBFCount_doctor =  getColumnValue(cursor,"aftBFCount_doctor"),
//                aftPatCount_doctor =  getColumnValue(cursor,"aftPatCount_doctor"),
//                aftPSurrCount_doctor =  getColumnValue(cursor,"aftPSurrCount_doctor"),
//                befPatCount_nurses =  getColumnValue(cursor,"befPatCount_nurses"),
//                befAseptCount_nurses =  getColumnValue(cursor,"befAseptCount_nurses"),
//                aftBFCount_nurses =  getColumnValue(cursor,"aftBFCount_nurses"),
//                aftPatCount_nurses =  getColumnValue(cursor,"aftPatCount_nurses"),
//                aftPSurrCount_nurses =  getColumnValue(cursor,"aftPSurrCount_nurses"),
//                befPatCount_workers =  getColumnValue(cursor,"befPatCount_workers"),
//                befAseptCount_workers =  getColumnValue(cursor,"befAseptCount_workers"),
//                aftBFCount_workers =  getColumnValue(cursor,"aftBFCount_workers"),
//                aftPatCount_workers =  getColumnValue(cursor,"aftPatCount_workers"),
//                aftPSurrCount_workers =  getColumnValue(cursor,"aftPSurrCount_workers"),
//                hrCount =  getColumnValue(cursor,"hrCount"),
//                hwCount =  getColumnValue(cursor,"hwCount"),
//                missedCount =  getColumnValue(cursor,"missedCount"),
//                hrCount_doctor =  getColumnValue(cursor,"hrCount_doctor"),
//                hwCount_doctor =  getColumnValue(cursor,"hwCount_doctor"),
//                missedCount_doctor =  getColumnValue(cursor,"missedCount_doctor"),
//                hrCount_nurses =  getColumnValue(cursor,"hrCount_nurses"),
//                hwCount_nurses =  getColumnValue(cursor,"hwCount_nurses"),
//                missedCount_nurses =  getColumnValue(cursor,"missedCount_nurses"),
//                hrCount_workers = getColumnValue(cursor,"hrCount_workers"),
//                hwCount_workers =  getColumnValue(cursor,"hrCount_workers"),
//                missedCount_workers =  getColumnValue(cursor,"missedCount_workers"),
//
//            )
//        }
//        private fun getColumnValue(cursor: Cursor, columnName: String): Int {
//            val columnIndex = cursor.getColumnIndex(columnName)
//            return if (columnIndex != -1) cursor.getInt(columnIndex) else 0
//        }
//    }
//}

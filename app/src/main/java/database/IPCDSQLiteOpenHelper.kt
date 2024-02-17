package database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns
import android.util.Log
import data.UserCount


object DatabaseContract {
    object CardView1 {
        const val TABLE_CARD_VIEW_1 = "CardView1"
        const val COLUMN_doctorsCount = "doctorsCount"
        const val COLUMN_workersCount = "workersCount"
        const val COLUMN_nursesCount = "nursesCount"
        const val COLUMN_befPatCount = "befPatCount"
        const val COLUMN_befAseptCount = "befAseptCount"
        const val COLUMN_aftBFCount = "aftBFCount"
        const val COLUMN_aftPatCount = "aftPatCount"
        const val COLUMN_aftPSurrCount = "aftPSurrCount"
        const val COLUMN_hrCount = "hrCount"
        const val COLUMN_hwCount = "hwCount"
        const val COLUMN_missedCount = "missedCount"
        const val COLUMN_befPatCount_doctor = "befPatCount_doctor"
        const val COLUMN_befAseptCount_doctor = "befAseptCount_doctor"
        const val COLUMN_aftBFCount_doctor = "aftBFCount_doctor"
        const val COLUMN_aftPatCount_doctor = "aftPatCount_doctor"
        const val COLUMN_aftPSurrCount_doctor = "aftPSurrCount_doctor"
        const val COLUMN_hrCount_doctor = "hrCount_doctor"
        const val COLUMN_hwCount_doctor = "hwCount_doctor"
        const val COLUMN_missedCount_doctor = "missedCount_doctor"
        const val COLUMN_befPatCount_nurses = "befPatCount_nurses"
        const val COLUMN_befAseptCount_nurses = "befAseptCount_nurses"
        const val COLUMN_aftBFCount_nurses = "aftBFCount_nurses"
        const val COLUMN_aftPatCount_nurses = "aftPatCount_nurses"
        const val COLUMN_aftPSurrCount_nurses = "aftPSurrCount_nurses"
        const val COLUMN_hrCount_nurses = "hrCount_nurses"
        const val COLUMN_hwCount_nurses = "hwCount_nurses"
        const val COLUMN_missedCount_nurses = "missedCount_nurses"
        const val COLUMN_befPatCount_workers = "befPatCount_workers"
        const val COLUMN_befAseptCount_workers = "befAseptCount_workers"
        const val COLUMN_aftBFCount_workers = "aftBFCount_workers"
        const val COLUMN_aftPatCount_workers = "aftPatCount_workers"
        const val COLUMN_aftPSurrCount_workers = "aftPSurrCount_workers"
        const val COLUMN_hrCount_workers = "hrCount_workers"
        const val COLUMN_hwCount_workers = "hwCount_workers"
        const val COLUMN_missedCount_workers = "missedCount_workers"
    }

    object CardView2 {
        const val TABLE_CARD_VIEW_2 = "CardView2"
        const val COLUMN_doctorsCount = "doctorsCount"
        const val COLUMN_workersCount = "workersCount"
        const val COLUMN_nursesCount = "nursesCount"
        const val COLUMN_befPatCount = "befPatCount"
        const val COLUMN_befAseptCount = "befAseptCount"
        const val COLUMN_aftBFCount = "aftBFCount"
        const val COLUMN_aftPatCount = "aftPatCount"
        const val COLUMN_aftPSurrCount = "aftPSurrCount"
        const val COLUMN_hrCount = "hrCount"
        const val COLUMN_hwCount = "hwCount"
        const val COLUMN_missedCount = "missedCount"
        const val COLUMN_befPatCount_doctor = "befPatCount_doctor"
        const val COLUMN_befAseptCount_doctor = "befAseptCount_doctor"
        const val COLUMN_aftBFCount_doctor = "aftBFCount_doctor"
        const val COLUMN_aftPatCount_doctor = "aftPatCount_doctor"
        const val COLUMN_aftPSurrCount_doctor = "aftPSurrCount_doctor"
        const val COLUMN_hrCount_doctor = "hrCount_doctor"
        const val COLUMN_hwCount_doctor = "hwCount_doctor"
        const val COLUMN_missedCount_doctor = "missedCount_doctor"
        const val COLUMN_befPatCount_nurses = "befPatCount_nurses"
        const val COLUMN_befAseptCount_nurses = "befAseptCount_nurses"
        const val COLUMN_aftBFCount_nurses = "aftBFCount_nurses"
        const val COLUMN_aftPatCount_nurses = "aftPatCount_nurses"
        const val COLUMN_aftPSurrCount_nurses = "aftPSurrCount_nurses"
        const val COLUMN_hrCount_nurses = "hrCount_nurses"
        const val COLUMN_hwCount_nurses = "hwCount_nurses"
        const val COLUMN_missedCount_nurses = "missedCount_nurses"
        const val COLUMN_befPatCount_workers = "befPatCount_workers"
        const val COLUMN_befAseptCount_workers = "befAseptCount_workers"
        const val COLUMN_aftBFCount_workers = "aftBFCount_workers"
        const val COLUMN_aftPatCount_workers = "aftPatCount_workers"
        const val COLUMN_aftPSurrCount_workers = "aftPSurrCount_workers"
        const val COLUMN_hrCount_workers = "hrCount_workers"
        const val COLUMN_hwCount_workers = "hwCount_workers"
        const val COLUMN_missedCount_workers = "missedCount_workers"
    }

    object CardView3 {
        const val TABLE_CARD_VIEW_3 = "CardView3"
        const val COLUMN_doctorsCount = "doctorsCount"
        const val COLUMN_workersCount = "workersCount"
        const val COLUMN_nursesCount = "nursesCount"
        const val COLUMN_befPatCount = "befPatCount"
        const val COLUMN_befAseptCount = "befAseptCount"
        const val COLUMN_aftBFCount = "aftBFCount"
        const val COLUMN_aftPatCount = "aftPatCount"
        const val COLUMN_aftPSurrCount = "aftPSurrCount"
        const val COLUMN_hrCount = "hrCount"
        const val COLUMN_hwCount = "hwCount"
        const val COLUMN_missedCount = "missedCount"
        const val COLUMN_befPatCount_doctor = "befPatCount_doctor"
        const val COLUMN_befAseptCount_doctor = "befAseptCount_doctor"
        const val COLUMN_aftBFCount_doctor = "aftBFCount_doctor"
        const val COLUMN_aftPatCount_doctor = "aftPatCount_doctor"
        const val COLUMN_aftPSurrCount_doctor = "aftPSurrCount_doctor"
        const val COLUMN_hrCount_doctor = "hrCount_doctor"
        const val COLUMN_hwCount_doctor = "hwCount_doctor"
        const val COLUMN_missedCount_doctor = "missedCount_doctor"
        const val COLUMN_befPatCount_nurses = "befPatCount_nurses"
        const val COLUMN_befAseptCount_nurses = "befAseptCount_nurses"
        const val COLUMN_aftBFCount_nurses = "aftBFCount_nurses"
        const val COLUMN_aftPatCount_nurses = "aftPatCount_nurses"
        const val COLUMN_aftPSurrCount_nurses = "aftPSurrCount_nurses"
        const val COLUMN_hrCount_nurses = "hrCount_nurses"
        const val COLUMN_hwCount_nurses = "hwCount_nurses"
        const val COLUMN_missedCount_nurses = "missedCount_nurses"
        const val COLUMN_befPatCount_workers = "befPatCount_workers"
        const val COLUMN_befAseptCount_workers = "befAseptCount_workers"
        const val COLUMN_aftBFCount_workers = "aftBFCount_workers"
        const val COLUMN_aftPatCount_workers = "aftPatCount_workers"
        const val COLUMN_aftPSurrCount_workers = "aftPSurrCount_workers"
        const val COLUMN_hrCount_workers = "hrCount_workers"
        const val COLUMN_hwCount_workers = "hwCount_workers"
        const val COLUMN_missedCount_workers = "missedCount_workers"
    }

    object CardView4 {
        const val TABLE_CARD_VIEW_4 = "CardView4"
        const val COLUMN_doctorsCount = "doctorsCount"
        const val COLUMN_workersCount = "workersCount"
        const val COLUMN_nursesCount = "nursesCount"
        const val COLUMN_befPatCount = "befPatCount"
        const val COLUMN_befAseptCount = "befAseptCount"
        const val COLUMN_aftBFCount = "aftBFCount"
        const val COLUMN_aftPatCount = "aftPatCount"
        const val COLUMN_aftPSurrCount = "aftPSurrCount"
        const val COLUMN_hrCount = "hrCount"
        const val COLUMN_hwCount = "hwCount"
        const val COLUMN_missedCount = "missedCount"
        const val COLUMN_befPatCount_doctor = "befPatCount_doctor"
        const val COLUMN_befAseptCount_doctor = "befAseptCount_doctor"
        const val COLUMN_aftBFCount_doctor = "aftBFCount_doctor"
        const val COLUMN_aftPatCount_doctor = "aftPatCount_doctor"
        const val COLUMN_aftPSurrCount_doctor = "aftPSurrCount_doctor"
        const val COLUMN_hrCount_doctor = "hrCount_doctor"
        const val COLUMN_hwCount_doctor = "hwCount_doctor"
        const val COLUMN_missedCount_doctor = "missedCount_doctor"
        const val COLUMN_befPatCount_nurses = "befPatCount_nurses"
        const val COLUMN_befAseptCount_nurses = "befAseptCount_nurses"
        const val COLUMN_aftBFCount_nurses = "aftBFCount_nurses"
        const val COLUMN_aftPatCount_nurses = "aftPatCount_nurses"
        const val COLUMN_aftPSurrCount_nurses = "aftPSurrCount_nurses"
        const val COLUMN_hrCount_nurses = "hrCount_nurses"
        const val COLUMN_hwCount_nurses = "hwCount_nurses"
        const val COLUMN_missedCount_nurses = "missedCount_nurses"
        const val COLUMN_befPatCount_workers = "befPatCount_workers"
        const val COLUMN_befAseptCount_workers = "befAseptCount_workers"
        const val COLUMN_aftBFCount_workers = "aftBFCount_workers"
        const val COLUMN_aftPatCount_workers = "aftPatCount_workers"
        const val COLUMN_aftPSurrCount_workers = "aftPSurrCount_workers"
        const val COLUMN_hrCount_workers = "hrCount_workers"
        const val COLUMN_hwCount_workers = "hwCount_workers"
        const val COLUMN_missedCount_workers = "missedCount_workers"
    }

    object CardView5 {
        const val TABLE_CARD_VIEW_5 = "CardView5"
        const val COLUMN_doctorsCount = "doctorsCount"
        const val COLUMN_workersCount = "workersCount"
        const val COLUMN_nursesCount = "nursesCount"
        const val COLUMN_befPatCount = "befPatCount"
        const val COLUMN_befAseptCount = "befAseptCount"
        const val COLUMN_aftBFCount = "aftBFCount"
        const val COLUMN_aftPatCount = "aftPatCount"
        const val COLUMN_aftPSurrCount = "aftPSurrCount"
        const val COLUMN_hrCount = "hrCount"
        const val COLUMN_hwCount = "hwCount"
        const val COLUMN_missedCount = "missedCount"
        const val COLUMN_befPatCount_doctor = "befPatCount_doctor"
        const val COLUMN_befAseptCount_doctor = "befAseptCount_doctor"
        const val COLUMN_aftBFCount_doctor = "aftBFCount_doctor"
        const val COLUMN_aftPatCount_doctor = "aftPatCount_doctor"
        const val COLUMN_aftPSurrCount_doctor = "aftPSurrCount_doctor"
        const val COLUMN_hrCount_doctor = "hrCount_doctor"
        const val COLUMN_hwCount_doctor = "hwCount_doctor"
        const val COLUMN_missedCount_doctor = "missedCount_doctor"
        const val COLUMN_befPatCount_nurses = "befPatCount_nurses"
        const val COLUMN_befAseptCount_nurses = "befAseptCount_nurses"
        const val COLUMN_aftBFCount_nurses = "aftBFCount_nurses"
        const val COLUMN_aftPatCount_nurses = "aftPatCount_nurses"
        const val COLUMN_aftPSurrCount_nurses = "aftPSurrCount_nurses"
        const val COLUMN_hrCount_nurses = "hrCount_nurses"
        const val COLUMN_hwCount_nurses = "hwCount_nurses"
        const val COLUMN_missedCount_nurses = "missedCount_nurses"
        const val COLUMN_befPatCount_workers = "befPatCount_workers"
        const val COLUMN_befAseptCount_workers = "befAseptCount_workers"
        const val COLUMN_aftBFCount_workers = "aftBFCount_workers"
        const val COLUMN_aftPatCount_workers = "aftPatCount_workers"
        const val COLUMN_aftPSurrCount_workers = "aftPSurrCount_workers"
        const val COLUMN_hrCount_workers = "hrCount_workers"
        const val COLUMN_hwCount_workers = "hwCount_workers"
        const val COLUMN_missedCount_workers = "missedCount_workers"
    }


    // Add column names and create table SQL statement
}

class IPCDSQLiteOpenHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private fun getDatabaseName(userName: String): String {
            return "user_database_$userName"
        }

        const val DATABASE_VERSION = 2
        const val DATABASE_NAME = "IPCD.db"


        private const val CREATE_TABLE_SQL1 =
            "CREATE TABLE IF NOT EXISTS ${DatabaseContract.CardView1.TABLE_CARD_VIEW_1} (" +
                    "${BaseColumns._ID} INTEGER PRIMARY KEY," +
                    "${DatabaseContract.CardView1.COLUMN_doctorsCount} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_workersCount} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_nursesCount} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_befPatCount} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_befAseptCount} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftBFCount} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftPatCount} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftPSurrCount} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_hrCount} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_hwCount} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_missedCount} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_befPatCount_doctor} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_befAseptCount_doctor} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftBFCount_doctor} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftPatCount_doctor} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftPSurrCount_doctor} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_hrCount_doctor} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_hwCount_doctor} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_missedCount_doctor} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_befPatCount_nurses} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_befAseptCount_nurses} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftBFCount_nurses} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftPatCount_nurses} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftPSurrCount_nurses} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_hrCount_nurses} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_hwCount_nurses} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_missedCount_nurses} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_befPatCount_workers} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_befAseptCount_workers} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftBFCount_workers} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftPatCount_workers} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_aftPSurrCount_workers} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_hrCount_workers} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_hwCount_workers} INTEGER," +
                    "${DatabaseContract.CardView1.COLUMN_missedCount_workers} INTEGER)"

        private const val CREATE_TABLE_SQL2 =
            "CREATE TABLE IF NOT EXISTS ${DatabaseContract.CardView2.TABLE_CARD_VIEW_2} (" +
                    "${BaseColumns._ID} INTEGER PRIMARY KEY, " +
                    "${DatabaseContract.CardView2.COLUMN_doctorsCount} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_workersCount} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_nursesCount} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_befPatCount} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_befAseptCount} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftBFCount} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftPatCount} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftPSurrCount} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_hrCount} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_hwCount} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_missedCount} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_befPatCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_befAseptCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftBFCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftPatCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftPSurrCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_hrCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_hwCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_missedCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_befPatCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_befAseptCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftBFCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftPatCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftPSurrCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_hrCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_hwCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_missedCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_befPatCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_befAseptCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftBFCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftPatCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_aftPSurrCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_hrCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_hwCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView2.COLUMN_missedCount_workers} INTEGER )"

        private const val CREATE_TABLE_SQL3 =
            "CREATE TABLE IF NOT EXISTS ${DatabaseContract.CardView3.TABLE_CARD_VIEW_3} (" +
                    "${BaseColumns._ID} INTEGER PRIMARY KEY, " +
                    "${DatabaseContract.CardView3.COLUMN_doctorsCount} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_workersCount} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_nursesCount} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_befPatCount} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_befAseptCount} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftBFCount} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftPatCount} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftPSurrCount} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_hrCount} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_hwCount} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_missedCount} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_befPatCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_befAseptCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftBFCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftPatCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftPSurrCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_hrCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_hwCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_missedCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_befPatCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_befAseptCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftBFCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftPatCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftPSurrCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_hrCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_hwCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_missedCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_befPatCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_befAseptCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftBFCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftPatCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_aftPSurrCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_hrCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_hwCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView3.COLUMN_missedCount_workers} INTEGER )"

        private const val CREATE_TABLE_SQL4 =
            "CREATE TABLE IF NOT EXISTS ${DatabaseContract.CardView4.TABLE_CARD_VIEW_4} (" +
                    "${BaseColumns._ID} INTEGER PRIMARY KEY, " +
                    "${DatabaseContract.CardView4.COLUMN_doctorsCount} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_workersCount} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_nursesCount} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_befPatCount} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_befAseptCount} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftBFCount} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftPatCount} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftPSurrCount} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_hrCount} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_hwCount} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_missedCount} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_befPatCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_befAseptCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftBFCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftPatCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftPSurrCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_hrCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_hwCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_missedCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_befPatCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_befAseptCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftBFCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftPatCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftPSurrCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_hrCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_hwCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_missedCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_befPatCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_befAseptCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftBFCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftPatCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_aftPSurrCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_hrCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_hwCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView4.COLUMN_missedCount_workers} INTEGER )"

        private const val CREATE_TABLE_SQL5 =
            "CREATE TABLE IF NOT EXISTS ${DatabaseContract.CardView5.TABLE_CARD_VIEW_5} (" +
                    "${BaseColumns._ID} INTEGER PRIMARY KEY, " +
                    "${DatabaseContract.CardView5.COLUMN_doctorsCount} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_workersCount} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_nursesCount} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_befPatCount} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_befAseptCount} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftBFCount} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftPatCount} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftPSurrCount} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_hrCount} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_hwCount} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_missedCount} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_befPatCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_befAseptCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftBFCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftPatCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftPSurrCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_hrCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_hwCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_missedCount_doctor} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_befPatCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_befAseptCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftBFCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftPatCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftPSurrCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_hrCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_hwCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_missedCount_nurses} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_befPatCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_befAseptCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftBFCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftPatCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_aftPSurrCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_hrCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_hwCount_workers} INTEGER, " +
                    "${DatabaseContract.CardView5.COLUMN_missedCount_workers} INTEGER )"


        private const val SQL_DELETE_CARD_VIEW_1 =
            "DROP TABLE IF EXISTS ${DatabaseContract.CardView1.TABLE_CARD_VIEW_1}"
        private const val SQL_DELETE_CARD_VIEW_2 =
            "DROP TABLE IF EXISTS ${DatabaseContract.CardView2.TABLE_CARD_VIEW_2}"
        private const val SQL_DELETE_CARD_VIEW_3 =
            "DROP TABLE IF EXISTS ${DatabaseContract.CardView3.TABLE_CARD_VIEW_3}"
        private const val SQL_DELETE_CARD_VIEW_4 =
            "DROP TABLE IF EXISTS ${DatabaseContract.CardView4.TABLE_CARD_VIEW_4}"
        private const val SQL_DELETE_CARD_VIEW_5 =
            "DROP TABLE IF EXISTS ${DatabaseContract.CardView5.TABLE_CARD_VIEW_5}"

    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTableStatements = listOf(
            CREATE_TABLE_SQL1,
            CREATE_TABLE_SQL2,
            CREATE_TABLE_SQL3,
            CREATE_TABLE_SQL4,
            CREATE_TABLE_SQL5
        )

        createTableStatements.forEach { statement ->
            db?.execSQL(statement)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        // Handle upgrades if needed
        db?.execSQL(SQL_DELETE_CARD_VIEW_1)
        db?.execSQL(SQL_DELETE_CARD_VIEW_2)
        db?.execSQL(SQL_DELETE_CARD_VIEW_3)
        db?.execSQL(SQL_DELETE_CARD_VIEW_4)
        db?.execSQL(SQL_DELETE_CARD_VIEW_5)
        // Create tables again
        onCreate(db)
    }

    fun insertOrUpdateCount1(userCount: UserCount) {
        try {

            val db = writableDatabase
            if (db != null) { // Check if the database is not null
                val contentValues = ContentValues().apply {
                    put(DatabaseContract.CardView1.COLUMN_doctorsCount, userCount.doctorsCount)
                    put(DatabaseContract.CardView1.COLUMN_workersCount, userCount.workersCount)
                    put(DatabaseContract.CardView1.COLUMN_nursesCount, userCount.nursesCount)

                    put(DatabaseContract.CardView1.COLUMN_aftBFCount, userCount.aftBFCount)
                    put(DatabaseContract.CardView1.COLUMN_aftPSurrCount, userCount.aftPSurrCount)
                    put(DatabaseContract.CardView1.COLUMN_befAseptCount, userCount.befAseptCount)
                    put(DatabaseContract.CardView1.COLUMN_befPatCount, userCount.befPatCount)
                    put(DatabaseContract.CardView1.COLUMN_aftPatCount, userCount.aftPatCount)
                    put(DatabaseContract.CardView1.COLUMN_hrCount, userCount.hrCount)
                    put(DatabaseContract.CardView1.COLUMN_hwCount, userCount.hwCount)
                    put(DatabaseContract.CardView1.COLUMN_missedCount, userCount.missedCount)

                    put(
                        DatabaseContract.CardView1.COLUMN_aftBFCount_doctor,
                        userCount.aftBFCount_doctor
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_aftPSurrCount_doctor,
                        userCount.aftPSurrCount_doctor
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_befAseptCount_doctor,
                        userCount.befAseptCount_doctor
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_befPatCount_doctor,
                        userCount.befPatCount_doctor
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_aftPatCount_doctor,
                        userCount.aftPatCount_doctor
                    )
                    put(DatabaseContract.CardView1.COLUMN_hrCount_doctor, userCount.hrCount_doctor)
                    put(DatabaseContract.CardView1.COLUMN_hwCount_doctor, userCount.hwCount_doctor)
                    put(
                        DatabaseContract.CardView1.COLUMN_missedCount_doctor,
                        userCount.missedCount_doctor
                    )

                    put(
                        DatabaseContract.CardView1.COLUMN_aftBFCount_nurses,
                        userCount.aftBFCount_nurses
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_aftPSurrCount_nurses,
                        userCount.aftPSurrCount_nurses
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_befAseptCount_nurses,
                        userCount.befAseptCount_nurses
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_befPatCount_nurses,
                        userCount.befPatCount_nurses
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_aftPatCount_nurses,
                        userCount.aftPatCount_nurses
                    )
                    put(DatabaseContract.CardView1.COLUMN_hrCount_nurses, userCount.hrCount_nurses)
                    put(DatabaseContract.CardView1.COLUMN_hwCount_nurses, userCount.hwCount_nurses)
                    put(
                        DatabaseContract.CardView1.COLUMN_missedCount_nurses,
                        userCount.missedCount_nurses
                    )

                    put(
                        DatabaseContract.CardView1.COLUMN_aftBFCount_workers,
                        userCount.aftBFCount_workers
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_aftPSurrCount_workers,
                        userCount.aftPSurrCount_workers
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_befAseptCount_workers,
                        userCount.befAseptCount_workers
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_befPatCount_workers,
                        userCount.befPatCount_workers
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_aftPatCount_workers,
                        userCount.aftPatCount_workers
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_hrCount_workers,
                        userCount.hrCount_workers
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_hwCount_workers,
                        userCount.hwCount_workers
                    )
                    put(
                        DatabaseContract.CardView1.COLUMN_missedCount_workers,
                        userCount.missedCount_workers
                    )

                    Log.d("InsertData", "Doctors Count: ${userCount.doctorsCount}")
                    Log.d("InsertData", "Workers Count: ${userCount.workersCount}")

                }
                val newRowId = db.insert(
                    DatabaseContract.CardView1.TABLE_CARD_VIEW_1,
                    null,
                    contentValues
                )
                // Log the insertion result or any relevant information
                Log.d("InsertData", "New row ID: $newRowId")

            } else {
                // Database is null, handle the error
                Log.e("InsertData", "Writable database is null")
            }
        } catch (e: Exception) {
            // Log any exceptions or error messages
            Log.e("InsertData", "Error inserting or updating data: ${e.message}")
        }
    }

    fun insertOrUpdateCount2(userCount: UserCount) {
        val db = writableDatabase
        val contentValues = ContentValues().apply {
            put(DatabaseContract.CardView2.COLUMN_doctorsCount, userCount.doctorsCount)
            put(DatabaseContract.CardView2.COLUMN_workersCount, userCount.workersCount)
            put(DatabaseContract.CardView2.COLUMN_nursesCount, userCount.nursesCount)

            put(DatabaseContract.CardView2.COLUMN_aftBFCount, userCount.aftBFCount)
            put(DatabaseContract.CardView2.COLUMN_aftPSurrCount, userCount.aftPSurrCount)
            put(DatabaseContract.CardView2.COLUMN_befAseptCount, userCount.befAseptCount)
            put(DatabaseContract.CardView2.COLUMN_befPatCount, userCount.befPatCount)
            put(DatabaseContract.CardView2.COLUMN_aftPatCount, userCount.aftPatCount)
            put(DatabaseContract.CardView2.COLUMN_hrCount, userCount.hrCount)
            put(DatabaseContract.CardView2.COLUMN_hwCount, userCount.hwCount)
            put(DatabaseContract.CardView2.COLUMN_missedCount, userCount.missedCount)

            put(DatabaseContract.CardView2.COLUMN_aftBFCount_doctor, userCount.aftBFCount_doctor)
            put(
                DatabaseContract.CardView2.COLUMN_aftPSurrCount_doctor,
                userCount.aftPSurrCount_doctor
            )
            put(
                DatabaseContract.CardView2.COLUMN_befAseptCount_doctor,
                userCount.befAseptCount_doctor
            )
            put(DatabaseContract.CardView2.COLUMN_befPatCount_doctor, userCount.befPatCount_doctor)
            put(DatabaseContract.CardView2.COLUMN_aftPatCount_doctor, userCount.aftPatCount_doctor)
            put(DatabaseContract.CardView2.COLUMN_hrCount_doctor, userCount.hrCount_doctor)
            put(DatabaseContract.CardView2.COLUMN_hwCount_doctor, userCount.hwCount_doctor)
            put(DatabaseContract.CardView2.COLUMN_missedCount_doctor, userCount.missedCount_doctor)

            put(DatabaseContract.CardView2.COLUMN_aftBFCount_nurses, userCount.aftBFCount_nurses)
            put(
                DatabaseContract.CardView2.COLUMN_aftPSurrCount_nurses,
                userCount.aftPSurrCount_nurses
            )
            put(
                DatabaseContract.CardView2.COLUMN_befAseptCount_nurses,
                userCount.befAseptCount_nurses
            )
            put(DatabaseContract.CardView2.COLUMN_befPatCount_nurses, userCount.befPatCount_nurses)
            put(DatabaseContract.CardView2.COLUMN_aftPatCount_nurses, userCount.aftPatCount_nurses)
            put(DatabaseContract.CardView2.COLUMN_hrCount_nurses, userCount.hrCount_nurses)
            put(DatabaseContract.CardView2.COLUMN_hwCount_nurses, userCount.hwCount_nurses)
            put(DatabaseContract.CardView2.COLUMN_missedCount_nurses, userCount.missedCount_nurses)

            put(DatabaseContract.CardView2.COLUMN_aftBFCount_workers, userCount.aftBFCount_workers)
            put(
                DatabaseContract.CardView2.COLUMN_aftPSurrCount_workers,
                userCount.aftPSurrCount_workers
            )
            put(
                DatabaseContract.CardView2.COLUMN_befAseptCount_workers,
                userCount.befAseptCount_workers
            )
            put(
                DatabaseContract.CardView2.COLUMN_befPatCount_workers, userCount.befPatCount_workers
            )
            put(
                DatabaseContract.CardView2.COLUMN_aftPatCount_workers, userCount.aftPatCount_workers
            )
            put(DatabaseContract.CardView2.COLUMN_hrCount_workers, userCount.hrCount_workers)
            put(DatabaseContract.CardView2.COLUMN_hwCount_workers, userCount.hwCount_workers)
            put(
                DatabaseContract.CardView2.COLUMN_missedCount_workers, userCount.missedCount_workers
            )

            Log.d("InsertData", "Doctors Count: ${userCount.doctorsCount}")
            Log.d("InsertData", "Workers Count: ${userCount.workersCount}")

        }
        db.insertWithOnConflict(
            DatabaseContract.CardView2.TABLE_CARD_VIEW_2,
            null,
            contentValues,
            SQLiteDatabase.CONFLICT_REPLACE
        )
        db.close()
    }

    fun insertOrUpdateCount3(userCount: UserCount) {
        val db = writableDatabase
        val contentValues = ContentValues().apply {
            put(DatabaseContract.CardView3.COLUMN_doctorsCount, userCount.doctorsCount)
            put(DatabaseContract.CardView3.COLUMN_workersCount, userCount.workersCount)
            put(DatabaseContract.CardView3.COLUMN_nursesCount, userCount.nursesCount)

            put(DatabaseContract.CardView3.COLUMN_aftBFCount, userCount.aftBFCount)
            put(DatabaseContract.CardView3.COLUMN_aftPSurrCount, userCount.aftPSurrCount)
            put(DatabaseContract.CardView3.COLUMN_befAseptCount, userCount.befAseptCount)
            put(DatabaseContract.CardView3.COLUMN_befPatCount, userCount.befPatCount)
            put(DatabaseContract.CardView3.COLUMN_aftPatCount, userCount.aftPatCount)
            put(DatabaseContract.CardView3.COLUMN_hrCount, userCount.hrCount)
            put(DatabaseContract.CardView3.COLUMN_hwCount, userCount.hwCount)
            put(DatabaseContract.CardView3.COLUMN_missedCount, userCount.missedCount)

            put(DatabaseContract.CardView3.COLUMN_aftBFCount_doctor, userCount.aftBFCount_doctor)
            put(
                DatabaseContract.CardView3.COLUMN_aftPSurrCount_doctor,
                userCount.aftPSurrCount_doctor
            )
            put(
                DatabaseContract.CardView3.COLUMN_befAseptCount_doctor,
                userCount.befAseptCount_doctor
            )
            put(DatabaseContract.CardView3.COLUMN_befPatCount_doctor, userCount.befPatCount_doctor)
            put(DatabaseContract.CardView3.COLUMN_aftPatCount_doctor, userCount.aftPatCount_doctor)
            put(DatabaseContract.CardView3.COLUMN_hrCount_doctor, userCount.hrCount_doctor)
            put(DatabaseContract.CardView3.COLUMN_hwCount_doctor, userCount.hwCount_doctor)
            put(DatabaseContract.CardView3.COLUMN_missedCount_doctor, userCount.missedCount_doctor)

            put(DatabaseContract.CardView3.COLUMN_aftBFCount_nurses, userCount.aftBFCount_nurses)
            put(
                DatabaseContract.CardView3.COLUMN_aftPSurrCount_nurses,
                userCount.aftPSurrCount_nurses
            )
            put(
                DatabaseContract.CardView3.COLUMN_befAseptCount_nurses,
                userCount.befAseptCount_nurses
            )
            put(DatabaseContract.CardView3.COLUMN_befPatCount_nurses, userCount.befPatCount_nurses)
            put(DatabaseContract.CardView3.COLUMN_aftPatCount_nurses, userCount.aftPatCount_nurses)
            put(DatabaseContract.CardView3.COLUMN_hrCount_nurses, userCount.hrCount_nurses)
            put(DatabaseContract.CardView3.COLUMN_hwCount_nurses, userCount.hwCount_nurses)
            put(DatabaseContract.CardView3.COLUMN_missedCount_nurses, userCount.missedCount_nurses)

            put(DatabaseContract.CardView3.COLUMN_aftBFCount_workers, userCount.aftBFCount_workers)
            put(
                DatabaseContract.CardView3.COLUMN_aftPSurrCount_workers,
                userCount.aftPSurrCount_workers
            )
            put(
                DatabaseContract.CardView3.COLUMN_befAseptCount_workers,
                userCount.befAseptCount_workers
            )
            put(
                DatabaseContract.CardView3.COLUMN_befPatCount_workers, userCount.befPatCount_workers
            )
            put(
                DatabaseContract.CardView3.COLUMN_aftPatCount_workers, userCount.aftPatCount_workers
            )
            put(DatabaseContract.CardView3.COLUMN_hrCount_workers, userCount.hrCount_workers)
            put(DatabaseContract.CardView3.COLUMN_hwCount_workers, userCount.hwCount_workers)
            put(
                DatabaseContract.CardView3.COLUMN_missedCount_workers, userCount.missedCount_workers
            )

            Log.d("InsertData", "Doctors Count: ${userCount.doctorsCount}")
            Log.d("InsertData", "Workers Count: ${userCount.workersCount}")

        }
        db.insertWithOnConflict(
            DatabaseContract.CardView3.TABLE_CARD_VIEW_3,
            null,
            contentValues,
            SQLiteDatabase.CONFLICT_REPLACE
        )
        db.close()
    }

    fun insertOrUpdateCount4(userCount: UserCount) {
        val db = writableDatabase
        val contentValues = ContentValues().apply {
            put(DatabaseContract.CardView4.COLUMN_doctorsCount, userCount.doctorsCount)
            put(DatabaseContract.CardView4.COLUMN_workersCount, userCount.workersCount)
            put(DatabaseContract.CardView4.COLUMN_nursesCount, userCount.nursesCount)

            put(DatabaseContract.CardView4.COLUMN_aftBFCount, userCount.aftBFCount)
            put(DatabaseContract.CardView4.COLUMN_aftPSurrCount, userCount.aftPSurrCount)
            put(DatabaseContract.CardView4.COLUMN_befAseptCount, userCount.befAseptCount)
            put(DatabaseContract.CardView4.COLUMN_befPatCount, userCount.befPatCount)
            put(DatabaseContract.CardView4.COLUMN_aftPatCount, userCount.aftPatCount)
            put(DatabaseContract.CardView4.COLUMN_hrCount, userCount.hrCount)
            put(DatabaseContract.CardView4.COLUMN_hwCount, userCount.hwCount)
            put(DatabaseContract.CardView4.COLUMN_missedCount, userCount.missedCount)

            put(DatabaseContract.CardView4.COLUMN_aftBFCount_doctor, userCount.aftBFCount_doctor)
            put(
                DatabaseContract.CardView4.COLUMN_aftPSurrCount_doctor,
                userCount.aftPSurrCount_doctor
            )
            put(
                DatabaseContract.CardView4.COLUMN_befAseptCount_doctor,
                userCount.befAseptCount_doctor
            )
            put(DatabaseContract.CardView4.COLUMN_befPatCount_doctor, userCount.befPatCount_doctor)
            put(DatabaseContract.CardView4.COLUMN_aftPatCount_doctor, userCount.aftPatCount_doctor)
            put(DatabaseContract.CardView4.COLUMN_hrCount_doctor, userCount.hrCount_doctor)
            put(DatabaseContract.CardView4.COLUMN_hwCount_doctor, userCount.hwCount_doctor)
            put(DatabaseContract.CardView4.COLUMN_missedCount_doctor, userCount.missedCount_doctor)

            put(DatabaseContract.CardView4.COLUMN_aftBFCount_nurses, userCount.aftBFCount_nurses)
            put(
                DatabaseContract.CardView4.COLUMN_aftPSurrCount_nurses,
                userCount.aftPSurrCount_nurses
            )
            put(
                DatabaseContract.CardView4.COLUMN_befAseptCount_nurses,
                userCount.befAseptCount_nurses
            )
            put(DatabaseContract.CardView4.COLUMN_befPatCount_nurses, userCount.befPatCount_nurses)
            put(DatabaseContract.CardView4.COLUMN_aftPatCount_nurses, userCount.aftPatCount_nurses)
            put(DatabaseContract.CardView4.COLUMN_hrCount_nurses, userCount.hrCount_nurses)
            put(DatabaseContract.CardView4.COLUMN_hwCount_nurses, userCount.hwCount_nurses)
            put(DatabaseContract.CardView4.COLUMN_missedCount_nurses, userCount.missedCount_nurses)

            put(DatabaseContract.CardView4.COLUMN_aftBFCount_workers, userCount.aftBFCount_workers)
            put(
                DatabaseContract.CardView4.COLUMN_aftPSurrCount_workers,
                userCount.aftPSurrCount_workers
            )
            put(
                DatabaseContract.CardView4.COLUMN_befAseptCount_workers,
                userCount.befAseptCount_workers
            )
            put(
                DatabaseContract.CardView4.COLUMN_befPatCount_workers, userCount.befPatCount_workers
            )
            put(
                DatabaseContract.CardView4.COLUMN_aftPatCount_workers, userCount.aftPatCount_workers
            )
            put(DatabaseContract.CardView4.COLUMN_hrCount_workers, userCount.hrCount_workers)
            put(DatabaseContract.CardView4.COLUMN_hwCount_workers, userCount.hwCount_workers)
            put(
                DatabaseContract.CardView4.COLUMN_missedCount_workers, userCount.missedCount_workers
            )

            Log.d("InsertData", "Doctors Count: ${userCount.doctorsCount}")
            Log.d("InsertData", "Workers Count: ${userCount.workersCount}")

        }
        db.insertWithOnConflict(
            DatabaseContract.CardView4.TABLE_CARD_VIEW_4,
            null,
            contentValues,
            SQLiteDatabase.CONFLICT_REPLACE
        )
        db.close()
    }

    fun insertOrUpdateCount5(userCount: UserCount) {
        val db = writableDatabase
        val contentValues = ContentValues().apply {
            put(DatabaseContract.CardView5.COLUMN_doctorsCount, userCount.doctorsCount)
            put(DatabaseContract.CardView5.COLUMN_workersCount, userCount.workersCount)
            put(DatabaseContract.CardView5.COLUMN_nursesCount, userCount.nursesCount)

            put(DatabaseContract.CardView5.COLUMN_aftBFCount, userCount.aftBFCount)
            put(DatabaseContract.CardView5.COLUMN_aftPSurrCount, userCount.aftPSurrCount)
            put(DatabaseContract.CardView5.COLUMN_befAseptCount, userCount.befAseptCount)
            put(DatabaseContract.CardView5.COLUMN_befPatCount, userCount.befPatCount)
            put(DatabaseContract.CardView5.COLUMN_aftPatCount, userCount.aftPatCount)
            put(DatabaseContract.CardView5.COLUMN_hrCount, userCount.hrCount)
            put(DatabaseContract.CardView5.COLUMN_hwCount, userCount.hwCount)
            put(DatabaseContract.CardView5.COLUMN_missedCount, userCount.missedCount)

            put(DatabaseContract.CardView5.COLUMN_aftBFCount_doctor, userCount.aftBFCount_doctor)
            put(
                DatabaseContract.CardView5.COLUMN_aftPSurrCount_doctor,
                userCount.aftPSurrCount_doctor
            )
            put(
                DatabaseContract.CardView5.COLUMN_befAseptCount_doctor,
                userCount.befAseptCount_doctor
            )
            put(DatabaseContract.CardView5.COLUMN_befPatCount_doctor, userCount.befPatCount_doctor)
            put(DatabaseContract.CardView5.COLUMN_aftPatCount_doctor, userCount.aftPatCount_doctor)
            put(DatabaseContract.CardView5.COLUMN_hrCount_doctor, userCount.hrCount_doctor)
            put(DatabaseContract.CardView5.COLUMN_hwCount_doctor, userCount.hwCount_doctor)
            put(DatabaseContract.CardView5.COLUMN_missedCount_doctor, userCount.missedCount_doctor)

            put(DatabaseContract.CardView5.COLUMN_aftBFCount_nurses, userCount.aftBFCount_nurses)
            put(
                DatabaseContract.CardView5.COLUMN_aftPSurrCount_nurses,
                userCount.aftPSurrCount_nurses
            )
            put(
                DatabaseContract.CardView5.COLUMN_befAseptCount_nurses,
                userCount.befAseptCount_nurses
            )
            put(DatabaseContract.CardView5.COLUMN_befPatCount_nurses, userCount.befPatCount_nurses)
            put(DatabaseContract.CardView5.COLUMN_aftPatCount_nurses, userCount.aftPatCount_nurses)
            put(DatabaseContract.CardView5.COLUMN_hrCount_nurses, userCount.hrCount_nurses)
            put(DatabaseContract.CardView5.COLUMN_hwCount_nurses, userCount.hwCount_nurses)
            put(DatabaseContract.CardView5.COLUMN_missedCount_nurses, userCount.missedCount_nurses)

            put(DatabaseContract.CardView5.COLUMN_aftBFCount_workers, userCount.aftBFCount_workers)
            put(
                DatabaseContract.CardView5.COLUMN_aftPSurrCount_workers,
                userCount.aftPSurrCount_workers
            )
            put(
                DatabaseContract.CardView5.COLUMN_befAseptCount_workers,
                userCount.befAseptCount_workers
            )
            put(
                DatabaseContract.CardView5.COLUMN_befPatCount_workers, userCount.befPatCount_workers
            )
            put(
                DatabaseContract.CardView5.COLUMN_aftPatCount_workers, userCount.aftPatCount_workers
            )
            put(DatabaseContract.CardView5.COLUMN_hrCount_workers, userCount.hrCount_workers)
            put(DatabaseContract.CardView5.COLUMN_hwCount_workers, userCount.hwCount_workers)
            put(
                DatabaseContract.CardView5.COLUMN_missedCount_workers, userCount.missedCount_workers
            )

            Log.d("InsertData", "Doctors Count: ${userCount.doctorsCount}")
            Log.d("InsertData", "Workers Count: ${userCount.workersCount}")

        }
        db.insertWithOnConflict(
            DatabaseContract.CardView5.TABLE_CARD_VIEW_5,
            null,
            contentValues,
            SQLiteDatabase.CONFLICT_REPLACE
        )
        db.close()
    }

    fun getCardViewCount(): List<UserCount> {
        val counts: MutableList<UserCount> = mutableListOf()

        val db = this.readableDatabase
        val projection = arrayOf(
            DatabaseContract.CardView1.COLUMN_doctorsCount,
            DatabaseContract.CardView1.COLUMN_workersCount,
            DatabaseContract.CardView1.COLUMN_nursesCount,
            DatabaseContract.CardView1.COLUMN_befPatCount,
            DatabaseContract.CardView1.COLUMN_befAseptCount,
            DatabaseContract.CardView1.COLUMN_aftBFCount,
            DatabaseContract.CardView1.COLUMN_aftPatCount,
            DatabaseContract.CardView1.COLUMN_aftPSurrCount,
            DatabaseContract.CardView1.COLUMN_hrCount,
            DatabaseContract.CardView1.COLUMN_hwCount,
            DatabaseContract.CardView1.COLUMN_missedCount,
            DatabaseContract.CardView1.COLUMN_befPatCount_doctor,
            DatabaseContract.CardView1.COLUMN_befAseptCount_doctor,
            DatabaseContract.CardView1.COLUMN_aftBFCount_doctor,
            DatabaseContract.CardView1.COLUMN_aftPatCount_doctor,
            DatabaseContract.CardView1.COLUMN_aftPSurrCount_doctor,
            DatabaseContract.CardView1.COLUMN_hrCount_doctor,
            DatabaseContract.CardView1.COLUMN_hwCount_doctor,
            DatabaseContract.CardView1.COLUMN_missedCount_doctor,
            DatabaseContract.CardView1.COLUMN_befPatCount_nurses,
            DatabaseContract.CardView1.COLUMN_befAseptCount_nurses,
            DatabaseContract.CardView1.COLUMN_aftBFCount_nurses,
            DatabaseContract.CardView1.COLUMN_aftPatCount_nurses,
            DatabaseContract.CardView1.COLUMN_aftPSurrCount_nurses,
            DatabaseContract.CardView1.COLUMN_hrCount_nurses,
            DatabaseContract.CardView1.COLUMN_hwCount_nurses,
            DatabaseContract.CardView1.COLUMN_missedCount_nurses,
            DatabaseContract.CardView1.COLUMN_befPatCount_workers,
            DatabaseContract.CardView1.COLUMN_befAseptCount_workers,
            DatabaseContract.CardView1.COLUMN_aftBFCount_workers,
            DatabaseContract.CardView1.COLUMN_aftPatCount_workers,
            DatabaseContract.CardView1.COLUMN_aftPSurrCount_workers,
            DatabaseContract.CardView1.COLUMN_hrCount_workers,
            DatabaseContract.CardView1.COLUMN_hwCount_workers,
            DatabaseContract.CardView1.COLUMN_missedCount_workers
        )
        //val sortOrder = "${BaseColumns._ID} DESC"
        val cursor = db.query(
            DatabaseContract.CardView1.TABLE_CARD_VIEW_1,
            projection,
            null,
            null,
            null,
            null,
            null
        )
        var cardViewData: UserCount?

        with(cursor) {
            if (moveToNext()) {
                cardViewData = UserCount(
                    doctorsCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_doctorsCount)),
                    workersCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_workersCount)),
                    nursesCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_nursesCount)),
                    befPatCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_befPatCount)),
                    befAseptCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_befAseptCount)),
                    aftBFCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftBFCount)),
                    aftPatCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftPatCount)),
                    aftPSurrCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftPSurrCount)),
                    befPatCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_hrCount)),
                    befAseptCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_hwCount)),
                    aftBFCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_missedCount)),
                    aftPatCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_befPatCount_doctor)),
                    aftPSurrCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_befAseptCount_doctor)),
                    befPatCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftBFCount_doctor)),
                    befAseptCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftPatCount_doctor)),
                    aftBFCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftPSurrCount_doctor)),
                    aftPatCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_hrCount_doctor)),
                    aftPSurrCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_hwCount_doctor)),
                    befPatCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_missedCount_doctor)),
                    befAseptCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_befPatCount_nurses)),
                    aftBFCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_befAseptCount_nurses)),
                    aftPatCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftBFCount_nurses)),
                    aftPSurrCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftPatCount_nurses)),
                    hrCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftPSurrCount_nurses)),
                    hwCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_hrCount_nurses)),
                    missedCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_hwCount_nurses)),
                    hrCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_missedCount_nurses)),
                    hwCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_befPatCount_workers)),
                    missedCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_befAseptCount_workers)),
                    hrCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftBFCount_workers)),
                    hwCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftPatCount_workers)),
                    missedCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_aftPSurrCount_workers)),
                    hrCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_hrCount_workers)),
                    hwCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_hwCount_workers)),
                    missedCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView1.COLUMN_missedCount_workers)),

                    )
                counts.add(cardViewData!!)
            }

        }
        cursor.close()
        return counts
    }

    fun getCardViewCount2(): List<UserCount> {
        val counts: MutableList<UserCount> = mutableListOf()
        val db = this.readableDatabase
        val projection = arrayOf(
            DatabaseContract.CardView2.COLUMN_doctorsCount,
            DatabaseContract.CardView2.COLUMN_workersCount,
            DatabaseContract.CardView2.COLUMN_nursesCount,
            DatabaseContract.CardView2.COLUMN_befPatCount,
            DatabaseContract.CardView2.COLUMN_befAseptCount,
            DatabaseContract.CardView2.COLUMN_aftBFCount,
            DatabaseContract.CardView2.COLUMN_aftPatCount,
            DatabaseContract.CardView2.COLUMN_aftPSurrCount,
            DatabaseContract.CardView2.COLUMN_hrCount,
            DatabaseContract.CardView2.COLUMN_hwCount,
            DatabaseContract.CardView2.COLUMN_missedCount,
            DatabaseContract.CardView2.COLUMN_befPatCount_doctor,
            DatabaseContract.CardView2.COLUMN_befAseptCount_doctor,
            DatabaseContract.CardView2.COLUMN_aftBFCount_doctor,
            DatabaseContract.CardView2.COLUMN_aftPatCount_doctor,
            DatabaseContract.CardView2.COLUMN_aftPSurrCount_doctor,
            DatabaseContract.CardView2.COLUMN_hrCount_doctor,
            DatabaseContract.CardView2.COLUMN_hwCount_doctor,
            DatabaseContract.CardView2.COLUMN_missedCount_doctor,
            DatabaseContract.CardView2.COLUMN_befPatCount_nurses,
            DatabaseContract.CardView2.COLUMN_befAseptCount_nurses,
            DatabaseContract.CardView2.COLUMN_aftBFCount_nurses,
            DatabaseContract.CardView2.COLUMN_aftPatCount_nurses,
            DatabaseContract.CardView2.COLUMN_aftPSurrCount_nurses,
            DatabaseContract.CardView2.COLUMN_hrCount_nurses,
            DatabaseContract.CardView2.COLUMN_hwCount_nurses,
            DatabaseContract.CardView2.COLUMN_missedCount_nurses,
            DatabaseContract.CardView2.COLUMN_befPatCount_workers,
            DatabaseContract.CardView2.COLUMN_befAseptCount_workers,
            DatabaseContract.CardView2.COLUMN_aftBFCount_workers,
            DatabaseContract.CardView2.COLUMN_aftPatCount_workers,
            DatabaseContract.CardView2.COLUMN_aftPSurrCount_workers,
            DatabaseContract.CardView2.COLUMN_hrCount_workers,
            DatabaseContract.CardView2.COLUMN_hwCount_workers,
            DatabaseContract.CardView2.COLUMN_missedCount_workers
        )
        val sortOrder = "${BaseColumns._ID} DESC"
        val cursor = db.query(
            DatabaseContract.CardView2.TABLE_CARD_VIEW_2,
            projection,
            null,
            null,
            null,
            null,
            sortOrder
        )
        var cardViewData: UserCount?

        with(cursor) {
            if (moveToNext()) {
                cardViewData = UserCount(
                    doctorsCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_doctorsCount)),
                    workersCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_workersCount)),
                    nursesCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_nursesCount)),
                    befPatCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_befPatCount)),
                    befAseptCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_befAseptCount)),
                    aftBFCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftBFCount)),
                    aftPatCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftPatCount)),
                    aftPSurrCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftPSurrCount)),
                    befPatCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_hrCount)),
                    befAseptCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_hwCount)),
                    aftBFCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_missedCount)),
                    aftPatCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_befPatCount_doctor)),
                    aftPSurrCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_befAseptCount_doctor)),
                    befPatCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftBFCount_doctor)),
                    befAseptCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftPatCount_doctor)),
                    aftBFCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftPSurrCount_doctor)),
                    aftPatCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_hrCount_doctor)),
                    aftPSurrCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_hwCount_doctor)),
                    befPatCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_missedCount_doctor)),
                    befAseptCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_befPatCount_nurses)),
                    aftBFCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_befAseptCount_nurses)),
                    aftPatCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftBFCount_nurses)),
                    aftPSurrCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftPatCount_nurses)),
                    hrCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftPSurrCount_nurses)),
                    hwCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_hrCount_nurses)),
                    missedCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_hwCount_nurses)),
                    hrCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_missedCount_nurses)),
                    hwCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_befPatCount_workers)),
                    missedCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_befAseptCount_workers)),
                    hrCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftBFCount_workers)),
                    hwCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftPatCount_workers)),
                    missedCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_aftPSurrCount_workers)),
                    hrCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_hrCount_workers)),
                    hwCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_hwCount_workers)),
                    missedCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView2.COLUMN_missedCount_workers)),

                    )
                counts.add(cardViewData!!)
            }

        }
        cursor.close()
        return counts
    }

    fun getCardViewCount3(): List<UserCount> {
        val counts: MutableList<UserCount> = mutableListOf()
        val db = this.readableDatabase
        val projection = arrayOf(
            DatabaseContract.CardView3.COLUMN_doctorsCount,
            DatabaseContract.CardView3.COLUMN_workersCount,
            DatabaseContract.CardView3.COLUMN_nursesCount,
            DatabaseContract.CardView3.COLUMN_befPatCount,
            DatabaseContract.CardView3.COLUMN_befAseptCount,
            DatabaseContract.CardView3.COLUMN_aftBFCount,
            DatabaseContract.CardView3.COLUMN_aftPatCount,
            DatabaseContract.CardView3.COLUMN_aftPSurrCount,
            DatabaseContract.CardView3.COLUMN_hrCount,
            DatabaseContract.CardView3.COLUMN_hwCount,
            DatabaseContract.CardView3.COLUMN_missedCount,
            DatabaseContract.CardView3.COLUMN_befPatCount_doctor,
            DatabaseContract.CardView3.COLUMN_befAseptCount_doctor,
            DatabaseContract.CardView3.COLUMN_aftBFCount_doctor,
            DatabaseContract.CardView3.COLUMN_aftPatCount_doctor,
            DatabaseContract.CardView3.COLUMN_aftPSurrCount_doctor,
            DatabaseContract.CardView3.COLUMN_hrCount_doctor,
            DatabaseContract.CardView3.COLUMN_hwCount_doctor,
            DatabaseContract.CardView3.COLUMN_missedCount_doctor,
            DatabaseContract.CardView3.COLUMN_befPatCount_nurses,
            DatabaseContract.CardView3.COLUMN_befAseptCount_nurses,
            DatabaseContract.CardView3.COLUMN_aftBFCount_nurses,
            DatabaseContract.CardView3.COLUMN_aftPatCount_nurses,
            DatabaseContract.CardView3.COLUMN_aftPSurrCount_nurses,
            DatabaseContract.CardView3.COLUMN_hrCount_nurses,
            DatabaseContract.CardView3.COLUMN_hwCount_nurses,
            DatabaseContract.CardView3.COLUMN_missedCount_nurses,
            DatabaseContract.CardView3.COLUMN_befPatCount_workers,
            DatabaseContract.CardView3.COLUMN_befAseptCount_workers,
            DatabaseContract.CardView3.COLUMN_aftBFCount_workers,
            DatabaseContract.CardView3.COLUMN_aftPatCount_workers,
            DatabaseContract.CardView3.COLUMN_aftPSurrCount_workers,
            DatabaseContract.CardView3.COLUMN_hrCount_workers,
            DatabaseContract.CardView3.COLUMN_hwCount_workers,
            DatabaseContract.CardView3.COLUMN_missedCount_workers
        )
        val sortOrder = "${BaseColumns._ID} DESC"
        val cursor = db.query(
            DatabaseContract.CardView3.TABLE_CARD_VIEW_3,
            projection,
            null,
            null,
            null,
            null,
            sortOrder
        )
        var cardViewData: UserCount?

        with(cursor) {
            if (moveToNext()) {
                cardViewData = UserCount(
                    doctorsCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_doctorsCount)),
                    workersCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_workersCount)),
                    nursesCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_nursesCount)),
                    befPatCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_befPatCount)),
                    befAseptCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_befAseptCount)),
                    aftBFCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftBFCount)),
                    aftPatCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftPatCount)),
                    aftPSurrCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftPSurrCount)),
                    befPatCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_hrCount)),
                    befAseptCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_hwCount)),
                    aftBFCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_missedCount)),
                    aftPatCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_befPatCount_doctor)),
                    aftPSurrCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_befAseptCount_doctor)),
                    befPatCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftBFCount_doctor)),
                    befAseptCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftPatCount_doctor)),
                    aftBFCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftPSurrCount_doctor)),
                    aftPatCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_hrCount_doctor)),
                    aftPSurrCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_hwCount_doctor)),
                    befPatCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_missedCount_doctor)),
                    befAseptCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_befPatCount_nurses)),
                    aftBFCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_befAseptCount_nurses)),
                    aftPatCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftBFCount_nurses)),
                    aftPSurrCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftPatCount_nurses)),
                    hrCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftPSurrCount_nurses)),
                    hwCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_hrCount_nurses)),
                    missedCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_hwCount_nurses)),
                    hrCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_missedCount_nurses)),
                    hwCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_befPatCount_workers)),
                    missedCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_befAseptCount_workers)),
                    hrCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftBFCount_workers)),
                    hwCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftPatCount_workers)),
                    missedCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_aftPSurrCount_workers)),
                    hrCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_hrCount_workers)),
                    hwCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_hwCount_workers)),
                    missedCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView3.COLUMN_missedCount_workers)),

                    )
                counts.add(cardViewData!!)
            }

        }
        cursor.close()
        return counts
    }

    fun getCardViewCount4(): List<UserCount> {
        val counts: MutableList<UserCount> = mutableListOf()
        val db = this.readableDatabase
        val projection = arrayOf(
            DatabaseContract.CardView4.COLUMN_doctorsCount,
            DatabaseContract.CardView4.COLUMN_workersCount,
            DatabaseContract.CardView4.COLUMN_nursesCount,
            DatabaseContract.CardView4.COLUMN_befPatCount,
            DatabaseContract.CardView4.COLUMN_befAseptCount,
            DatabaseContract.CardView4.COLUMN_aftBFCount,
            DatabaseContract.CardView4.COLUMN_aftPatCount,
            DatabaseContract.CardView4.COLUMN_aftPSurrCount,
            DatabaseContract.CardView4.COLUMN_hrCount,
            DatabaseContract.CardView4.COLUMN_hwCount,
            DatabaseContract.CardView4.COLUMN_missedCount,
            DatabaseContract.CardView4.COLUMN_befPatCount_doctor,
            DatabaseContract.CardView4.COLUMN_befAseptCount_doctor,
            DatabaseContract.CardView4.COLUMN_aftBFCount_doctor,
            DatabaseContract.CardView4.COLUMN_aftPatCount_doctor,
            DatabaseContract.CardView4.COLUMN_aftPSurrCount_doctor,
            DatabaseContract.CardView4.COLUMN_hrCount_doctor,
            DatabaseContract.CardView4.COLUMN_hwCount_doctor,
            DatabaseContract.CardView4.COLUMN_missedCount_doctor,
            DatabaseContract.CardView4.COLUMN_befPatCount_nurses,
            DatabaseContract.CardView4.COLUMN_befAseptCount_nurses,
            DatabaseContract.CardView4.COLUMN_aftBFCount_nurses,
            DatabaseContract.CardView4.COLUMN_aftPatCount_nurses,
            DatabaseContract.CardView4.COLUMN_aftPSurrCount_nurses,
            DatabaseContract.CardView4.COLUMN_hrCount_nurses,
            DatabaseContract.CardView4.COLUMN_hwCount_nurses,
            DatabaseContract.CardView4.COLUMN_missedCount_nurses,
            DatabaseContract.CardView4.COLUMN_befPatCount_workers,
            DatabaseContract.CardView4.COLUMN_befAseptCount_workers,
            DatabaseContract.CardView4.COLUMN_aftBFCount_workers,
            DatabaseContract.CardView4.COLUMN_aftPatCount_workers,
            DatabaseContract.CardView4.COLUMN_aftPSurrCount_workers,
            DatabaseContract.CardView4.COLUMN_hrCount_workers,
            DatabaseContract.CardView4.COLUMN_hwCount_workers,
            DatabaseContract.CardView4.COLUMN_missedCount_workers
        )
        val sortOrder = "${BaseColumns._ID} DESC"
        val cursor = db.query(
            DatabaseContract.CardView4.TABLE_CARD_VIEW_4,
            projection,
            null,
            null,
            null,
            null,
            sortOrder
        )
        var cardViewData: UserCount?

        with(cursor) {
            if (moveToNext()) {
                cardViewData = UserCount(
                    doctorsCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_doctorsCount)),
                    workersCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_workersCount)),
                    nursesCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_nursesCount)),
                    befPatCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_befPatCount)),
                    befAseptCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_befAseptCount)),
                    aftBFCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftBFCount)),
                    aftPatCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftPatCount)),
                    aftPSurrCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftPSurrCount)),
                    befPatCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_hrCount)),
                    befAseptCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_hwCount)),
                    aftBFCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_missedCount)),
                    aftPatCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_befPatCount_doctor)),
                    aftPSurrCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_befAseptCount_doctor)),
                    befPatCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftBFCount_doctor)),
                    befAseptCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftPatCount_doctor)),
                    aftBFCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftPSurrCount_doctor)),
                    aftPatCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_hrCount_doctor)),
                    aftPSurrCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_hwCount_doctor)),
                    befPatCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_missedCount_doctor)),
                    befAseptCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_befPatCount_nurses)),
                    aftBFCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_befAseptCount_nurses)),
                    aftPatCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftBFCount_nurses)),
                    aftPSurrCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftPatCount_nurses)),
                    hrCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftPSurrCount_nurses)),
                    hwCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_hrCount_nurses)),
                    missedCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_hwCount_nurses)),
                    hrCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_missedCount_nurses)),
                    hwCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_befPatCount_workers)),
                    missedCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_befAseptCount_workers)),
                    hrCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftBFCount_workers)),
                    hwCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftPatCount_workers)),
                    missedCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_aftPSurrCount_workers)),
                    hrCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_hrCount_workers)),
                    hwCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_hwCount_workers)),
                    missedCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView4.COLUMN_missedCount_workers)),

                    )
                counts.add(cardViewData!!)
            }

        }
        cursor.close()
        return counts
    }

    fun getCardViewCount5(): List<UserCount> {
        val counts: MutableList<UserCount> = mutableListOf()
        val db = this.readableDatabase
        val projection = arrayOf(
            DatabaseContract.CardView5.COLUMN_doctorsCount,
            DatabaseContract.CardView5.COLUMN_workersCount,
            DatabaseContract.CardView5.COLUMN_nursesCount,
            DatabaseContract.CardView5.COLUMN_befPatCount,
            DatabaseContract.CardView5.COLUMN_befAseptCount,
            DatabaseContract.CardView5.COLUMN_aftBFCount,
            DatabaseContract.CardView5.COLUMN_aftPatCount,
            DatabaseContract.CardView5.COLUMN_aftPSurrCount,
            DatabaseContract.CardView5.COLUMN_hrCount,
            DatabaseContract.CardView5.COLUMN_hwCount,
            DatabaseContract.CardView5.COLUMN_missedCount,
            DatabaseContract.CardView5.COLUMN_befPatCount_doctor,
            DatabaseContract.CardView5.COLUMN_befAseptCount_doctor,
            DatabaseContract.CardView5.COLUMN_aftBFCount_doctor,
            DatabaseContract.CardView5.COLUMN_aftPatCount_doctor,
            DatabaseContract.CardView5.COLUMN_aftPSurrCount_doctor,
            DatabaseContract.CardView5.COLUMN_hrCount_doctor,
            DatabaseContract.CardView5.COLUMN_hwCount_doctor,
            DatabaseContract.CardView5.COLUMN_missedCount_doctor,
            DatabaseContract.CardView5.COLUMN_befPatCount_nurses,
            DatabaseContract.CardView5.COLUMN_befAseptCount_nurses,
            DatabaseContract.CardView5.COLUMN_aftBFCount_nurses,
            DatabaseContract.CardView5.COLUMN_aftPatCount_nurses,
            DatabaseContract.CardView5.COLUMN_aftPSurrCount_nurses,
            DatabaseContract.CardView5.COLUMN_hrCount_nurses,
            DatabaseContract.CardView5.COLUMN_hwCount_nurses,
            DatabaseContract.CardView5.COLUMN_missedCount_nurses,
            DatabaseContract.CardView5.COLUMN_befPatCount_workers,
            DatabaseContract.CardView5.COLUMN_befAseptCount_workers,
            DatabaseContract.CardView5.COLUMN_aftBFCount_workers,
            DatabaseContract.CardView5.COLUMN_aftPatCount_workers,
            DatabaseContract.CardView5.COLUMN_aftPSurrCount_workers,
            DatabaseContract.CardView5.COLUMN_hrCount_workers,
            DatabaseContract.CardView5.COLUMN_hwCount_workers,
            DatabaseContract.CardView5.COLUMN_missedCount_workers
        )
        val sortOrder = "${BaseColumns._ID} DESC"
        val cursor = db.query(
            DatabaseContract.CardView5.TABLE_CARD_VIEW_5,
            projection,
            null,
            null,
            null,
            null,
            sortOrder
        )
        var cardViewData: UserCount?

        with(cursor) {
            if (moveToNext()) {
                cardViewData = UserCount(
                    doctorsCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_doctorsCount)),
                    workersCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_workersCount)),
                    nursesCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_nursesCount)),
                    befPatCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_befPatCount)),
                    befAseptCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_befAseptCount)),
                    aftBFCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftBFCount)),
                    aftPatCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftPatCount)),
                    aftPSurrCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftPSurrCount)),
                    befPatCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_hrCount)),
                    befAseptCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_hwCount)),
                    aftBFCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_missedCount)),
                    aftPatCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_befPatCount_doctor)),
                    aftPSurrCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_befAseptCount_doctor)),
                    befPatCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftBFCount_doctor)),
                    befAseptCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftPatCount_doctor)),
                    aftBFCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftPSurrCount_doctor)),
                    aftPatCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_hrCount_doctor)),
                    aftPSurrCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_hwCount_doctor)),
                    befPatCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_missedCount_doctor)),
                    befAseptCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_befPatCount_nurses)),
                    aftBFCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_befAseptCount_nurses)),
                    aftPatCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftBFCount_nurses)),
                    aftPSurrCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftPatCount_nurses)),
                    hrCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftPSurrCount_nurses)),
                    hwCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_hrCount_nurses)),
                    missedCount = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_hwCount_nurses)),
                    hrCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_missedCount_nurses)),
                    hwCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_befPatCount_workers)),
                    missedCount_doctor = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_befAseptCount_workers)),
                    hrCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftBFCount_workers)),
                    hwCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftPatCount_workers)),
                    missedCount_nurses = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_aftPSurrCount_workers)),
                    hrCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_hrCount_workers)),
                    hwCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_hwCount_workers)),
                    missedCount_workers = getInt(getColumnIndexOrThrow(DatabaseContract.CardView5.COLUMN_missedCount_workers)),

                    )
                counts.add(cardViewData!!)
            }

        }
        cursor.close()
        return counts
    }

}

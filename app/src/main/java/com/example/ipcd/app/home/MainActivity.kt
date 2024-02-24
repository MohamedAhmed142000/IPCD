package com.example.ipcd.app.home

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.ipcd.R
import com.example.ipcd.app.login.LoginActivity
import com.example.ipcd.app.reports.ReportsFragment
import com.example.ipcd.app.statistics.StatisticsFragment
import com.example.ipcd.data.Doctor
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(HomeFragment())

        supportActionBar?.let { actionBar ->
            Doctor.getLoggedInDoctor()?.username?.let {
                actionBar.title = it
            }
        }

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNav)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_item1 -> {
                loadFragment(HomeFragment())
                return true
            }

            R.id.menu_item2 -> {
                loadFragment(ReportsFragment())
                return true
            }

            R.id.menu_item3 -> {
                loadFragment(StatisticsFragment())
                return true
            }
        }
        return false
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_logout -> {
            Doctor.logout()

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()

            true
        }

        else -> {
            // The user's action isn't recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
}

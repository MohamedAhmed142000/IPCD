package com.example.ipcd.app.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.ipcd.R
import com.example.ipcd.profile_fregment
import com.example.ipcd.qr_fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(HomeFragment())
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNav)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation item clicks here
        when (item.itemId) {
            R.id.menu_item1 -> {
                // Handle item 1 click
                loadFragment(HomeFragment())
                return true
            }

            R.id.menu_item2 -> {
                // Handle item 2 click
                loadFragment(qr_fragment())
                return true
            }

            R.id.menu_item3 -> {
                // Handle item 2 click
                loadFragment(profile_fregment())
                return true
            }
            // Add more cases for other items if needed
        }
        return false
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}
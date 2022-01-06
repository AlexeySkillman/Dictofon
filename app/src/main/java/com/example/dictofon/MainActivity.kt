package com.example.dictofon

import android.app.ActivityManager
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

// Second way turn on Navigation imports
import com.google.android.material.bottomnavigation.BottomNavigationView
//import androidx.navigation.findNavController
//import androidx.navigation.ui.setupWithNavController

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      First way turn on Navigation imports
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        NavigationUI.setupWithNavController(bottomNav,
            Navigation.findNavController(this, R.id.nav_host_fragment_container))

//      Second way turn on Navigation imports
//        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
//        val navController = findNavController(R.id.nav_host_fragment_container)
//        bottomNav.setupWithNavController(navController)
    }

    fun isServiceRunning(): Boolean {
        val  manager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        for (service in manager.getRunningServices(Int.MAX_VALUE)) {
            if ("com.example.dictofon.record.RecordService" == service.service.className) {
                return true
            }
        }
        return false
    }
}
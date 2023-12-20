package com.example.bottom_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomnav: BottomNavigationView = findViewById(R.id.bottom_nav)
        bottomnav.setOnNavigationItemSelectedListener {
            val id = it.itemId
            when (id) {
                R.id.home -> {
                    // Toast.makeText(this, "home selected", Toast.LENGTH_SHORT).show()
                   openFragment(Bottom_Fragment())
                }

                R.id.profile -> {
                    Toast.makeText(this, "profile selected", Toast.LENGTH_SHORT).show()
                }

                R.id.cart -> {
                    Toast.makeText(this, "cart selected", Toast.LENGTH_SHORT).show()
                }
            }
            return@setOnNavigationItemSelectedListener true


        }
    }

        fun openFragment(fragment: Fragment) {
            supportFragmentManager.beginTransaction().replace(
                R.id.fcv,
                Bottom_Fragment()
            ).commit()
        }



}
package com.example.healthhorizon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val work1 = findViewById<Button>(R.id.work1)
        work1.setOnClickListener {
            // Creating intent to go to workout
            val intent = Intent(this, workout::class.java)
            // Starting the new activity
            startActivity(intent)
        }
        val imageView16 = findViewById<ImageView>(R.id.imageView16)
        imageView16.setOnClickListener {
            // Creating intent to go to profile
            val intent = Intent(this, profile::class.java)
            // Starting the new activity
            startActivity(intent)
        }
        val imageView17 = findViewById<ImageView>(R.id.imageView17)
        imageView17.setOnClickListener {
            // Creating intent to go to profile
            val intent = Intent(this, WkHistory::class.java)
            // Starting the new activity
            startActivity(intent)
        }
    }
}
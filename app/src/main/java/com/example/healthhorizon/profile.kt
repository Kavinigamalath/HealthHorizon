package com.example.healthhorizon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button10 = findViewById<Button>(R.id.button10)
        button10.setOnClickListener {
            // Creating intent to go to home
            val intent = Intent(this, login::class.java)
            // Starting the new activity
            startActivity(intent)
        }
        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            // Creating intent to go to home
            val intent = Intent(this, login::class.java)
            // Starting the new activity
            startActivity(intent)
        }
        val imageView14 = findViewById<ImageView>(R.id.imageView14)
        imageView14.setOnClickListener {
            // Creating intent to go to home
            val intent = Intent(this, home::class.java)
            // Starting the new activity
            startActivity(intent)
        }
        val imageView15 = findViewById<ImageView>(R.id.imageView15)
        imageView15.setOnClickListener {
            // Creating intent to go to home
            val intent = Intent(this, home::class.java)
            // Starting the new activity
            startActivity(intent)
        }
        val imageView17 = findViewById<ImageView>(R.id.imageView17)
        imageView17.setOnClickListener {
            // Creating intent to go to home
            val intent = Intent(this, WkHistory::class.java)
            // Starting the new activity
            startActivity(intent)
        }
    }
}
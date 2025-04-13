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

class joggingsum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_joggingsum)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonnstart = findViewById<Button>(R.id.buttonnstart)
        buttonnstart.setOnClickListener {
            // Creating intent to go to jogging summery page
            val intent = Intent(this, joggingstart::class.java)
            // Starting the new activity
            startActivity(intent)
        }
        val buttonjstart = findViewById<Button>(R.id.buttonjstart)
        buttonjstart.setOnClickListener {
            // Creating intent to go to jogging summery page
            val intent = Intent(this, workout::class.java)
            // Starting the new activity
            startActivity(intent)
        }
        val imageView6 = findViewById<ImageView>(R.id.imageView6)
        imageView6.setOnClickListener {
            // Creating intent to go to jogging summery page
            val intent = Intent(this, joggingstart::class.java)
            // Starting the new activity
            startActivity(intent)
        }
    }
}
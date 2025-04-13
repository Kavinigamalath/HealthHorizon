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


class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Button to navigate to home
        val buttonlogin = findViewById<Button>(R.id.buttonlogin)
        buttonlogin.setOnClickListener {
            // Creating intent to go to home
            val intent = Intent(this, home::class.java)
            // Starting the new activity
            startActivity(intent)
        }
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        imageView3.setOnClickListener {
            // Creating intent to go to MainActivity4
            val intent = Intent(this, MainActivity4::class.java)
            // Starting the new activity
            startActivity(intent)
        }
        val textView5 = findViewById<TextView>(R.id.textView5)
        textView5.setOnClickListener {
            // Creating intent to go to MainActivity4
            val intent = Intent(this, signup::class.java)
            // Starting the new activity
            startActivity(intent)
        }

    }
}
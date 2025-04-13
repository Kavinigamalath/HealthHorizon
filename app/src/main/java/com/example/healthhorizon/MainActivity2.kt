package com.example.healthhorizon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        // Adjusting window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Button to navigate to MainActivity3
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            // Creating intent to go to MainActivity3
            val intent = Intent(this, MainActivity3::class.java)
            // Starting the new activity
            startActivity(intent)
        }
        // Button to navigate to MainActivity3
        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
            // Creating intent to go to MainActivity4
            val intent = Intent(this, login::class.java)
            // Starting the new activity
            startActivity(intent)
        }
    }
}

package com.example.sistemasolar

import android.app.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PlanetasActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planetas)

        val btnLunas = findViewById<Button>(R.id.btnVerLunas)

        btnLunas.setOnClickListener {
            // INTENT: De Planetas a Lunas
            val intent = Intent(this, LunasActivity::class.java)
            startActivity(intent)

            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }
    }
}

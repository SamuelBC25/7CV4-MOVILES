package com.example.sistemasolar

import android.app.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PlanetasActivity : Activity() {
    class PlanetasActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_planetas)

            findViewById<Button>(R.id.btnVerLunas).setOnClickListener {
                // Transición a la Activity final de la jerarquía [cite: 56]
                startActivity(Intent(this, LunasActivity::class.java))
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
            }
        }
    }
}

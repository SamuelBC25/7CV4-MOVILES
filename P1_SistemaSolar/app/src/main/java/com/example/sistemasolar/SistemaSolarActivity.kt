package com.example.sistemasolar

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class SistemaSolarActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistema_solar)

        // Buscamos el botón por el ID que pusimos en el XML
        val btnPlanetas = findViewById<Button>(R.id.btnVerPlanetas)

        btnPlanetas.setOnClickListener {
            // INTENT: De Sistema a Planetas
            val intent = Intent(this, PlanetasActivity::class.java)
            startActivity(intent)

            // Transición fluida (Requisito de la práctica) [cite: 11]
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}

package com.example.sistemasolar

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class SistemaSolarActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistema_solar)

        findViewById<Button>(R.id.btnVerPlanetas).setOnClickListener {
            startActivity(Intent(this, PlanetasActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}

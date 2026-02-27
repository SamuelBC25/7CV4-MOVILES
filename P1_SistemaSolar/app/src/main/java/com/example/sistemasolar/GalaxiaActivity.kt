package com.example.sistemasolar

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GalaxiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galaxia)

        findViewById<Button>(R.id.btnExplorarSistema).setOnClickListener {
            val intent = Intent(this, SistemaSolarActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloVida", "Galaxia: Usuario ha regresado al inicio de la jerarquía [cite: 51]")
    }
}
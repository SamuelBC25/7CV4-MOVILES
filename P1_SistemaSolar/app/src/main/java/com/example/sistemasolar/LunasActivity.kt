package com.example.sistemasolar

import android.app.Activity
import android.os.Bundle
import android.util.Log

class LunasActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunas)

        Log.d("CicloVida", "Lunas: Se ha alcanzado el nivel más profundo de la jerarquía")
    }
}

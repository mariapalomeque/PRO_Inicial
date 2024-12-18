package com.example.instituttic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Perfil_Alum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.perfil_alumno)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val horarioButton = findViewById<Button>(R.id.btn_horario)
        val asistenciasButton = findViewById<Button>(R.id.btn_asistencias)
        val perfilButton = findViewById<Button>(R.id.btn_perfil)
        val cerrarsesion= findViewById<ImageButton>(R.id.btn_cerrarsesion)

        horarioButton.setOnClickListener {
            val intent = Intent(this, Horario_Alum::class.java)
            startActivity(intent)
        }
        asistenciasButton.setOnClickListener {
            val intent = Intent(this, Asistencias_Alum::class.java)
            startActivity(intent)
        }
        perfilButton.setOnClickListener {
            val intent = Intent(this, Perfil_Alum::class.java)
            startActivity(intent)
        }

        cerrarsesion.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}

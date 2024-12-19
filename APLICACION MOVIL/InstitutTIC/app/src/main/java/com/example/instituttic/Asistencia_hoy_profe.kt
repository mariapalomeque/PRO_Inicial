package com.example.instituttic

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Asistencia_hoy_profe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.asistencias_hoy_prof)

        // Ajustar padding para las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }




        val horarioButton = findViewById<LinearLayout>(R.id.btn_horario)
        val asistenciasButton = findViewById<LinearLayout>(R.id.btn_asistencias)
        val perfilButton = findViewById<LinearLayout>(R.id.btn_perfil)
        val asignatura=findViewById<LinearLayout>(R.id.asignatura)




        asignatura.setOnClickListener {
            val intent = Intent(this, Pasar_llista_profe::class.java)
            startActivity(intent)
        }


        horarioButton.setOnClickListener {
            val intent = Intent(this, Horario_Profe::class.java)
            startActivity(intent)
        }
        asistenciasButton.setOnClickListener {
            val intent = Intent(this, Asistencias_Prof::class.java)
            startActivity(intent)
        }

        perfilButton.setOnClickListener {
            val intent = Intent(this, Perfil_Profe::class.java)
            startActivity(intent)
        }




    }
}

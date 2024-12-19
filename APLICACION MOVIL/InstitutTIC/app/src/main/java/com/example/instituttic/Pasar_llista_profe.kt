package com.example.instituttic

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pasar_llista_profe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pasar_llista_profe)

        // Ajustar padding para las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navegación en la barra inferior
        val horarioButton = findViewById<LinearLayout>(R.id.btn_horario)
        val asistenciasButton = findViewById<LinearLayout>(R.id.btn_asistencias)
        val perfilButton = findViewById<LinearLayout>(R.id.btn_perfil)

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

        // Botones de control de asistencia
        val btnAsistencia = findViewById<Button>(R.id.btn_asistencia)
        val btnRetraso = findViewById<Button>(R.id.btn_retraso)
        val btnFalta = findViewById<Button>(R.id.btn_falta)
        val btnFaltaJustificada = findViewById<Button>(R.id.btn_falta_justificada)

        // Lista de botones para iterar fácilmente
        val botones = listOf(btnAsistencia, btnRetraso, btnFalta, btnFaltaJustificada)

        // Establece un listener a cada botón
        for (boton in botones) {
            boton.setOnClickListener {
                // Cambia el color de todos los botones a negro
                for (b in botones) {
                    b.setBackgroundColor(Color.BLACK) // Cambia a negro
                    b.setTextColor(Color.WHITE) // Cambia el texto a blanco
                }
                // Cambia el color del botón seleccionado a azul
                boton.setBackgroundColor(Color.parseColor("#2596BE")) // Azul original
                boton.setTextColor(Color.WHITE) // Texto blanco
            }
        }
    }
}

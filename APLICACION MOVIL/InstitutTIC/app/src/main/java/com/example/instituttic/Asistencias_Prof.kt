package com.example.instituttic

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Asistencias_Prof : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_assistencia_menu)

        // Ajustar padding para las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }




        val horarioButton = findViewById<Button>(R.id.btn_horario)
        val asistenciasButton = findViewById<Button>(R.id.btn_asistencias)
        val perfilButton = findViewById<Button>(R.id.btn_perfil)

        val asistenciashoy_image=findViewById<ImageButton>(R.id.asistencias_hoy_imagebut)
        val btn_asistencias_hoy=findViewById<Button>(R.id.btn_asistencias_hoy)
        val btn_consultar_asssistencia=findViewById<Button>(R.id.btn_consultar_asssistencia)
        val consultaasistencias_image=findViewById<ImageButton>(R.id.consultaasistencias_image)


        btn_consultar_asssistencia.setOnClickListener {
            val intent = Intent(this, ConsultarAsistenciaProfe::class.java)
            startActivity(intent)
        }
        consultaasistencias_image.setOnClickListener {
            val intent = Intent(this, ConsultarAsistenciaProfe::class.java)
            startActivity(intent)
        }

        asistenciashoy_image.setOnClickListener {
            val intent = Intent(this, Asistencia_hoy_profe::class.java)
            startActivity(intent)
        }

        btn_asistencias_hoy.setOnClickListener {
            val intent = Intent(this, Asistencia_hoy_profe::class.java)
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

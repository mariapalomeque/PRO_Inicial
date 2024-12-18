package com.example.instituttic

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registro_Admin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.menu_registro_admin)

        // Ajustar padding para las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val horarioButton = findViewById<Button>(R.id.btn_horario)
        val registroButton = findViewById<Button>(R.id.btn_registro)
        val asistenciasButton = findViewById<Button>(R.id.btn_asistencias)
        val perfilButton = findViewById<Button>(R.id.btn_perfil)
        val reg_alum_image = findViewById<ImageButton>(R.id.buton_register_new_alum)
        val reg_alum_but = findViewById<Button>(R.id.btn_regis_alum_nuevo)


        reg_alum_but.setOnClickListener {
            val intent = Intent(this, Registro_nuevo_alumno::class.java)
            startActivity(intent)
        }
        reg_alum_image.setOnClickListener {
            val intent = Intent(this, Registro_nuevo_alumno::class.java)
            startActivity(intent)
        }


        horarioButton.setOnClickListener {
            val intent = Intent(this, Horario_Admin::class.java)
            startActivity(intent)
        }
        asistenciasButton.setOnClickListener {
            val intent = Intent(this, Asistencias_Admin::class.java)
            startActivity(intent)
        }

        perfilButton.setOnClickListener {
            val intent = Intent(this, Perfil_Admin::class.java)
            startActivity(intent)
        }
        registroButton.setOnClickListener {
            val intent = Intent(this, Registro_Admin::class.java)
            startActivity(intent)
        }



    }
}

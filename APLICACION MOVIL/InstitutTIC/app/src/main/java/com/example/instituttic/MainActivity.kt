package com.example.instituttic

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // INSERT
        val btnLogin = findViewById<Button>(R.id.but_Alum)
        btnLogin.setOnClickListener {
            val intent = Intent(this, Inicio_Sesion::class.java)
            startActivity(intent)
        }

        val btnLoginAdmin = findViewById<Button>(R.id.ButAdmin)
        btnLoginAdmin.setOnClickListener {
            val intent = Intent(this, Inicio_Sesion_Admin::class.java)
            startActivity(intent)
        }

        val btnLoginProfe = findViewById<Button>(R.id.But_Maestro)
        btnLoginProfe.setOnClickListener {
            val intent = Intent(this, Inicio_Sesion_Profe::class.java)
            startActivity(intent)
        }
    }
}

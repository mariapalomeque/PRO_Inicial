package com.example.instituttic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Inicio_Sesion_Profe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.inicio_sesion_profe)

        val edittextCorreo = findViewById<EditText>(R.id.emailField)
        val edittextContrasena = findViewById<EditText>(R.id.contrasenaField)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val logButt = findViewById<Button>(R.id.loginButton)
        logButt.setOnClickListener {
            val email = edittextCorreo.text.toString().trim()
            val password = edittextContrasena.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor, rellena todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!email.endsWith("@iticbcn.cat")) {
                Toast.makeText(this, "El correo debe ser del instituto", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!isPasswordSecure(password)) {
                Toast.makeText(
                    this,
                    "La contraseña debe contener al menos una letra, un número y un símbolo",
                    Toast.LENGTH_LONG
                ).show()
                return@setOnClickListener
            }

            val intent = Intent(this, Horario_Profe::class.java)
            startActivity(intent)
        }
    }

    private fun isPasswordSecure(password: String): Boolean {
        val hasLetter = password.any { it.isLetter() }
        val hasDigit = password.any { it.isDigit() }
        val hasSymbol = password.any { !it.isLetterOrDigit() }
        return hasLetter && hasDigit && hasSymbol
    }
}

package com.example.instituttic

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registro_nuevo_alumno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.registro_nuevo_alumno)

        // Ajustar padding para las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val emailEditText = findViewById<EditText>(R.id.emailField)
        val passwordEditText = findViewById<EditText>(R.id.passwordField)
        val confirmPasswordEditText = findViewById<EditText>(R.id.confirmPasswordField)
        val createAccountButton = findViewById<Button>(R.id.create_account_buttt)

        val horarioButton = findViewById<Button>(R.id.btn_horario)
        val registroButton = findViewById<Button>(R.id.btn_registro)
        val asistenciasButton = findViewById<Button>(R.id.btn_asistencias)
        val perfilButton = findViewById<Button>(R.id.btn_perfil)

        createAccountButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString()
            val confirmPassword = confirmPasswordEditText.text.toString()

            // Validar campos vacíos
            if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "Por favor, rellena todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Validar que el correo termina en "@iticbcn.cat"
            if (!email.endsWith("@iticbcn.cat")) {
                Toast.makeText(this, "El correo debe terminar en @iticbcn.cat", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Validar que las contraseñas coinciden
            if (password != confirmPassword) {
                Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Validar la seguridad de la contraseña
            if (!isPasswordSecure(password)) {
                Toast.makeText(
                    this,
                    "La contraseña debe contener al menos una letra, un número y un símbolo",
                    Toast.LENGTH_LONG
                ).show()
                return@setOnClickListener
            }

            // Todo está correcto
            Toast.makeText(this, "Cuenta creada correctamente", Toast.LENGTH_SHORT).show()
            // Aquí puedes agregar lógica para registrar el usuario en la base de datos
        }

        // Listeners para botones inferiores
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

    // Función para validar que la contraseña contiene letras, números y símbolos
    private fun isPasswordSecure(password: String): Boolean {
        val hasLetter = password.any { it.isLetter() }
        val hasDigit = password.any { it.isDigit() }
        val hasSymbol = password.any { !it.isLetterOrDigit() }
        return hasLetter && hasDigit && hasSymbol
    }
}

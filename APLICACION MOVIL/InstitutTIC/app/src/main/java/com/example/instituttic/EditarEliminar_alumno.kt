package com.example.instituttic

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditarEliminar_alumno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.editar_eliminar_alumno)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val horarioButton = findViewById<Button>(R.id.btn_horario)
        val registroButton = findViewById<Button>(R.id.btn_registro)
        val asistenciasButton = findViewById<Button>(R.id.btn_asistencias)
        val perfilButton = findViewById<Button>(R.id.btn_perfil)

        val guardarEdicionButton = findViewById<Button>(R.id.guardaredicion)
        val eliminarCuentaButton = findViewById<Button>(R.id.but_eliminar_cuenta)

        guardarEdicionButton.setOnClickListener {
            Toast.makeText(this, "¡Usuario modificado correctamente!", Toast.LENGTH_SHORT).show()
        }

        eliminarCuentaButton.setOnClickListener {
            mostrarDialogoConfirmacion()
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

    private fun mostrarDialogoConfirmacion() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Confirmación de eliminación")
        builder.setMessage("¿Estás seguro de que quieres eliminar esta cuenta?")

        builder.setPositiveButton("Sí") { dialog, _ ->
            Toast.makeText(this, "¡Cuenta eliminada!", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        builder.setNegativeButton("No") { dialog, _ ->
            dialog.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}

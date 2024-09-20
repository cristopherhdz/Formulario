package com.example.formulario_2


import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    private lateinit var editNombre: EditText
    private lateinit var editEdad: EditText
    private lateinit var editCorreo: EditText
    private lateinit var editNumeroTelefono: EditText
    private lateinit var buttonEnviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNombre = findViewById(R.id.editNombre)
        editEdad = findViewById(R.id.editEdad)
        editCorreo = findViewById(R.id.editCorreo)
        editNumeroTelefono = findViewById(R.id.editNumeroTelefono)
        buttonEnviar = findViewById(R.id.buttonEnviar)

        buttonEnviar.setOnClickListener {
            validarFormulario()
        }
    }

    private fun validarFormulario() {
        val nombre = editNombre.text.toString().trim()
        val edad = editEdad.text.toString().trim()
        val correo = editCorreo.text.toString().trim()
        val telefono = editNumeroTelefono.text.toString().trim()

        if (nombre.isEmpty() || edad.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
            Toast.makeText(this, "Por favor, completa todos los campos.", Toast.LENGTH_SHORT).show()
        } else {
            mostrarDatos(nombre, edad, correo, telefono)
        }
    }

    private fun mostrarDatos(nombre: String, edad: String, correo: String, telefono: String) {
        // Aquí se puede crear una nueva Activity o cambiar la vista
        setContentView(R.layout.activity_datos) // Cambia a tu nueva vista (debes crear activity_datos.xml)

        val textViewDatos = findViewById<TextView>(R.id.textViewDatos)
        textViewDatos.text = "Nombre: $nombre\nEdad: $edad\nCorreo: $correo\nTeléfono: $telefono"
    }
}


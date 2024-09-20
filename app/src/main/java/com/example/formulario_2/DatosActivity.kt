package com.example.formulario_2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DatosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)  // Asegúrate de tener este layout

        // Aquí puedes obtener los datos y mostrarlos en un TextView
        val textViewDatos = findViewById<TextView>(R.id.textViewDatos)
        val nombre = intent.getStringExtra("NOMBRE")
        val edad = intent.getStringExtra("EDAD")
        val correo = intent.getStringExtra("CORREO")
        val telefono = intent.getStringExtra("TELEFONO")

        textViewDatos.text = "Nombre: $nombre\nEdad: $edad\nCorreo: $correo\nTeléfono: $telefono"
    }
}

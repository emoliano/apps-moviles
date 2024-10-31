package com.example.myapplication


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

        private lateinit var txtNombre: EditText
        private lateinit var btnPulsar: Button
        private lateinit var btnLimpiar: Button
        private lateinit var btnCerrar: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            txtNombre = findViewById(R.id.txtNombre)
            btnPulsar = findViewById(R.id.btnPulsar)
            btnLimpiar = findViewById(R.id.btnLimpiar)
            btnCerrar = findViewById(R.id.btnCerrar)


            btnPulsar.setOnClickListener {
                val nombre = txtNombre.text.toString()
                if (nombre.isNotBlank()) {
                    Toast.makeText(this, "Hola, $nombre!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Por favor, introduce tu nombre", Toast.LENGTH_SHORT).show()
                }
            }

            // Configura el botón Limpiar
            btnLimpiar.setOnClickListener {
                txtNombre.text.clear()
            }

            // Configura el botón Cerrar
            btnCerrar.setOnClickListener {
                finish() // Cierra la actividad actual
            }
        }
    }




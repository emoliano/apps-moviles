package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menuactivity : AppCompatActivity() {
    private lateinit var crvHola : CardView
    private lateinit var crvIMC : CardView
    private lateinit var crvGrados : CardView
    private lateinit var crvMoneda : CardView
    private lateinit var crvCotizacion : CardView
    private lateinit var crvSalir : CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menuactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun iniciarComponentes(){
        crvHola=findViewById(R.id.crvHola)  as CardView
        crvHola=findViewById(R.id.crvIMC)  as CardView
        crvHola=findViewById(R.id.crvConvetidor)  as CardView
        crvHola=findViewById(R.id.crvCotizacion)  as CardView
        crvHola=findViewById(R.id.crvConvertidor)  as CardView
        crvHola=findViewById(R.id.crvSalida)  as CardView
    }
    fun eventosClick(){
        crvHola.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        crvIMC.setOnClickListener(View.OnClickListener{
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
            }
            }


            }}








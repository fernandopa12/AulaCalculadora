package com.example.aulacalculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var primeiroNumero : EditText = findViewById(R.id.editTxtPrimeiroNum)
        var segundoNumero : EditText = findViewById(R.id.editTxtSegundoNum)
        var btnSomar:Button = findViewById(R.id.btnSomar)
        var txtResultado:TextView = findViewById(R.id.txtViewResultado)
        var imgResultado:ImageView = findViewById(R.id.imgSomar)

        imgResultado.setOnClickListener{
            var resultado = primeiroNumero.text.toString().toDouble() +
                    segundoNumero.text.toString().toDouble()

            txtResultado.setText("Resultado da soma: ${resultado}")

            //println("Resultado da soma ${resultado}")
        }

    }
}
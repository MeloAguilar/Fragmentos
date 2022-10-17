package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnRojo : Button = findViewById<View>(R.id.fragmento_rojo).findViewById(R.id.btnFrRojo)
        var btnVerde:Button = findViewById<View>(R.id.fragmento_verde).findViewById(R.id.btnFrVerde)
        var txtAzul:TextView = findViewById<View>(R.id.fragmento_azul).findViewById(R.id.btnFrAzul)
        var contador = 0


        btnRojo?.setOnClickListener{
            contador++
            txtAzul.text = contador.toString()
        }
    }


}
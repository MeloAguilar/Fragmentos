package com.example.fragmentos

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity(), Comunicador {


  private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onClickRestar() {
        var texto = findViewById<TextView>(R.id.btnFrAzul)
        if(contador > 0){
            contador--
        }


        texto.text = contador.toString()

    }



    override fun onClickSumar() {
        var texto = findViewById<TextView>(R.id.btnFrAzul)
        contador++
        if(contador == 11)
        {
            AlertDialog.Builder(this)
                .setTitle("PARA DE CLICAR COÑO")
                .setMessage("Pulse si para parar el contador o no para seguir sumando")
                .setPositiveButton("si") { dialog, which ->
                    texto.text = contador.toString()
                }
                .setNegativeButton("no"){dialog,which -> contador--}

                .setIcon(R.drawable.ic_launcher_background)
                .show()
        }else {
            texto.text = contador.toString()
        }

    }
}



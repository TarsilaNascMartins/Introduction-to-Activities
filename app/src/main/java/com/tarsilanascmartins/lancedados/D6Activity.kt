package com.tarsilanascmartins.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class D6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d6)

    val voltarinicio = findViewById<Button>(R.id.inicio)

      voltarinicio.setOnClickListener {
        finish()
    }

        val lanca6 = findViewById<Button>(R.id.lanca6)

        lanca6.setOnClickListener {
         rolardados(lados = 6)

        }


    }
    fun rolardados(lados:Int) {
        val valor = (1..lados).random()

        val textResult = findViewById<TextView>(R.id.textD6)
        textResult.text = valor.toString()

        val imagemresource= imagemretorno(valor)
        val imagemD6 = findViewById<ImageView>(R.id.imagemD6)
        imagemD6.setImageResource(imagemresource)

    }


    fun imagemretorno (valor:Int) :Int {

        return when(valor){

            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5_
            else -> R.drawable.d6
        }
    }
}
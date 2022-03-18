package com.tarsilanascmartins.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class D20Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d20)

        val voltarD20 = findViewById<Button>(R.id.voltarD20)

        voltarD20.setOnClickListener {
            finish()
        }

        val lance20 = findViewById<Button>(R.id.lance20)

        lance20.setOnClickListener {

            val imagemD20 = findViewById<ImageView>(R.id.imagemD20)
            imagemD20.setImageResource( R.drawable.imgdado20)

           rolardados(lados = 20)


        }



    }
    fun rolardados(lados:Int){
        val valor = (1..lados).random()

        val textResult = findViewById<TextView>(R.id.textD20)
        textResult.text = valor.toString()
    }
}
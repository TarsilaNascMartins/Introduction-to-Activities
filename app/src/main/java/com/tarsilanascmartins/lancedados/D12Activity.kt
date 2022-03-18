package com.tarsilanascmartins.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class D12Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d12)


        val voltar12 = findViewById<Button>(R.id.voltarD12)

        voltar12.setOnClickListener {
            finish()
        }

        val ative12 = findViewById<Button>(R.id.ative12)

        ative12.setOnClickListener {

            val imagemD12 = findViewById<ImageView>(R.id.imagemD12)
            imagemD12.setImageResource( R.drawable.imgdado20)

           rolardados(lados = 12)
        }







    }fun rolardados(lados:Int){
        val valor = (1..lados).random()

        val textResult = findViewById<TextView>(R.id.textD12)
        textResult.text = valor.toString()
    }
}
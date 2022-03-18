package com.tarsilanascmartins.lancedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

    val bD6 = findViewById<Button>(R.id.bD6)
    val bD12 = findViewById<Button>(R.id.bD12)
    val bD20 = findViewById<Button>(R.id.bD20)

        val IntentD6 = Intent(this,D6Activity::class.java )
        val IntentD12 = Intent(this,D12Activity::class.java )
        val IntentD20 = Intent(this,D20Activity::class.java )

    bD6.setOnClickListener {
        startActivity(IntentD6)
    }

    bD12.setOnClickListener {
            startActivity(IntentD12)
        }

    bD20.setOnClickListener {
            startActivity(IntentD20)
        }




    }






}
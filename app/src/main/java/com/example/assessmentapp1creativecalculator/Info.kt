package com.example.assessmentapp1creativecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_instructions.*

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        backbtn.setOnClickListener {
            val intent = Intent(this, Calculator::class.java)
            startActivity(intent)

        }
    }
}
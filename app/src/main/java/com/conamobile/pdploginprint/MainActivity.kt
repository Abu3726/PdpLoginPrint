package com.conamobile.pdploginprint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var button: Button
lateinit var edt1: EditText
lateinit var edt2: EditText
lateinit var txt1: TextView
lateinit var txt2: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn)
        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        txt1 = findViewById(R.id.txt1)
        txt2 = findViewById(R.id.txt2)

        button.setOnClickListener {
            txt1.text = edt1.text
            txt2.text = edt2.text
        }

    }
}
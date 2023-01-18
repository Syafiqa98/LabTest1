package com.example.mindsharpener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generator = findViewById<EditText>(R.id.editTextTextPersonName)

        button.setOnClickListener{
            val myToast = Toast.makeText(applicationContext, generator.toString(),
            Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener{
            val myIntent = Intent(this, CounterActivity::class.java)
            startActivity(myIntent)
        }

    }
}
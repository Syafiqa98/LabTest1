package com.example.mindsharpener

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class RandomActivity : AppCompatActivity{

    var radnum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        tvrandom.setText("" + radnum)

        btntoast.setOnClickListener{
            val myToast = Toast.makeText(this, tvrandom.toString(), Toast.LENGTH_SHORT).show()
        }

        btnrandomgen.setOnClickListener {
            val rand = (0 until 100).shuffled().last()
            tvrandom.setText("" + rand)
        }
    }
}
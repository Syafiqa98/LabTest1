package com.example.mindsharpener

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_counter.*

class CounterActivity {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        tvtext.setText("" + count)

        btnplus.setOnClickListener {
            tvtext.setText("" + ++count)
        }

        btnminus.setOnClickListener {
            tvtext.setText("" + --count)
        }

        btnrandom.setOnClickListener {
            val intentran = Intent(this, RandomActivity::class.java)
            startActivity(intentran)
        }
    }
}
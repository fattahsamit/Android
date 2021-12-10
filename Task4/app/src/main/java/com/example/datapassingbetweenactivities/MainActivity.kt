package com.example.datapassingbetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener {
            val name = editName.text.toString()
            val age = editAge.text.toString()
            val country = editCountry.text.toString()

            Intent(this, SecondActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}
package com.example.pdfreader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnL1.setOnClickListener {
            Intent(this, SubActivity1::class.java).also {
                startActivity(it)
            }
        }

        btnL2.setOnClickListener {
            Intent(this, SubActivity2::class.java).also {
                startActivity(it)
            }
        }

        btnL3.setOnClickListener {
            Intent(this, SubActivity3::class.java).also {
                startActivity(it)
            }
        }

        btnL4.setOnClickListener {
            Intent(this, SubActivity4::class.java).also {
                startActivity(it)
            }
        }

        btnL5.setOnClickListener {
            Intent(this, SubActivity5::class.java).also {
                startActivity(it)
            }
        }

        btnLb.setOnClickListener {
            Intent(this, SubActivityb::class.java).also {
                startActivity(it)
            }
        }

    }
}
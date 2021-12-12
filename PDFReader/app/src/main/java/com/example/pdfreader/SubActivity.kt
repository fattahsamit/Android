package com.example.pdfreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        pdfview.fromAsset("Lecture1.pdf")
//            .pages(0,2,4) //Allow no. of pages to display to the user
            .enableSwipe(true)
            .swipeHorizontal(true)
            .scrollHandle(DefaultScrollHandle(this))
            .load()
    }
}
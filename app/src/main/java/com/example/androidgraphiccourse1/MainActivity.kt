package com.example.androidgraphiccourse1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//      To draw shapes
//        val circleView = MyViewShapes(this)
//        setContentView(circleView)
//      TO draw lines

        val line = DrawLineView(this)
        setContentView(line)
    }
}
package com.example.androidgraphiccourse1

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class MyViewShapes(context: Context) : View(context ,null){

    private val redPaint : Paint =  Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawCircle(300F , 300F , 30F , redPaint)
    }
    init {
        redPaint.alpha = 1
        redPaint.style = (Paint.Style.STROKE)
        redPaint.strokeWidth = 5F //set the line stroke width to 5
        redPaint.color = Color.GREEN
    }
}
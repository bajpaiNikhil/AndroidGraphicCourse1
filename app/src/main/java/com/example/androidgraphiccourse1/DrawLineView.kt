package com.example.androidgraphiccourse1

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.Log
import android.view.View


//class MyView : View {
//    private var mylines = Path()
//    private var redPaint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
//    private var greenPaint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
//
//    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
//        init()
//    }
//
//    constructor(context: Context?) : super(context, null) {
//        init()
//    }
//
//    private fun init() {
//
//        redPaint.setStyle(Paint.Style.STROKE)
//        redPaint.setColor(-0x10000)
//        redPaint.setStrokeWidth(5F)
//
//        greenPaint.setStyle(Paint.Style.STROKE)
//        greenPaint.setARGB(255, 0, 255, 0)
//        greenPaint.setStrokeWidth(5F)
//    }
//
//    override fun onDraw(canvas: Canvas) {
//        super.onDraw(canvas)
//        canvas.drawRect(10F, 30F, 200F, 200F, redPaint)
//        canvas.drawCircle(300F, 300F, 250F, redPaint)
//        mylines.moveTo(0f, 0f)
//        mylines.lineTo(200f, 50f)
//        mylines.lineTo(300f, 150f)
//        mylines.lineTo(400f, 250f)
//        mylines.lineTo(500f, 300f)
//        canvas.drawPath(mylines, greenPaint)
//    }
//}

class DrawLineView(context: Context) : View(context , null){
    private val myLines = Path()
    private val greenPaint : Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        myLines.moveTo(0F, 0F)
        myLines.lineTo(200F, 50F)
        myLines.lineTo(300F, 150F)
        myLines.lineTo(400F, 250F)
        myLines.lineTo(500F, 300F)
        greenPaint.style = Paint.Style.STROKE
        greenPaint.strokeWidth = 5F
        greenPaint.setARGB(255,0,255,0)
        canvas.drawPath(myLines , greenPaint)
        Log.d("drawLineView" , "reached till here")

    }
}

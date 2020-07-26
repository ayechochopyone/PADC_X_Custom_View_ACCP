package com.padcmyanmar.component_view_assign_accp.views.components

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import androidx.core.content.withStyledAttributes
import com.padcmyanmar.component_view_assign_accp.R

private const val LABEL = -20
class CircleProgressBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr){

    private val paintBg = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paintText = Paint(Paint.ANTI_ALIAS_FLAG)

    private var borderWidth = 10f

    private var circleColor = Color.WHITE
    private var borderColor = Color.GREEN
    private var reachedColor = Color.RED
    private var mLabelColor = Color.BLACK
    private var text = "85%"
    private var percent = 0f
    val rec = RectF()


    init {
        context.withStyledAttributes(attrs, R.styleable.CircleProgressBar){
            reachedColor = getColor(R.styleable.CircleProgressBar_goalReachedColor, Color.RED)
            borderColor = getColor(R.styleable.CircleProgressBar_borderColor, Color.GREEN)
            borderWidth = getDimension(R.styleable.CircleProgressBar_borderWidth,0f)
            percent = getFloat(R.styleable.CircleProgressBar_percent,0f)
        }
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paintBg.color = borderColor
        paintBg.style = Paint.Style.STROKE
        paintBg.strokeWidth = borderWidth

        paint.color = reachedColor
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        rec.set(10f,10f,width.toFloat()-10, height.toFloat()-10)
        canvas?.drawArc(rec, -90f, 360f, false, paintBg)
        if(percent!=0f){
            canvas?.drawArc(rec, -90f, (3.6f*percent), false,paint)
        }
        paintText.textAlign = Paint.Align.CENTER
        paintText.typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        paintText.textSize = 40f
        val xPos = width/2f
        val yPos = (height/2f) -((paintText.descent() + paintText.ascent())/2f)
        canvas?.drawText(text , xPos, yPos, paintText)

    }
}
package com.padcmyanmar.component_view_assign_accp.views.components

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.View
import androidx.core.content.withStyledAttributes
import com.padcmyanmar.component_view_assign_accp.R

private const val LABEL = -30
class LineProgressBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr){

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var lineColor = Color.GRAY
    private var borderColor = Color.BLUE
    private var reachedColor = Color.GREEN
    private var mLabelColor = Color.BLACK
    private var mlabel = "references-1"
    private var mkb = "168KB"
    private var borderWidth = 4.0f
    private var barHeight = 0f


    init {
        context.withStyledAttributes(attrs, R.styleable.LineProgressBar){
            reachedColor = getColor(R.styleable.LineProgressBar_reachedColor, Color.GREEN)
            lineColor = getColor(R.styleable.LineProgressBar_unReachedLongColor, Color.GRAY)
            barHeight = getDimension(R.styleable.LineProgressBar_longBarheight, 0f)
            mlabel = getString(R.styleable.LineProgressBar_reference)?:mlabel
            mkb = getString(R.styleable.LineProgressBar_kb)?:mkb
        }
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        drawLine(canvas)

    }

    private fun drawLine(canvas: Canvas){

        barHeight = height/2f
        paint.color = lineColor
        paint.style = Paint.Style.FILL_AND_STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(0f,barHeight, width.toFloat(), barHeight, paint )

        paint.color = reachedColor
        paint.style = Paint.Style.FILL_AND_STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(0f, barHeight, width.toFloat()* 0.8f , barHeight, paint)

        val label = barHeight+ LABEL

        paint.typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        paint.textSize = 20f
        paint.color = mLabelColor
        canvas.drawText(mlabel,0f, label,paint)

        paint.color = Color.GRAY
        paint.textSize = 20f
        canvas.drawText(mkb, width.toFloat()*0.9f ,label,paint)

    }
}

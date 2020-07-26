package com.padcmyanmar.component_view_assign_accp.views.components

import android.content.Context
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.withStyledAttributes
import com.padcmyanmar.component_view_assign_accp.R

/*
class CircleImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr){


    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var cornerRadius = 0f
    private var circleColor = Color.GREEN
    private val borderColor = Color.WHITE
    private var borderWidth = 5.0f

    private val path = Path()

    init {
        context.withStyledAttributes(attrs, R.styleable.CircleImageView){
            cornerRadius = getDimension(R.styleable.CircleImageView_cornerRadius, 0f)
            circleColor = getColor(R.styleable.CircleImageView_circleColor, Color.GREEN)

        }
    }
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val rectangle = RectF(0f, 0f, width.toFloat(),height.toFloat())
        path.addRoundRect(rectangle, cornerRadius , cornerRadius, Path.Direction.CCW)
        canvas?.clipPath(path)
    }
}*/

/*
class CircleImageView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr){


    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var cornerRadius = 0f
    private var circleColor = Color.GREEN
    private val borderColor = Color.WHITE
    private var borderWidth = 5.0f

    private val path = Path()

    init {
        context.withStyledAttributes(attrs, R.styleable.CircleImageView){
            cornerRadius = getDimension(R.styleable.CircleImageView_cornerRadius, 0f)
            circleColor = getColor(R.styleable.CircleImageView_circleColor, Color.GREEN)

        }
    }
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val rectangle = RectF(0f, 0f, width.toFloat(),height.toFloat())
        path.addRoundRect(rectangle, cornerRadius , cornerRadius, Path.Direction.CCW)
        canvas?.clipPath(path)
    }
}*/

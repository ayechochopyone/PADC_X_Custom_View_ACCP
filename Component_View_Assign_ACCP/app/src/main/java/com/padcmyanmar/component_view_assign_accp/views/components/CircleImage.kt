package com.padcmyanmar.component_view_assign_accp.views.components

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.withStyledAttributes
import com.padcmyanmar.component_view_assign_accp.R

class CircleImage @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    private var cornerRadius = 0f
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var size = 0

    private val path = Path()
    init {

        context.withStyledAttributes(attrs, R.styleable.CircleImage) {
            cornerRadius = getDimension(R.styleable.CircleImage_imgCircleradius, 0f)
        }
    }
    override fun onDraw(canvas: Canvas?) {
        val rectangle = RectF(0f, 0f, width.toFloat(), height.toFloat())

        path.addRoundRect(rectangle, cornerRadius, cornerRadius, Path.Direction.CCW)

        canvas?.clipPath(path)

        super.onDraw(canvas)
        drawBorder(canvas)
    }

    private fun drawBorder(canvas: Canvas?){
        paint.color = Color.WHITE
        paint.style= Paint.Style.STROKE
        paint.strokeWidth = DEFAULT_BORDER_WIDTH

        val radius = width/2f
        canvas?.drawCircle(width / 2f, width / 2f, radius - DEFAULT_BORDER_WIDTH / 2f, paint)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        // 1 get minimum value
        size = measuredWidth.coerceAtMost(measuredHeight)

        // 2 override width and height
        setMeasuredDimension(size, size)
    }

    companion object
    {
        private const val DEFAULT_BORDER_WIDTH = 5.0f
    }

}
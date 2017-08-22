package cn.pan.drawdemo.draw;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import cn.pan.drawdemo.R;

@TargetApi(21)
public class PieChartView extends View {
    private Paint linePaint = new Paint();
    private Paint arcPaint = new Paint();

    private RectF boundsRect;
    private Path path;

    private int mWidth;
    private int mHeight;

    public PieChartView(Context context) {
        super(context);
        init();
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        linePaint.setAntiAlias(true);
        linePaint.setStyle(Paint.Style.FILL);
        linePaint.setColor(Color.WHITE);
        linePaint.setStrokeWidth(2);

        arcPaint.setAntiAlias(true);
        arcPaint.setStyle(Paint.Style.FILL);
        arcPaint.setStrokeWidth(2);

        path = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mWidth = getWidth();
        mHeight = getHeight();

        boundsRect = new RectF(150, 80, mWidth - 320, mHeight - 300);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        arcPaint.setColor(Color.parseColor("#f54236"));
        canvas.drawArc(new RectF(140, 70, mWidth - 340, mHeight - 320), -180, 115, true, arcPaint);

        arcPaint.setColor(Color.parseColor("#ffc106"));
        canvas.drawArc(boundsRect, -65, 65, true, arcPaint);

        arcPaint.setColor(Color.parseColor("#9d26b1"));
        canvas.drawArc(boundsRect, 4, 8, true, arcPaint);

        arcPaint.setColor(Color.parseColor("#9f9f9f"));
        canvas.drawArc(boundsRect, 14, 6, true, arcPaint);

        arcPaint.setColor(Color.parseColor("#009789"));
        canvas.drawArc(boundsRect, 22, 55, true, arcPaint);

        arcPaint.setColor(Color.parseColor("#2097f3"));
        canvas.drawArc(boundsRect, 78, 103, true, arcPaint);
        linePaint.setTextSize(50);
        canvas.drawText(getContext().getString(R.string.title_draw_pie_chart), (mWidth / 2) - 80, mHeight - 200, linePaint);
    }
}

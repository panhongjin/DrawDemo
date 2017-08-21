package cn.pan.drawdemo.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import cn.pan.drawdemo.R;

public class HistogramView extends View {
    private Paint linePaint = new Paint();
    private Paint rectPaint = new Paint();

    private int mWidth;
    private int mHeight;

    public HistogramView(Context context) {
        super(context);
        init();
    }

    public HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        linePaint.setAntiAlias(true);
        linePaint.setStyle(Paint.Style.FILL);
        linePaint.setColor(Color.WHITE);
        linePaint.setStrokeWidth(2);

        rectPaint.setAntiAlias(true);
        rectPaint.setStyle(Paint.Style.FILL);
        rectPaint.setStrokeWidth(2);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mWidth = getWidth();
        mHeight = getHeight();

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawLine(80, 80, 80, mHeight - 350, linePaint);
        canvas.drawLine(80, mHeight - 350, mWidth - 80, mHeight - 350, linePaint);

        rectPaint.setColor(Color.GRAY);
        canvas.drawRect(110, mHeight - 355, 210, mHeight - 350, rectPaint);
        linePaint.setTextSize(30);
        canvas.drawText("Froyo", 120, mHeight - 320, linePaint);


        rectPaint.setColor(Color.parseColor("#72b916"));
        canvas.drawRect(240, mHeight - 370, 340, mHeight - 350, rectPaint);
        canvas.drawText("GB", 265, mHeight - 320, linePaint);

        canvas.drawRect(370, mHeight - 370, 470, mHeight - 350, rectPaint);
        canvas.drawText("ICS", 385, mHeight - 320, linePaint);

        canvas.drawRect(500, mHeight - 510, 600, mHeight - 350, rectPaint);
        canvas.drawText("JB", 515, mHeight - 320, linePaint);

        canvas.drawRect(630, mHeight - 630, 730, mHeight - 350, rectPaint);
        canvas.drawText("KitKat", 635, mHeight - 320, linePaint);

        canvas.drawRect(760, mHeight - 710, 860, mHeight - 350, rectPaint);
        canvas.drawText("L", 780, mHeight - 320, linePaint);

        canvas.drawRect(890, mHeight - 500, 990, mHeight - 350, rectPaint);
        canvas.drawText("M", 910, mHeight - 320, linePaint);

        linePaint.setTextSize(50);
        canvas.drawText(getContext().getString(R.string.title_draw_histogram), (mWidth / 2) - 80, mHeight - 200, linePaint);
    }
}

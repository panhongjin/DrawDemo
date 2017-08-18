package cn.pan.drawdemo.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * author : Pan
 * time   : 2017/8/18
 * desc   : xxxx描述
 * version: 1.0
 * <p>
 * Copyright: Copyright (c) 2017
 * Company:深圳彩讯科技有限公司
 */

public class DrawCircleView extends View {
    private static final String TAG = "DrawCircleView";

    private Paint paint = new Paint();

    public DrawCircleView(Context context) {
        super(context);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //        练习内容：使用 canvas.drawCircle() 方法画圆
        //        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        paint.setAntiAlias(true);
        canvas.drawCircle(300, 180, 150, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(750, 180, 150, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(300, 500, 150, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(750, 500, 150, paint);

    }
}

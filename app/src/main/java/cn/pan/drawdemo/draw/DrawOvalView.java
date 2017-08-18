package cn.pan.drawdemo.draw;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
@TargetApi(21)
public class DrawOvalView extends View {

    private Paint paint = new Paint();

    public DrawOvalView(Context context) {
        super(context);
    }

    public DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆
        paint.setStyle(Paint.Style.FILL);
        canvas.drawOval(50, 50, 350, 200, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawOval(400, 50, 700, 200, paint);
    }
}

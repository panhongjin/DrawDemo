package cn.pan.drawdemo.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class DrawPointView extends View {
    private static final String TAG = "DrawColorView";

    private Paint paint = new Paint();

    public DrawPointView(Context context) {
        super(context);
    }

    public DrawPointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPointView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //        练习内容：使用 canvas.drawPoint() 方法画点
        //        一个圆点，一个方点
        //        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        paint.setStrokeWidth(100);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(300, 300, paint);

        paint.setStrokeWidth(100);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(750, 300, paint);
    }
}

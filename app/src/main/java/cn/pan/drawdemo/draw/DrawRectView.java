package cn.pan.drawdemo.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class DrawRectView extends View {
    private static final String TAG = "DrawColorView";

    private Paint paint = new Paint();

    public DrawRectView(Context context) {
        super(context);
    }

    public DrawRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawRectView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //   练习内容：使用 canvas.drawRect() 方法画矩形
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(100, 100, 500, 500, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(600, 100, 1000, 500, paint);
    }
}

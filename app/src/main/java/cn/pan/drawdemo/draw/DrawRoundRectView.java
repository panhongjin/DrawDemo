package cn.pan.drawdemo.draw;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
@TargetApi(21)
public class DrawRoundRectView extends View {
    private Paint paint = new Paint();

    public DrawRoundRectView(Context context) {
        super(context);
    }

    public DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(100, 100, 500, 500, 50, 50, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRoundRect(600, 100, 1000, 500, 50, 50, paint);
    }
}

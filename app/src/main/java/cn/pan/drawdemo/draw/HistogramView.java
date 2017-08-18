package cn.pan.drawdemo.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class HistogramView extends View {
    private Paint paint = new Paint();

    public HistogramView(Context context) {
        super(context);
    }

    public HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}

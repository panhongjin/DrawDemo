package cn.pan.drawdemo.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class DrawColorView extends View {
    private static final String TAG = "DrawColorView";

    public DrawColorView(Context context) {
        super(context);
    }

    public DrawColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawColorView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.parseColor("#88880000"));
    }
}

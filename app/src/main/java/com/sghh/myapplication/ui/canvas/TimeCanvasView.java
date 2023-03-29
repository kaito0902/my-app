package com.sghh.myapplication.ui.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.sghh.myapplication.utils.log.TimeLog;

public class TimeCanvasView extends View {
    /**
     * ログTAG
     */
    private final String TAG = "HomeViewModel";
    /**
     * Paint
     */
    private final Paint mPaint;
    /**
     * RectF
     */
    private final RectF mRectF;
    /**
     * 円弧の開始角度
     */
    private float mStartAngle = 0;
    /**
     * 円弧の終了角度
     */
    private float mSweepAngle = 0;

    /**
     * PaintにColorをsetするメソッド
     */
    private void setColorPaint() {
        mPaint.setColor(Color.argb(100, 50, 50, 250));
    }

    /**
     * RectFに座標をsetするメソッド
     */
    private void setRectFAngle() {
        // 楕円の左上の座標を計算
        mRectF.left = 0;
        mRectF.top = 0;
        // 楕円の右下の座標を計算
        mRectF.right = 910;
        mRectF.bottom = 910;
    }

    /**
     * 円弧の開始角度と終了角度をsetするメソッド
     *
     * @param start_angle
     * @param sweep_angle
     */
    public void setAngle(float start_angle, float sweep_angle) {
        this.mStartAngle = start_angle;
        this.mSweepAngle = sweep_angle;
    }

    /**
     * コンストラクタ
     *
     * @param context
     * @param attributeSet
     */
    public TimeCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        // Paintを作成
        this.mPaint = new Paint();
        // 円弧にColorをset
        setColorPaint();

        this.mRectF = new RectF();
        setRectFAngle();
    }

    /**
     * {@inheritDoc}
     *
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String method = "onDraw";
        TimeLog.start(TAG, method);

        canvas.drawArc(mRectF, mStartAngle, mSweepAngle, true, mPaint);

        TimeLog.end(TAG, method);
    }
}

package com.example.puzzlesolverjava;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

public class CircleDrawable extends Drawable {

    private Paint _circlePaint;
    private int _fillColor;
    private int _strokeColor;
    private int _radius;
    private int _centerX;
    private int _centerY;
    private Canvas _canvas;

    public CircleDrawable(int fillColor, int strokeColor, int radius, Canvas canvas) {
        this._fillColor = fillColor;
        this._strokeColor = strokeColor;
        this._radius = radius;
        _circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        _centerX = getBounds().centerX();
        _centerY = getBounds().centerY();
        _canvas = canvas;
        this.draw(_canvas);
    }

    public void draw(@NonNull Canvas canvas) {
        //draw fill color circle
        _circlePaint.setStyle(Paint.Style.FILL);
        _circlePaint.setColor(_fillColor);
        _canvas.drawCircle(_centerX,_centerY,_radius,_circlePaint);
        // draw stroke circle
        _circlePaint.setStyle(Paint.Style.STROKE);
        _circlePaint.setColor(_strokeColor);
        _circlePaint.setStrokeWidth(5);
        _canvas.drawCircle(_centerX,_centerY,_radius,_circlePaint);

    }

    @Override
    public void setAlpha(int alpha) {
        _circlePaint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        _circlePaint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }

    public void setCenterX(int col) {
//        int x_bound = getBounds().centerX() * 2;
        _centerX = 2 * col * _radius;
        invalidateSelf();
//        this.draw(_canvas);
    }

    public void setCenterY(int row) {
//        int x_bound = getBounds().centerX() * 2;
        _centerY = 2 * row * _radius;
//        this.draw(_canvas);
    }

    public int getCenterX() {
        return _centerX;
    }

    public int getCenterY() {
        return _centerY;
    }

    public void setFillColor(String colorString) {
        _fillColor = Color.parseColor(colorString);
        this.draw(_canvas);
    }
}

package com.example.puzzlesolverjava;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

public class circleObject extends Drawable {
    private float _centerX;
    private float _centerY;
    private int _radius;
    private int _fillColour;
    private Paint _paint;
    private CustomView1 _view;

    public circleObject(int radius, int fillColour, CustomView1 view) {
        _radius = radius;
        _fillColour = fillColour;
        _view = view;
        _centerX = view.getBitmap().getWidth() /2;
        _centerY = view.getBitmap().getHeight()/2;
        _paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        _paint.setColor(fillColour);
        _view.addObject(this);
    }

    public void setCenterX(float x) {
        _centerX = x;
    }

    public void setCenterY(float y) {
        _centerY = y;
    }

    public float getCenterX() {
        return _centerX;
    }

    public float getCenterY() {
        return _centerY;
    }

    public void setPaint(int colour) {
        _paint.setColor(colour);
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        canvas.drawCircle(_centerX,_centerY,_radius,_paint);
        _view.setCanvas(canvas);
        _view.setImageBitmap(_view.getBitmap());
        _view.invalidate();
    }

    @Override
    public void setAlpha(int alpha) {
        _paint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        _paint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}

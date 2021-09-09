package com.example.puzzlesolverjava;

import android.graphics.Canvas;
import android.graphics.Color;
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
    private Boolean _empty;
    private String _type;

    public circleObject(int radius, int fillColour, CustomView1 view) {
        _radius = radius;
        _fillColour = fillColour;
        _view = view;
        _centerX = 0;
        _centerY = 0;
        _type = "empty";
//        _empty = false;
        _paint = new Paint(Paint.ANTI_ALIAS_FLAG);
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

    public void setPaint(int colour, Paint.Style style) {
        _paint.setStyle(style);
        _paint.setColor(colour);
    }

    public void setType(String type) {
        _type = type;
    }

    public String getType() {
        return _type;
    }

    public void type_draw() {
        switch (_type) {
            case "board":
                this.setPaint(Constants.BOARD_COLOUR, Paint.Style.FILL);
//                this.setPaint(Constants.BOARD_COLOUR, Paint.Style.STROKE);
                break;
            case "empty":
                this.setPaint(Color.BLACK, Paint.Style.STROKE);
                _paint.setStrokeWidth(5);
                break;
            case "piece":
                this.setPaint(_fillColour, Paint.Style.FILL);
//                this.setPaint(_fillColour, Paint.Style.STROKE);
                break;
        }
    }

    public void setFillColour(int colour) {
        _fillColour = colour;
    }

    public int getFillColour() {
        return _fillColour;
    }


    public void setEmpty(Boolean val) {
        _empty = val;
    }

    public Boolean getEmpty() {
        return _empty;
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        this.type_draw();
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

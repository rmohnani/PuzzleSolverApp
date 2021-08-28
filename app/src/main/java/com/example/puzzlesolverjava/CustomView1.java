package com.example.puzzlesolverjava;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;

import java.util.ArrayList;

public class CustomView1 extends androidx.appcompat.widget.AppCompatImageView {

    private Canvas _canvas;
    private Bitmap _bitmap;
    private ArrayList<circleObject> _objects = new ArrayList<circleObject>();
    private ArrayList<gameCircle> _gameCircles = new ArrayList<gameCircle>();


    public CustomView1(Context context) {
        super(context);
        this.setBackgroundColor(Color.GREEN);
        _bitmap = Bitmap.createBitmap(300,400,Bitmap.Config.ARGB_8888);
    }

    public CustomView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        _bitmap = Bitmap.createBitmap(300,400,Bitmap.Config.ARGB_8888);
    }

    public CustomView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        _bitmap = Bitmap.createBitmap(300,400,Bitmap.Config.ARGB_8888);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        for(circleObject circle: _objects) {
            circle.draw(canvas);
        }
//        for (gameCircle circle: _gameCircles) {
//            circle.draw(canvas);
//        }
        _canvas = canvas;
//        super.onDraw(canvas);
//        this.postInvalidate();
//        this.postInvalidateDelayed(1000);

    }

    public Canvas getCanvas() {
        return _canvas;
    }

    public void setCanvas(Canvas canvas) {
        _canvas = canvas;
    }

    public Bitmap getBitmap() {
        return _bitmap;
    }

    public void addObject(circleObject circle) {
        _objects.add(circle);
    }

    public ArrayList<circleObject> getObjects() {
        return _objects;
    }

}

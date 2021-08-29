package com.example.puzzlesolverjava;

import android.graphics.Canvas;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        CustomView1 board = new CustomView1(this);
        setContentView(R.layout.main_board);
        CustomView1 view = findViewById(R.id.drawed_circle);
//        setContentView(board);
        view.setCanvas(new Canvas(view.getBitmap()));
        Board board = new Board(view);
        board.cordonOffRightTriangle(0, 10,11,0);
//        board.cordonOffRectangle(0,0,11,5);
//        board.cordonOffPentagon();
//        (board.getCircles()[5][7]).getCircle().setEmpty(false);
//        (board.getCircles()[5][7]).setColour("#00FF00");


    }
}

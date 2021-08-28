package com.example.puzzlesolverjava;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        CustomView1 board = new CustomView1(this);
        setContentView(R.layout.main_board);
        CustomView1 board = findViewById(R.id.drawed_circle);
//        setContentView(board);
        board.setCanvas(new Canvas(board.getBitmap()));
        gameCircle[][] array = new gameCircle[10][11];
//        circleObject circ1 = new circleObject(100, Color.RED, board);
//        circleObject circ2 = new circleObject(100, Color.BLUE, board);
//        circ1.setCenterX(board.getBitmap().getWidth() / 4);
//        circ2.setCenterY(board.getBitmap().getWidth() * 3 / 7);
        for (int i = 0; i < Constants.ROWS; i++) {
            for (int j = 0; j < Constants.COLS; j++) {
                if (i == j) {
                    array[i][j] = new gameCircle(i,j, Color.BLUE,new circleObject[Constants.ROWS][Constants.COLS], board);
                }
                else {
                    array[i][j] = new gameCircle(i,j, Color.RED,new circleObject[Constants.ROWS][Constants.COLS], board);
                }
            }
        }

        array[5][7].setColour("#00FF00");
//        gameCircle circle1 = new gameCircle(3,3, Color.RED,new circleObject[Constants.ROWS][Constants.COLS], board);
//        gameCircle circle2 = new gameCircle(3,4,Color.BLUE,new circleObject[Constants.ROWS][Constants.COLS], board);
//        board.postInvalidate();


    }
}

package com.example.puzzlesolverjava;

import android.graphics.Canvas;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_board);
        CustomView1 view = findViewById(R.id.drawed_circle);
        view.setCanvas(new Canvas(view.getBitmap()));
        Board board = new Board(view);
        String configuration = getIntent().getStringExtra("board_type");
        switch (configuration) {
            case "triangle":
                board.cordonOffRightTriangle(0, 10,11,0);
                break;
            case "rectangle":
                board.cordonOffRectangle(0,0,11,5);
                break;
            case "pentagon":
                board.cordonOffPentagon();
                break;
        }
//        (board.getCircles()[5][7]).getCircle().setEmpty(false);
//        (board.getCircles()[5][7]).setColour("#00FF00");


    }
}

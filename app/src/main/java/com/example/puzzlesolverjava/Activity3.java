package com.example.puzzlesolverjava;

import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_board);
        CustomView1 view1 = findViewById(R.id.board);
        view1.setCanvas(new Canvas(view1.getBitmap()));

        Button backButton = findViewById(R.id.back_button2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Activity2.class);
                startActivity(myIntent);
            }
        });

        Board board = new Board(view1);
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
        Piece piece1 = new Piece(view1, board.getCircles(), 0, 0);
        int[] pt = piece1.getPossTranslations().get(0);
        piece1.translatePieceLocation(pt[0], pt[1]);
        Piece piece2 = new Piece(view1, board.getCircles(), 1, 0);
        int[] pt2 = piece2.getPossTranslations().get(0);
        piece2.translatePieceLocation(pt2[0], pt2[1]);
//        piece1.translatePieceLocation(3,0);


//        (board.getCircles()[5][7]).getCircle().setEmpty(false);
//        (board.getCircles()[5][7]).setColour("#00FF00");


    }
}

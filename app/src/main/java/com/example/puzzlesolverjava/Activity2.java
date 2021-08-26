package com.example.puzzlesolverjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board_select);
        ImageButton triangleBoard = findViewById(R.id.triangle_board_image_button);
        ImageButton rectangleBoard = findViewById(R.id.rectangle_board_image_button);
        ImageButton pentagonBoard = findViewById(R.id.pentagon_board_image_button);
        Button backButton = findViewById((R.id.back_button));

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Activity1.class);
                startActivity(myIntent);
            }
        });

        triangleBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Activity2.class);
                startActivity(myIntent);
            }
        });

    }
}

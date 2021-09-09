package com.example.puzzlesolverjava;

import android.graphics.Color;

public class Constants {

    // width of each square
    public static final int CIRCLE_WIDTH = 45;

    // coordinates for circles in each puzzle piece

    public static final int[][] WHITE_RIGHT_TRIANGLE = {{2 * CIRCLE_WIDTH, 0}, {2 * CIRCLE_WIDTH, 2 * CIRCLE_WIDTH}, {0, 2 * CIRCLE_WIDTH}};
    public static final int[][] DGREEN_Z_PIECE = {{0, 0}, {0, 2 * CIRCLE_WIDTH}, {2 * CIRCLE_WIDTH, 2 * CIRCLE_WIDTH},
            {2 * CIRCLE_WIDTH, 4 * CIRCLE_WIDTH}, {2 * CIRCLE_WIDTH, 6 * CIRCLE_WIDTH}};
    public static final int[][] BLUE_L_PIECE = {{0, 0}, {0, 2 * CIRCLE_WIDTH}, {0, 4 * CIRCLE_WIDTH},
            {0, 6 * CIRCLE_WIDTH}, {2 * CIRCLE_WIDTH, 6 * CIRCLE_WIDTH}};
    public static final int[][] ORANGE_L_PIECE = {{2 * CIRCLE_WIDTH, 0}, {2 * CIRCLE_WIDTH, 2 * CIRCLE_WIDTH}, {2 * CIRCLE_WIDTH, 4 * CIRCLE_WIDTH},
            {0, 4 * CIRCLE_WIDTH}};
    public static final int[][] SKYBLUE_L_PIECE = {{0, 0}, {0, 2 * CIRCLE_WIDTH}, {0, 4 * CIRCLE_WIDTH},
            {2 * CIRCLE_WIDTH, 4 * CIRCLE_WIDTH}, {4 * CIRCLE_WIDTH, 4 * CIRCLE_WIDTH}};
    public static final int[][] YELLOW_U_PIECE = {{0, 0}, {0, 2 * CIRCLE_WIDTH}, {2 * CIRCLE_WIDTH, 2 * CIRCLE_WIDTH},
            {4 * CIRCLE_WIDTH, 2 * CIRCLE_WIDTH}, {4 * CIRCLE_WIDTH, 0}};
    public static final int[][] GRAY_PLUS_PIECE = {{2 * CIRCLE_WIDTH, 0}, {2 * CIRCLE_WIDTH, 2 * CIRCLE_WIDTH}, {2 * CIRCLE_WIDTH, 4 * CIRCLE_WIDTH},
            {0, 2 * CIRCLE_WIDTH}, {4 * CIRCLE_WIDTH, 2 * CIRCLE_WIDTH}};
    public static final int[][] PINK_W_PIECE = {{0, 0}, {0, 2 * CIRCLE_WIDTH}, {2 * CIRCLE_WIDTH, 2 * CIRCLE_WIDTH},
            {2 * CIRCLE_WIDTH, 4 * CIRCLE_WIDTH}, {4 * CIRCLE_WIDTH, 4 * CIRCLE_WIDTH}};
    public static final int[][] GREEN_SQUARE_PIECE = {{0, 0}, {0, 2 * CIRCLE_WIDTH}, {2 * CIRCLE_WIDTH, 0},
            {2 * CIRCLE_WIDTH, 2 * CIRCLE_WIDTH}};
    public static final int[][] CREAM_LINEISH_PIECE = {{0, 0}, {0, 2 * CIRCLE_WIDTH}, {2 * CIRCLE_WIDTH, 2 * CIRCLE_WIDTH},
            {0, 4 * CIRCLE_WIDTH}, {0, 6 * CIRCLE_WIDTH}};
    public static final int[][] RED_SQUAREISH_PIECE = {{0, 0}, {0, 2 * CIRCLE_WIDTH}, {2 * CIRCLE_WIDTH, 0},
            {2 * CIRCLE_WIDTH, 2 * CIRCLE_WIDTH}, {0, 4 * CIRCLE_WIDTH}};
    public static final int[][] PURPLE_LINE_PIECE = {{0, 0}, {0, 2 * CIRCLE_WIDTH}, {0, 4 * CIRCLE_WIDTH}, {0, 6 * CIRCLE_WIDTH}};

    public static final int BOARD_WIDTH = 11 * 2 * CIRCLE_WIDTH;
    public static final int BOARD_HEIGHT = 10 * 2 * CIRCLE_WIDTH;
    public static final int X_OFFSET = 5 * CIRCLE_WIDTH;
    public static final int Y_OFFSET = 1 * CIRCLE_WIDTH;
    public static final int BOARD_X_OFFSET = 2 * CIRCLE_WIDTH;
    public static final int BOARD_Y_OFFSET = 2 * CIRCLE_WIDTH;
    public static final double DEGREES_90 = Math.PI / 2;
    public static final int BOARD_COLOUR = Color.parseColor("#D2691E");
    public static final int EMPTY_COLOUR = Color.parseColor("#000000");
    public static final int ROWS = BOARD_HEIGHT / (2 * CIRCLE_WIDTH);
    public static final int COLS = BOARD_WIDTH / (2 * CIRCLE_WIDTH);
    public static final int LABEL_HEIGHT = 20;
    public static final int LABEL_SPACING = 60;
    public static final int NCOLS = 11;
    public static final int NROWS = 10;

//    public static final int WHITE_COLOUR = Color.parseColor("#FFFFFF");
    public static final int WHITE_COLOUR2 = Color.parseColor("#000000");
    public static final int DGREEN_COLOUR = Color.parseColor("#006400");
    public static final int BLUE_COLOUR = Color.parseColor("#0000FF");
    public static final int ORANGE_COLOUR = Color.parseColor("#FFA500");
    public static final int SKYBLUE_COLOUR = Color.parseColor("#87CEEB");
    public static final int YELLOW_COLOUR = Color.parseColor("#FFFF00");
    public static final int GRAY_COLOUR = Color.parseColor("#808080");
    public static final int PINK_COLOUR = Color.parseColor("#FFC0CB");
    public static final int GREEN_COLOUR = Color.parseColor("#008000");
    public static final int BISQUE_COLOUR = Color.parseColor("#FFE4C4");
    public static final int RED_COLOUR = Color.parseColor("#FF0000");
    public static final int PURPLE_COLOUR = Color.parseColor("#800080");



}


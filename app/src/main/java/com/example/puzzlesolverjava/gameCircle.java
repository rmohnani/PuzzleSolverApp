package com.example.puzzlesolverjava;

import android.graphics.Color;

public class gameCircle {

    private circleObject _circle;
    private gameCircle[][] _gameCircleArray;
    private CustomView1 _view;

    public gameCircle(int row, int col, int colour, gameCircle[][] board, CustomView1 view) {
        _gameCircleArray = board;
        _view = view;
        _circle = new circleObject(Constants.CIRCLE_WIDTH, colour, view);
        _view.addObject(_circle);
        _view.addGameCircle(this);

        this.setLocation(row, col);
    }

    public void setLocation(int row, int col) {
        _circle.setCenterX((col * 2 * Constants.CIRCLE_WIDTH) + Constants.BOARD_X_OFFSET);
        _circle.setCenterY((row * 2 * Constants.CIRCLE_WIDTH) + Constants.BOARD_Y_OFFSET);
        _view.invalidate();
    }

    public void translateCircleLocation(int colChange, int rowChange) {
        this.setLocation(this.getRow() + rowChange, this.getCol() + colChange);
    }

    public int getCol() {
        return (int) (( _circle.getCenterX()) - Constants.CIRCLE_WIDTH) / (2 * Constants.CIRCLE_WIDTH);
    }

    public int getRow() {
        return (int) (_circle.getCenterY() - Constants.CIRCLE_WIDTH) / (2 * Constants.CIRCLE_WIDTH);
    }

    public circleObject getCircle() {
        return _circle;
    }

    public void setColour(String colorString) {
        _circle.setFillColour(Color.parseColor(colorString));
    }

    public boolean canMoveTo(int colChange, int rowChange) {
        boolean canMove = true;
        int col = this.getCol();
        int row = this.getRow();

        if ((col > Constants.COLS - 1) ||
                (col < 0)) {
            canMove = false;
        }
        if ((row > Constants.ROWS - 1)) {
            canMove = false;
        }
        if ( (row + rowChange > Constants.ROWS - 1) || (col + colChange > Constants.COLS - 1)
                || (row + rowChange < 0) || (col + colChange < 0)) {
            return false;
        }
        if (_gameCircleArray[row + rowChange][col + colChange] != null) {
            canMove = false;
        }
        return canMove;
    }

}

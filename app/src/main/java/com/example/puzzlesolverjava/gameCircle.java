package com.example.puzzlesolverjava;

public class gameCircle {

    private circleObject _circle;
    private circleObject[][] _gameCircleArray;
    private CustomView1 _view;

    public gameCircle(int row, int col, int colour, circleObject[][] board, CustomView1 view) {
        _gameCircleArray = board;
        _view = view;
        _circle = new circleObject(Constants.CIRCLE_WIDTH, colour, view);
//        _view.addGameCircle()

        this.setLocation(row, col);
    }

    public void setLocation(int row, int col) {
        _circle.setCenterX((col / Constants.NCOLS) * _view.getWidth());
        _circle.setCenterY((row / Constants.NROWS) * _view.getHeight());
        _view.invalidate();
    }

    public void translateCircleLocation(int colChange, int rowChange) {
        this.setLocation(this.getRow() + rowChange, this.getCol() + colChange);
    }

    public int getCol() {
        return (int) (( _circle.getCenterX() / _view.getWidth()) * Constants.NCOLS);
    }

    public int getRow() {
        return (int) (( _circle.getCenterY() / _view.getHeight()) * Constants.NROWS);
    }

    public circleObject getCircle() {
        return _circle;
    }

//    public void setColour(String colorString) {
//        _circle.setFillColor(colorString);
//    }

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

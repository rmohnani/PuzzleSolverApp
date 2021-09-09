package com.example.puzzlesolverjava;

public class Board {
    // declares instance variables.
    private gameCircle[][] _gameCircleArray;
    private CustomView1 _view;

    /**
     * This is the Board's Constructor. It setsup the board
     * graphically and logically. Takes in a pane parameter
     * to add board to that pane graphically.
     */
    public Board(CustomView1 view) {
        _view = view;
        // logical setup
        _gameCircleArray = new gameCircle[Constants.ROWS][Constants.COLS];
        for (int row = 0; row < Constants.ROWS; row++) {
            for (int col = 0; col < Constants.COLS; col++) {
                _gameCircleArray[row][col] = new gameCircle(row, col,Constants.BOARD_COLOUR, _gameCircleArray, _view);
                _gameCircleArray[row][col].getCircle().setType("empty");
            }
        }
        // graphical setup
//        this.setUpView();
    }

    /**
     * This is the getCircles helper method. It returns
     * a 2d array of all the Circles in the board.
     */
    public gameCircle[][] getCircles() {
        return _gameCircleArray;
    }

    /**
     * This sections the main board such that the desired triangle region
     * on which the puzzle takes place is null, while the other circles on
     * the board are occupied by borderCircles.
     */

    // values for Puzzle Triangle Cordon off: 0,10,11,0

    public void cordonOffRightTriangle(int colBegin, int rowBegin, int colEnd, int rowEnd) {
        int getRidOff = rowBegin - rowEnd;
        for (int col = colBegin; col < colEnd; col++) {
            for (int i = 0; i < getRidOff; i++) {
                if (_gameCircleArray[i][col].getCircle().getType() == "empty") {
                    _gameCircleArray[i][col].getCircle().setType("board");
//                    _gameCircleArray[i][col] = new gameCircle(i, col,Constants.BOARD_COLOUR, _gameCircleArray, _view);
//                    _gameCircleArray[i][col].setLocation(i, col);
//                    _view.addGameCircle(_gameCircleArray[i][col]);
                }
            }
            getRidOff -= 1;
        }
    }

    // values for Puzzle Rectangle Cordon off: 0,0,11,5

    public void cordonOffRectangle(int colBegin, int rowBegin, int colEnd, int rowEnd) {
        for (int col = colBegin; col < colEnd; col++) {
            for (int row = rowBegin; row < rowEnd; row++) {
                if (_gameCircleArray[row][col].getCircle().getType() == "empty") {
                    _gameCircleArray[row][col].getCircle().setType("board");
//                    _gameCircleArray[row][col] = new gameCircle(row, col,Constants.BOARD_COLOUR, _gameCircleArray, _view);
//                    _gameCircleArray[row][col].setLocation(row, col);
//                    _view.addGameCircle(_gameCircleArray[row][col]);
                }
            }
        }
    }

    public void cordonOffTriangle(int colBegin, int rowBegin, int colEnd, int rowEnd) {
        int val = rowBegin - colBegin;
        if (rowBegin - rowEnd <= 0) {
            for(int col = colBegin; col < colEnd; col++) {
                for (int row = rowBegin; row < rowEnd; row++) {
                    if (row - col >= rowBegin - colBegin) {
                        if (_gameCircleArray[row][col].getCircle().getType() == "empty") {
                            _gameCircleArray[row][col].getCircle().setType("board");
//                            _gameCircleArray[row][col] = new gameCircle(row, col, Constants.BOARD_COLOUR, _gameCircleArray, _view);
//                            _gameCircleArray[row][col].setLocation(row, col);
//                            _view.addGameCircle(_gameCircleArray[row][col]);
                        }
                    }
                }
            }
        }
        if (rowBegin - rowEnd > 0) {
            for (int col = colBegin; col < colEnd; col++) {
                for (int row = rowEnd; row < rowBegin; row++) {
                    if (col - row >= colBegin - rowEnd) {
                        if (_gameCircleArray[row][col].getCircle().getType() == "empty") {
                            _gameCircleArray[row][col].getCircle().setType("board");
//                            _gameCircleArray[row][col] = new gameCircle(row, col, Constants.BOARD_COLOUR, _gameCircleArray, _view);
//                            _gameCircleArray[row][col].setLocation(row, col);
//                            _view.addGameCircle(_gameCircleArray[row][col]);
                        }
                    }
                }
            }
        }
    }

    public void cordonOffPentagon() {
        this.cordonOffRectangle(0,0,1,10);
        this.cordonOffTriangle(1,7,4,10);
        this.cordonOffRectangle(10,0,11,10);
        this.cordonOffTriangle(6,5,10,0);
        this.cordonOffRectangle(1,0,2,5);
        this.cordonOffRectangle(1,1,5,2);
        this.cordonOffRectangle(2,0,6,1);
        this.cordonOffRightTriangle(2,5,5,1);

        _gameCircleArray[6][7] = new gameCircle(6, 7, Constants.BOARD_COLOUR, _gameCircleArray, _view);
        _gameCircleArray[6][7].getCircle().setType("board");
        _gameCircleArray[6][7].setLocation(6, 7);
        _view.addGameCircle(_gameCircleArray[6][7]);
    }



    /**
     * This sets up specificially the puzzle board for
     * level 7 puzzle 14.
     */

//    public void level7_14(ArrayList<Piece> allPieces) {
//        this.hardPlacePiece(allPieces,1,9,3,0);
//        this.hardPlacePiece(allPieces,3,9,5,1);
//        this.hardPlacePiece(allPieces,7,7,1,1);
//        this.hardPlacePiece(allPieces,10,8,8,7);
//        this.hardPlacePiece(allPieces,11,10,0,0);
//
//    }
//
//    /**
//     * This sets up specificially the puzzle board for
//     * level 8 puzzle 11. This is the puzzle we couldn't solve, and thus
//     * the cause for this program in its entirety.
//     */
//
//    public void level8_11(ArrayList<Piece> allPieces) {
//        this.hardPlacePiece(allPieces,0,9,0,0);
//        this.hardPlacePiece(allPieces,1,7,2,2);
//        this.hardPlacePiece(allPieces,2,9,3,3);
//        this.hardPlacePiece(allPieces,3,8,7,6);
//    }
//
//    /**
//     * This places a piece in a fixed position on the board. Used for
//     * initial puzzle position setup. The pieces placed will not be moved
//     * when solving.
//     */
//
//    public void hardPlacePiece(ArrayList<Piece> allPieces, int i, int col, int row, int variation){
//        Piece piece = allPieces.get(i);
//        piece.setCurrentVariation(variation);
//        piece = piece.changeVariation(piece.getCurrentVariation());
//        piece.translatePieceLocation(col, row);
//        piece.setFixed(true);
//
//        allPieces.set(i, piece);
//    }


    /**
     * This is the setUpBoardPane helper method. It simply
     * graphically adds the board to the boardPane.
     */

    private void setUpView() {
        for (int row = 0; row < Constants.ROWS; row++) {
            for (int col = 0; col < Constants.COLS; col++) {
                if (_gameCircleArray[row][col] != null) {
                    _view.addGameCircle(_gameCircleArray[row][col]);
                }
            }
        }
    }
}

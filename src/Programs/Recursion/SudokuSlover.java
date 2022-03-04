package Programs.Recursion;

import java.util.HashSet;

public class SudokuSlover {
    public void solveSudoku(char[][] board) {
        recursiveSolution(board);
    }

    boolean recursiveSolution (char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] =='.' ){
                    for (char k = '1'; k <= '9'; k++) {
                        if (isValid(board, i, j, k)){
                            board[i][j]  = k;
                            if (recursiveSolution(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean isValid (char[][] board, int row, int column, char element){
        for (int i = 0; i < 9; i++) {
            // for column
            if (board[i][column] == element) return false;
            //for rows
            if (board[row][i] == element) return false;
            //for 3*3 boxes;
            if(board[3 * (row / 3) + i / 3][ 3 * (column / 3) + i % 3] != '.' &&
                    board[3 * (row / 3) + i / 3][3 * (column / 3) + i % 3] == element)
                return false; //check 3*3 block
        }
        return true;
    }
}

package Programs.Recursion;

import java.util.ArrayList;
import java.util.List;

public class N_Queens2 {


    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }
        int count =  recursiveFunction(board, 0, 0);
        return count;
    }
    boolean isSafe(char[][] board, int colums,int rows){
        int rowCopy = rows, columnCopy = colums;
        //Upper Digonal;
        while (rows>=0&&colums>=0){
            if (board[rows][colums] == 'Q')return false;
            rows--;colums--;
        }
        rows = rowCopy;
        colums = columnCopy;
        //left;
        while (colums>=0){
            if (board[rows][colums] == 'Q')return false;
            colums--;
        }
        colums = columnCopy;
        //lower Digonal;
        while (rows<board.length && colums>=0){
            if (board[rows][colums] == 'Q') return false;
            rows++;
            colums--;
        }
        return true;
    }
    int recursiveFunction(char[][]board ,int columns, int count){
        if (columns == board.length){
           return ++count;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, columns, row)){
                board[row][columns] = 'Q';
                count += recursiveFunction(board, columns+1, count);
                board[row][columns] = '.';
            }
        }
        return 0;
    }





}

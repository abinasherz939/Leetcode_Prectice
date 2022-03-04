package Programs.Recursion;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];
        List<List<String>> ans = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }
        recursiveFunction(board, 0, ans);
        return ans;
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
    void recursiveFunction(char[][]board ,int columns, List<List<String >> ans){
        if (columns == board.length){
            List<String> tempString = new ArrayList<>();
            cunstrct(board, tempString);
            ans.add(new ArrayList<>(tempString));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, columns, row)){
                board[row][columns] = 'Q';
                recursiveFunction(board, columns+1, ans);
                board[row][columns] = '.';
            }
        }
    }
    void cunstrct (char[][] board, List<String> tempString){
        for (char[] chars : board) {
            String s = new String(chars);
            tempString.add(new String(s));
        }
    }


}

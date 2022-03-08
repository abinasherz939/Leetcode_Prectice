package Programs.Contest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Contest73_BW {

    public List<String> cellsInRangenew(String s) {
        List<String> out = new ArrayList<>();

        for (int i = s.charAt(1); i <= s.charAt(s.length() - 1); i++) {
            int toapend = -s.charAt(1) + s.charAt(s.length() - 1) + (i - s.charAt(1));
            for (char c = s.charAt(0); c <= s.charAt(s.length() - 2); c++) {
                String temp = "";
                temp += c;
                temp += toapend;
                out.add(temp);
            }

        }
        return out;
    }

    public List<String> cellsInRange(String s) {
        List<String> out = new ArrayList<>();
        for (char c = s.charAt(0); c <= s.charAt(s.length() - 2); c++) {
            for (int i = s.charAt(1); i <= s.charAt(s.length() - 1); i++) {
                int toapend = -s.charAt(1) + s.charAt(s.length() - 1) + (i - s.charAt(1));

                String temp = "";
                temp += c;
                temp += toapend;
                out.add(temp);

            }
        }
        return out;
    }


    public long minimalKSum(int[] nums, int k) {

        ArrayList<Long> arrayList = new ArrayList<>();
        long sum = 0;
        HashSet<Long> set = new HashSet<>();
        for (long i : nums) set.add(i);

        for (int i = 1; i < 1000000000; i++) {
            if (k >= 1 && !set.contains(i)) {
                arrayList.add((long) i);
                k--;
            }
            if (k == 0) break;
        }
        for (long l : arrayList) sum += l;
        return sum;
    }


//     public int rangeBitwiseAnd(int m, int n) {

// //         long result  = left;
// //         for (int from = left; from <= right; from++) {
// //             result &= from;

    // //             if (result == 0) return 0;
// //         }
// //         return (int)result;
//          while(n>m)
//            n = n & n-1;
//         return m&n;
//     }
    public int rangeBitwiseAnd(int m, int n) {
        if (m == 0) {
            return 0;
        }
        int moveFactor = 1;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            moveFactor <<= 1;
        }
        return m * moveFactor;
    }

//    public List<Integer> spiralOrder(int[][] matrix) {
//
//        List<Integer> theAns = new ArrayList<>();
//
//        healperRecurciveSoluion(0, matrix.length, 0, matrix[0].length, theAns, matrix);
//        return theAns;
//
//    }
//
//    void healperRecurciveSoluion(int fromRow, int tillRow, int fromColumns, int tillColumns, List<Integer> theAns, int[][] matrix) {
//
//
//        if (tillColumns == fromColumns && tillColumns == fromRow) return;
//
//        for (int column = fromColumns; column <= tillColumns; column++) {
//            if (column == fromColumns ) continue;
//            theAns.add(matrix[fromRow][column]);
//        }
//        for (int row = fromRow; row <= tillRow; row++) {
//            if (row == fromRow ) continue;
//            theAns.add(matrix[row][tillColumns]);
//        }
//
//
//        for (int column = tillColumns; column >= fromColumns; column--) {
//            if (column == tillColumns ) continue;
//            theAns.add(matrix[tillRow][column]);
//        }
//        for (int row = tillRow; row > fromRow; row--) {
//            if (row == tillRow ) continue;
//            theAns.add(matrix[row][fromColumns]);
//        }
//        if (tillColumns != fromColumns && tillColumns != fromRow)
//            theAns.add(matrix[fromRow+1][fromColumns+1]);
//
//        healperRecurciveSoluion(fromRow + 1, tillRow - 1, fromColumns + 1, tillColumns - 1, theAns, matrix);
//    }

    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {

            List<Integer> res = new ArrayList<Integer>();

            if (matrix.length == 0) {
                return res;
            }

            int rowBegin = 0;
            int rowEnd = matrix.length-1;
            int colBegin = 0;
            int colEnd = matrix[0].length - 1;

            while (rowBegin <= rowEnd && colBegin <= colEnd) {
                // Traverse Right
                for (int j = colBegin; j <= colEnd; j ++) {
                    res.add(matrix[rowBegin][j]);
                }
                rowBegin++;

                // Traverse Down
                for (int j = rowBegin; j <= rowEnd; j ++) {
                    res.add(matrix[j][colEnd]);
                }
                colEnd--;

                if (rowBegin <= rowEnd) {
                    // Traverse Left
                    for (int j = colEnd; j >= colBegin; j --) {
                        res.add(matrix[rowEnd][j]);
                    }
                }
                rowEnd--;

                if (colBegin <= colEnd) {
                    // Traver Up
                    for (int j = rowEnd; j >= rowBegin; j --) {
                        res.add(matrix[j][colBegin]);
                    }
                }
                colBegin ++;
            }

            return res;
        }
    }

    public int[][] generateMatrix(int n) {
        int[][] resultMatrix = new int[n][n];
        int rowBegin = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n - 1;
        int[] elements  = new int[n*n];
        for (int i = 0; i < n * n; i++) {
            elements[i] = i;
        }
        int index = 0;
        try {
            while (rowBegin <= rowEnd && colBegin <= colEnd) {
                // Traverse Right
                for (int j = colBegin; j <= colEnd; j ++) {
                    resultMatrix[rowBegin][j] = elements[index];
                }
                rowBegin++;
                index++;

                // Traverse Down
                for (int j = rowBegin; j <= rowEnd; j ++) {
                    resultMatrix[j][colEnd] = elements[index];
                }
                colEnd--;
                index++;

                if (rowBegin <= rowEnd) {
                    // Traverse Left
                    for (int j = colEnd; j >= colBegin; j --) {
                        resultMatrix[rowEnd][j] = elements[index];
                    }
                }
                rowEnd--;
                index++;

                if (colBegin <= colEnd) {
                    // Traver Up
                    for (int j = rowEnd; j >= rowBegin; j --) {
                        resultMatrix[j][colBegin] = elements[index];
                    }
                }
                colBegin ++;
                index++;
            }
        }
        catch (Exception e){
            return resultMatrix;
        }

        return resultMatrix;
    }
}

package Programs.Contest;

import java.util.*;

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

//class Solution {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        int [] arr = new int[m];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        rvereseArray(arr, 0, arr.length-1);
////
//        int sum = 0;
////        int min = Integer.MAX_VALUE;
//        int index = 0;
////        for (; index <= m-1; index++) {
////            min = Math.min(min, arr[index]);
////            sum+=arr[index];
////        }
////
////        sum -= min;
////
////
////        for (; index < arr.length; index++) {
////            sum+=arr[index];
////        }
//        while (index < arr.length){
//            if (index == m-1){
//                index++
//                continue;
//            }
//            sum += arr[index++];
//        }
//        System.out.println(sum);
//
//    }
//    static void rvereseArray(int[] arr, int start, int end)
//    {
//        int temp;
//
//        while (start < end)
//        {
//            temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
//}
//
//



//
//
//
//public class Solution {
//
//    public static void main(String[] args) {
//
//
//
//        String str = new Scanner(System.in).nextLine();
//        Solution obj = new Solution();
//        String out = obj.decodeString(str);
//        System.out.println(out);
//    }
//
//
//
//
//
//
//
//
//
//    private int pos = 0;
//    public String decodeString(String s) {
//        int n = s.length(), repeat = 0;
//        StringBuilder buf = new StringBuilder();
//        while (pos < n) {
//            char c = s.charAt(pos);
//            if (c >= 'a' && c <= 'z') {
//                buf.append(c);
//            } else if (c >= '0' && c <= '9') {
//                repeat = repeat * 10 + (c - '0');
//            } else if (c == '[') {
//                pos++;  // skip the char '['
//                String str = decodeString(s);  // pos is diff for each call
//                for (int i = 0; i < repeat; i++)
//                    buf.append(str);
//                repeat = 0;  // reset the value for the next input
//            } else if (c == ']')
//                break;
//            pos++;
//        }
//        return buf.toString();
//    }
//
//
//}
//


class Solution {

//    public static int minLCM(int L, int R) {
//
//        // If 2*L is within the the range
//        // then minimum LCM would be 2*L
//        if (2 * L <= R)
//            return 2 * L;
//
//            // Otherwise L * (L+1) would give
//            // the minimum LCM
//        else
//            return L * (L + 1);
//    }
//
//    // Function to find maximum LCM in range [L, R]
//    public static int maxLCM(int L, int R) {
//
//        // The only possible equation that will give
//        // the maximum LCM is R * (R-1)
//        return R * (R - 1);
//    }
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner sc  = new Scanner(System.in);
//        int L = sc.nextInt();
//        int R = sc.nextInt();
//
//        System.out.print(minLCM(L, R) + " ");
//        System.out.print(maxLCM(L, R));
//    }












    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        rvereseArray(arr, 0, arr.length-1);
        int sum = 0;

        int index = 0;
        while (index < arr.length){
            if (index == m-1){
                index++;
                continue;
            }
            sum += arr[index];
            index++;
        }
        System.out.println(sum);

    }
    static void rvereseArray(int[] arr, int start, int end)
    {
        int temp;

        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

//
///* A Java program to evaluate a
//given expression where tokens
//are separated by space.
//*/
//import java.util.Stack;

    public static class EvaluateString
    {
        public static int evaluate(String expression)
        {
            char[] tokens = expression.toCharArray();
            Stack<Integer> values = new Stack<>();
            Stack<Character> ops = new Stack<>();

            for (int i = 0; i < tokens.length; i++)
            {
                if (tokens[i] >= '0' && tokens[i] <= '9')
                {
                    StringBuffer sbuf = new StringBuffer();
                    while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                        sbuf.append(tokens[i++]);
                    values.push(Integer.parseInt(sbuf.
                            toString()));
                    i--;
                }
                else if (tokens[i] == '(') ops.push(tokens[i]);
                else if (tokens[i] == ')')
                {
                    while (ops.peek() != '(')
                        values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                    ops.pop();
                }
                else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/')
                {
                    while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                        values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                    ops.push(tokens[i]);
                }
            }
            while (!ops.empty())
                values.push(applyOp(ops.pop(), values.pop(), values.pop()));
            return values.pop();
        }


        public static boolean hasPrecedence(
                char op1, char op2)
        {
            if (op2 == '(' || op2 == ')') return false;
            if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) return false;
            else return true;
        }


        public static int applyOp(char op, int b, int a)
        {
            switch (op)
            {
                case '+': return a + b;
                case '-': return a - b;
                case '*': return a * b;
                case '/':
                    if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                    return a / b;
            }
            return 0;
        }
        public static void main(String[] args)
        {
            System.out.println(EvaluateString.
                    evaluate("10+2*6"));
            System.out.println(EvaluateString.
                    evaluate("100*2+12"));
            System.out.println(EvaluateString.
                    evaluate("100*(2+12)"));
            System.out.println(EvaluateString.
                    evaluate("100*(2+12)/14"));
        }
    }




}

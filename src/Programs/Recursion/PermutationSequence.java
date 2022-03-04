package Programs.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

    public String getPermutation(int n, int k) {
        int [] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = i + 1;
        List<Integer> list = new ArrayList<>();
        for (int i : array) list.add(i);
        String s = "";
        int factorial = factorial(n-1);
        k--;
        while (list.size()!=0){
            int no= k/factorial;
            s = s + no;
            list.remove(no);
            k= k%factorial;
            if (list.size() == 0) return s;
            factorial = factorial/list.size();
        }
        return s;
    }
    int factorial(int n){
        if (n==1) return 1;
        return n*factorial(n-1);
    }

}

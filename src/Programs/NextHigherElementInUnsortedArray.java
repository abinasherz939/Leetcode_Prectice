package Programs;

import java.util.Scanner;
import java.util.TreeMap;

public class NextHigherElementInUnsortedArray {//will also work if input key is not present in the array
    public static void main(String[] args) {
        int[] inputArray = {1,3,24,25,21,1,400,5,2,-1,1,4,5,5,6,6,47,47,0};

        TreeMap<Integer, Boolean> treeMap = new TreeMap<>();

        for (int i :
                inputArray) {
            treeMap.put(i,true);
        }
        int inputToFindNextHigherElement = new Scanner(System.in).nextInt();
        System.out.println(treeMap.higherKey(inputToFindNextHigherElement));
    }
}

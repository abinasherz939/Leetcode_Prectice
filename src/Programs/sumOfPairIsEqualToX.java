package Programs;

import java.util.*;

public class sumOfPairIsEqualToX {
    public static void main(String[] args) {
        int[] inputArray = {1,3,24,25,21,1,400,5,2,-1,1,4,5,5,6,6,47,47,0};
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> pair = new HashMap<>();
        for (int i :
                inputArray) {
            set.add(i);
        }
        int noOfPairExists =0;

        int inputSum = new Scanner(System.in).nextInt();
        for (int i = 0; i < inputArray.length; i++) {
            int complement = inputSum - inputArray[i];
            if (set.contains(complement)){
               noOfPairExists++;
               pair.put(inputArray[i], complement);
            }
        }

        Set set1 = pair.entrySet();//here we are ignoring the duplicates of pair due to set if you want to print all you can use array 2D
        Iterator itr = set1.iterator();
        while (itr.hasNext()){
            Map.Entry pairAsSet = (Map.Entry) itr.next();
            System.out.println("{"+pairAsSet.getKey()+", "+pairAsSet.getValue()+"}");
        }
        System.out.println("there are " + noOfPairExists +" pairs in the Araay which is equal to input SUM");

    }
}

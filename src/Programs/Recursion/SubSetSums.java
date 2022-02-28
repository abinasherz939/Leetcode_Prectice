package Programs.Recursion;

import java.util.ArrayList;

public class SubSetSums {

    class Solution{
        ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int lengthOfArray){
            ArrayList<Integer> output = new ArrayList<>();
            int index=0, sum = 0;
            helperFunction(index, sum, arr, output);
            return output;
        }
        void helperFunction (int index, int sum, ArrayList<Integer> arrayList, ArrayList<Integer> output) {
            if (index == arrayList.size()){
                output.add(sum);
                return;
            }
            sum += arrayList.get(index);
            helperFunction(index+1, sum, arrayList, output);
            sum-= arrayList.get(index);
            helperFunction(index+1, sum, arrayList, output);
        }

    }


    /** COMPACT CODE  **/

//    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int lengthOfArray){
//        ArrayList<Integer> output = new ArrayList<>();
//        int index=0, sum = 0;
//        helperFunction(index, sum, arr, output);
//        return output;
//    }
//    void helperFunction (int index, int sum, ArrayList<Integer> arrayList, ArrayList<Integer> output) {
//        if (index == arrayList.size()){
//            output.add(sum);
//            return;
//        }
//        helperFunction(index+1, sum+arrayList.get(index), arrayList, output);
//        helperFunction(index+1, sum, arrayList, output);
//    }
}

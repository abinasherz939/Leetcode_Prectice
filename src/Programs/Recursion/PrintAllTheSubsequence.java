package Programs.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllTheSubsequence {

    public static void main(String[] args) {
        int[] array = {3,1,2};
        ArrayList<Integer> path = new ArrayList<>();
        new PrintAllTheSubsequence().printAllSubsequence(0,  array,path);
        System.out.println(new PrintAllTheSubsequence().subsets(array));
    }


//    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helperFunction(nums, 0, list, result);
        return result;
    }
    public void helperFunction (int[] nums, int index, List<Integer> list, List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        helperFunction(nums, index+1, list, result);
        list.remove(list.size()-1);
        helperFunction(nums, index+1, list,result);
    }



    public void printAllSubsequence(int index,int[] arr, ArrayList<Integer> list){
        if (index== arr.length){
            if (list.size() == 0) System.out.print("{}");
            else list.forEach(System.out::print);
            System.out.println();
            return;
        }
        list.add(arr[index]);
        printAllSubsequence(index+1, arr, list);
        list.remove(list.size()-1);
        printAllSubsequence(index+1, arr, list);


    }

    class Solution{
        private ArrayList<Integer> ls=new ArrayList<>();

        ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int  n){
            getSum(0,arr,n,0);
            Collections.sort(ls);
            return ls;
        }

        public  void getSum(int i,ArrayList<Integer> arr,int n,int sum){
            if(i==n){
                ls.add(sum);
                return;
            }
            getSum(i+1,arr,n,sum+arr.get(i));
            getSum(i+1,arr,n,sum);
        }
    }


}

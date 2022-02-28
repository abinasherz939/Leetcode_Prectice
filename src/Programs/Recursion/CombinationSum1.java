package Programs.Recursion;

import java.util.*;

public class CombinationSum1 {


    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helperFunction(candidates, target, output, list, 0);

        return output;
    }
    void helperFunction (int[] candidates, int target, List<List<Integer>> output, List<Integer> list, int index){
        if (target<0) return;

        if (target == 0) {
            output.add(new ArrayList<>(list));
            return;
        }
        if (index == candidates.length) return;
        list.add(candidates[index]);
        target-=candidates[index];
        helperFunction(candidates, target, output, list, index);
        list.remove(list.size()-1);
        target+=candidates[index];
        helperFunction(candidates,target, output,list,index+1);
    }



    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        forCombinationSum2(candidates, target, set,list,0);
        return new ArrayList<>(set);

    }
    void forCombinationSum2(int[] candidates, int target, HashSet<List<Integer>> set, List<Integer> list, int index){
        if (target<0)return;
        if (target==0){
            set.add(new ArrayList<>(list));
            return;
        }
//        if (index < candidates.length-1) while (index>0 && candidates[index-1] == candidates[index]) continue;
//        if (index == candidates.length) return;
//        list.add(candidates[index]);
//        target-=candidates[index];
//        forCombinationSum2(candidates, target, set, list, index+1);
//        list.remove(list.size()-1);
//        target+=candidates[index];
//        forCombinationSum2(candidates,target,set,list,index+1);


        for (int i = index; i <candidates.length; i++) {
            if (candidates[index-1] == candidates[index]) continue;
            list.add(candidates[i]);
            forCombinationSum2(candidates, target-candidates[i], set, list, index+1);
            list.remove(list.size()-1);
        }
    }

}

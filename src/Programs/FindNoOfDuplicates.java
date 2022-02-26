package Programs;

import java.util.HashSet;

public class FindNoOfDuplicates {
    public static void main(String[] args) {
        String[] input = {"java","Abinash", "main", "Choudhary", "java", "Java", "Abinash", "java"};
        System.out.println(new FindNoOfDuplicates().countDuplicates(input));

        int[] array = {2,9,9,0,0};

        new FindNoOfDuplicates().printDuplicateElements(array);
    }
    public int countDuplicates(String[] array){
        int noOfDuplicates = 0;
        HashSet<String> set = new HashSet<>();
        for (String s:
             array) {
            boolean temp = set.add(s);
            if (!temp){
                noOfDuplicates++;
            }
        }
        return noOfDuplicates;
    }
    public void printDuplicateElements(int[] array){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])){
                System.out.println(array[i]);
            }
            else{
                set.add(array[i]);
            }
        }
    }
}

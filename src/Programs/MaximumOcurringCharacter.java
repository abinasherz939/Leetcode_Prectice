package Programs;

import java.util.*;
//used many things here
public class MaximumOcurringCharacter {
    public static void main(String[] args) {
        String name = "Abinash Choudhary aaaabbbbbbb";
        HashMap<Character, Integer> frequencyTable = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int resultFrequency = 0;
        char resultChar = 0 ;
        for (int i = 0; i < name.length(); i++) {
            if (frequencyTable.containsKey(name.charAt(i))){
                int temp = frequencyTable.get(name.charAt(i));
                temp++;
                frequencyTable.put(name.charAt(i), temp);
            }
            else {
                frequencyTable.put(name.charAt(i), 1);
            }
        }
        Set set = frequencyTable.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry mapEntry = (Map.Entry) itr.next();
            System.out.println("{"+mapEntry.getKey()+ ", " +mapEntry.getValue()+"}");

      //      System.out.println(mapEntry.toString());;
            maxHeap.offer((Integer) mapEntry.getValue());
            if (resultFrequency<(Integer) mapEntry.getValue()){
                resultFrequency =(Integer) mapEntry.getValue();
                resultChar = (Character)mapEntry.getKey();
            }
        }
        System.out.println(resultChar +" "+maxHeap.poll());
    }
}

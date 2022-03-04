package Programs.Recursion;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;


public class PalindromPartitioning {
    public List<List<String>> partition(String s) {

        List<List<String>> output = new ArrayList<>();
        List<String> list = new ArrayList<>();

        recursiveHelper(s,output,list, 0);

        return output;
    }

    void recursiveHelper(String s, List<List<String>> output, List<String> list, int index){

        if (index == s.length()){
            output.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrom(s,index, i)){
                list.add(s.substring(index, i+1));
                recursiveHelper(s,output, list, i+1);
                list.remove(list.size()-1);
            }
        }

    }
    boolean isPalindrom(String s, int startIndex, int lastIndex){
        while (startIndex<lastIndex){
            if (s.charAt(startIndex)!= s.charAt(lastIndex)) return false;
            startIndex++;lastIndex--;
        }
        return true;
    }

}
//                String s = "abcdefghijklmnopqrstuvwxyz"; // reson behind i+1
//                System.out.println(s.substring(1,3+1));
package Programs.Strings;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseWordsInStrings {
//
//    public String reverseWords(String s) {
//
//        char[] charArray = s.toCharArray();
//        ArrayList<String> list = new ArrayList<>();
//
//        StringBuilder stringBuffer = new StringBuilder();
//        for (int index = 0; index < charArray.length; index++) {
//            if (charArray[index] != ' ') {
//                if (stringBuffer.equals(" ")) continue;
//                else list.add(stringBuffer.toString());
//                stringBuffer = new StringBuilder(" ");
//            }
//            else {
//                stringBuffer.append(charArray[index]);
//            }
//        }
//        int pointerOne = 0, pointerTwo = list.size()-1;
//
//        while (pointerTwo>= pointerOne){
//            swap(pointerOne++, pointerTwo--, list);
//        }
//
//        StringBuilder ans = new StringBuilder();
//        for (String str : list) {
//            ans.append(str);
//        }
//        return ans.toString();
//    }
//    void swap (int i, int j, ArrayList<String> list) {
//       String temp = list.get(i);
//       String tempj = list.get(j);
//       list.remove(j);
//       list.add(j, temp);
//       list.remove(i);
//       list.add(i, tempj);
//
//    }
//
//
//

    public String reverseWords(String s) {
        s += " ";
        Stack<String> st = new Stack<String>();
        int i;
        String str = "";
        for (i = 0;i < s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                st.push(str);
                str = "";
            }
            else
            {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1)
        {
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek();
        return ans;
    }

}
class Solution {

    public String reverseWords(String s) {
        if (s == null) return null;

        char[] a = s.toCharArray();
        int n = a.length;

        // step 1. reverse the whole string
        reverse(a, 0, n - 1);
        // step 2. reverse each word
        reverseWords(a, n);
        // step 3. clean up spaces
        return cleanSpaces(a, n);
    }

    void reverseWords(char[] a, int n) {
        int i = 0, j = 0;

        while (i < n) {
            while (i < j || i < n && a[i] == ' ') i++; // skip spaces
            while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
            reverse(a, i, j - 1);                   // reverse the word
        }
    }

    // trim leading, trailing and multiple spaces
    String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && a[j] == ' ') j++;             // skip spaces
            while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
            while (j < n && a[j] == ' ') j++;             // skip spaces
            if (j < n) a[i++] = ' ';                      // keep only one space
        }

        return new String(a).substring(0, i);
    }

    // reverse a[] from a[i] to a[j]
    private void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }

}

//        for (int i = 0; i < (list.size()+1)/2; i++) {
//            swap(pointerOne++, pointerTwo--, list);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            swap(pointerOne++, pointerTwo++, list);
//        }
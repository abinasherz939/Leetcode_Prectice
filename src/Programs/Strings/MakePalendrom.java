package Programs.Strings;

public class MakePalendrom {
    public int solve(String str) {

        int count = 0;
        if (str.length() %2 == 0){
            int left = str.length()/2;
            int right = left +1;
            while (left>=0 && right< str.length()){
                if (str.charAt(left--) != str.charAt(right++)){
                    count++;
                }
            }
        } else {
            int left = str.length()/2;
            int right = left;
            while (left>=0 && right< str.length()){
                if (str.charAt(left--) != str.charAt(right++)){
                    count++;
                }
            }
        }
        return count;
    }
}

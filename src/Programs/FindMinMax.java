package Programs;

public class FindMinMax {
    public static int min(int i,int j){
        return i<j?i:j;
    }
    public static int max(int i,int j){
        return i>j?i:j;
    }//Math.max is already present


    public static void main(String[] args) {
        int[] arr = {1,3,24,25,21,1,400,5,2,-1,1,4,5,5,6,6,47,47,};
        int maximum =arr[0], minimum =arr[0];

        for (int i = 0; i < arr.length; i++) {
            minimum = FindMinMax.min(arr[i],minimum);
            maximum = FindMinMax.max(arr[i],maximum);
        }
        System.out.println(minimum + "   "+maximum);


    }
}

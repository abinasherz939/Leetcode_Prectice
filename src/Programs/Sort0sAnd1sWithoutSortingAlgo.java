package Programs;

public class Sort0sAnd1sWithoutSortingAlgo {
    public static void main(String[] args) {
        int[] a = {1,0,1,0,0,1,1,1,};
        int[] b = new int[a.length];
        int lowIndex = 0;
        int highIndex = a.length-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0){
                b[lowIndex] =0;
                lowIndex++;
            }
            else if(a[i] == 1){
                b[highIndex] = 1;
                highIndex--;
            }
        }
        for (int i :
                b) {
            System.out.print(" "+i);
        }
    }
}

package Programs.Recursion;

public class StartingRecursion {// 1st time recursion
    public static void main(String[] args) {
        StartingRecursion obj = new StartingRecursion();
//        new StartingRecursion().recursiveMethod(5,10);
//        obj.sumOfFirstNNAturalNumbers(4,0);
//        System.out.println(obj.sumOfFirstNNAturalNumbers(5));
//        System.out.println(obj.factorial(4));
//        obj.factorial(5, 1);




        int[] array = {1,2,5,66,6,4,2,1,99};
        obj.reverseArrayRecurcivily(0, array.length-1, array);
//        for (int i : array) System.out.print(i + ", ");

        String s= "1mqnnqm1";
        System.out.println(obj.isPalndrom(s, 0, s.length()-1));
        System.out.println(obj.fibonaciNo(6));
    }

    void recursiveMethod(int n,int i){

        if (n>i) return;
        if (n== i) System.out.println("last one "+ n);
        else System.out.println(n+",");
        recursiveMethod(n+1, i);
        System.out.println("in returning"+ n + ", ");
    }
    void sumOfFirstNNAturalNumbers (int n, int sum){
        if (n<1){
            System.out.println(sum);
            return;
        }
        sumOfFirstNNAturalNumbers(n-1,sum+n);
    }
    int sumOfFirstNNAturalNumbers (int n){

        if (n<1)return 0;
        else return n + sumOfFirstNNAturalNumbers(n-1);
    }
    int factorial(int n){
        if (n== 1) return 1;
        else return n*factorial(n-1);
    }
    void factorial (int n,int factorail){
        if (n==1) {
            System.out.println(factorail);
            return;

        }
        factorial(n-1, n*factorail);

    }
    void reverseArrayRecurcivily(int indexLow, int indexHigh, int[] array){
        if (indexLow > indexHigh) return;
        swap(array, indexLow, indexHigh);
        reverseArrayRecurcivily(++indexLow, --indexHigh, array);
    }

    void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    boolean isPalndrom (String s, int indexLow, int indexHigh){
//        if (s.length()%2!=0)return false;
        if (indexLow >indexHigh) return true;
        if (s.charAt(indexLow) != s.charAt(indexHigh)) return false;
        return isPalndrom(s, indexLow+1, indexHigh-1);
    }

    int fibonaciNo(int i){
        if (i == 0)return 0;
        if (i == 1) return 1;
        return fibonaciNo(i-1)+fibonaciNo(i-2);
    }





}

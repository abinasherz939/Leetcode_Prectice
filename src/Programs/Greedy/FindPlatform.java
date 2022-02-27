package Programs.Greedy;

import java.util.Arrays;

public class FindPlatform {
    static int findPlatform(int arr[], int dep[], int n)
    {
//        if (n==0) return 0;
        Arrays.sort(arr);Arrays.sort(dep);
        int platformReqd = 1, arrPonter = 1, depPointer = 0, max=1;

        while (arrPonter <n && depPointer <n){
           if (arr[arrPonter] <= dep[depPointer]){platformReqd++;arrPonter++;}
           else {platformReqd--;depPointer++;}
           if (platformReqd>max) max = platformReqd;
       }
       return max;
    }

}

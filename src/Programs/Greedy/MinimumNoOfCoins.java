package Programs.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNoOfCoins {
    public int minCoins(int coins[], int M, int V)
    {
        int minNoOfCoins = 0;
        Arrays.sort(coins);
        for (int i = coins.length-1; i > 0; i--) {
            if (V>coins[i]){
                minNoOfCoins+=V/coins[i];
                V = V%coins[i];
            }
        }
        if (V!=0) return -1;
        return minNoOfCoins;
    }
}

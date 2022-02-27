package Programs.Greedy;

import com.sun.source.tree.IfTree;

import java.util.*;

public class FractionalKnapSack {

    double fractionalKnapsack(int W, Item arr[], int n)
    {//something is wrong
        double totalValue = 0;
        double weight =(double) W;
        double[] valueWeightRatio = new double[n];
        for (int i = 0; i < n; i++) {
            valueWeightRatio[i] = (double) (arr[i].value)/(arr[i].weight);
        }
        List<List<Double>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Double> list1 = new ArrayList<>();
            list1.add((double) arr[i].value);
            list1.add((double) arr[i].weight);
            list1.add( valueWeightRatio[i]);
            list.add(list1);
        }
        list.sort((o1, o2) -> Double.compare(o2.get(2), o1.get(2)));
        for (int i = 0; i < n; i++) {
            if(weight == 0) return totalValue;
            if (weight>list.get(i).get(1)){
                totalValue += list.get(i).get(0);
                weight-=list.get(i).get(1);
            }
            else if (weight > 0 && weight<list.get(i).get(1)){
                double fraction = (weight)/list.get(i).get(1);
                totalValue += fraction*list.get(i).get(0);
                return totalValue;
            }
        }
        return totalValue;
    }



}
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
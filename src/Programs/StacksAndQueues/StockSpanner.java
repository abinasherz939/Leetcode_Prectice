package Programs.StacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanner {
    Stack<Integer> stack = new Stack<>();
    ArrayList<Integer> list = new ArrayList<>();


    public StockSpanner() {

    }

    public int next(int price) {
        list.add(price);

//        while (!stack.isEmpty() && list.get())
        return price;
    }
}

package Programs.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
}
class MyStack {

    Queue<Integer> queueOne  = new LinkedList<>();
//    Queue<Integer> twoQueue = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {

        queueOne.add(x);
        for (int i=1; i<queueOne.size(); i++)
            queueOne.add(queueOne.remove());
    }

    public int pop() {
//        while (!queueOne.isEmpty())
        return queueOne.remove();
    }

    public int top() {

        return queueOne.peek();
    }

    public boolean empty() {

        return queueOne.isEmpty();
    }
}
package Programs.StacksAndQueues;

import java.util.Stack;

public class QueuesUsingStack {
}
class MyQueue {

    Stack<Integer> stackOne = new Stack<>();
    Stack<Integer> stackTwo = new Stack<>();
    public MyQueue() {

    }

    public void push(int x) {

        stackOne.add(x);
    }

    public int pop() {

        if (stackTwo.isEmpty()){

        while (!stackOne.isEmpty()) stackTwo.add(stackOne.pop());}
        return stackTwo.pop();
    }

    public int peek() {

        if (stackTwo.isEmpty()) while (!stackOne.isEmpty()) stackTwo.add(stackOne.pop());

        return stackTwo.peek();
    }

    public boolean empty() {

        return (stackOne.isEmpty()&& stackTwo.isEmpty());
    }
}

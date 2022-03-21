package DailyChalanges;

import java.util.Stack;

public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();
        int pushPointer = 0, popPointer = 0;
        stack.push(pushed[pushPointer++]);

        while (true){
            if (popped[popPointer] == stack.peek()){
                stack.pop();
                popPointer++;
                if (popPointer == popped.length) break;
            }else {

                if (pushPointer == pushed.length) break;

                stack.push(pushed[pushPointer]);
                pushPointer++;
             }

        }
        return (pushPointer == popPointer) && stack.isEmpty();
    }

}

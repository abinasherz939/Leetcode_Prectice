package Programs.StacksAndQueues;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == '(') stack.push(')');
            else if (s.charAt(index) == '{') stack.push('}');
            else if (s.charAt(index) == '[') stack.push(']');
            else if (stack.isEmpty()|| stack.pop() != s.charAt(index)) return false;

        }
        return stack.isEmpty();
    }
}

package recursions.easy;

import java.util.Stack;

/**
 * Reverse the stack using recursion
 * i/p: 1,2,3,4 o/p: 4,3,2,1
 */
public class ReverseStack {
    public static void reverse(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }

    private static void insertAtBottom(Stack<Integer> stack, int top) {
        if (stack.empty()) {
            stack.push(top);
            return;
        }
        int tmp = stack.pop();
        insertAtBottom(stack, top);
        stack.push(tmp);
    }
}

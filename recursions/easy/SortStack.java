package recursions.easy;

import java.util.Stack;

public class SortStack {

    public static void sortStack(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        sortedInsert(stack, top);
    }

    private static void sortedInsert(Stack<Integer> stack, int top) {
        if (stack.empty() || stack.peek() <= top) {
            stack.push(top);
            return;
        }
        int tmp = stack.pop();
        sortedInsert(stack, top);
        stack.push(tmp);
    }
}

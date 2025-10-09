package monotonicstack.validPreorder;

import java.util.Stack;

public class MonotonicStack {
  public boolean verifyPreorder(int[] preorder) {
    Stack<Integer> stack = new Stack<>();
    int lowerBound = Integer.MIN_VALUE;

    for (int value : preorder) {
      if (value < lowerBound) return false;

      while (!stack.isEmpty() && value > stack.peek()) {
        //we pop because max element is come. i.e. right tree is started.
        lowerBound = stack.pop();
      }

      stack.push(value);
    }

    return true;
  }

}

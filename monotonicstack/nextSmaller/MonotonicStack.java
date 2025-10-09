package monotonicstack.nextSmaller;

import java.util.Stack;

public class MonotonicStack {
  public int[] finalPrices(int[] prices) {
    int n = prices.length;
    int[] finalPrices = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0;i < n;i++) {
      finalPrices[i] = prices[i];
    }

    for (int i = 0;i < n;i++) {
      while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
        int top = stack.pop();
        finalPrices[top] = prices[top] - prices[i];
      }
      stack.push(i);
    }
    return finalPrices;
  }
}

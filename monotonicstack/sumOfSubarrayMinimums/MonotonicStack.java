package monotonicstack.sumOfSubarrayMinimums;

import java.util.Stack;

/** Each element contributes to the total sum as the minimum of multiple subarrays.
 We calculate:
 - PLE (Previous Less Element): how far left it can extend.
 - NLE (Next Less Element): how far right it can extend.
 Then, for each element:
 Contribution = arr[i] * (i - PLE[i]) * (NLE[i] - i)

 **/
 public class MonotonicStack {
  public int sumSubarrayMins(int[] arr) {
    int n = arr.length;
    int mod = (int) 1e9 + 7;
    Stack<Integer> stack = new Stack<>();
    int[] ple = new int[n];
    int[] nle = new int[n];

    // Previous Less Element
    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
        stack.pop();
      }
      ple[i] = stack.isEmpty() ? -1 : stack.peek();
      stack.push(i);
    }

    stack.clear();

    // Next Less Element
    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
        stack.pop();
      }
      nle[i] = stack.isEmpty() ? n : stack.peek();
      stack.push(i);
    }

    // Calculate contribution
    long sum = 0;
    for (int i = 0; i < n; i++) {
      long left = i - ple[i];
      long right = nle[i] - i;
      sum = (sum + arr[i] * left * right) % mod;
    }

    return (int) sum;
  }

 }

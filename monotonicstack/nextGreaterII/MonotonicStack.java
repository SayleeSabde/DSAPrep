package monotonicstack.nextGreaterII;

import java.util.Arrays;
import java.util.Stack;

public class MonotonicStack {
  public int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    int nge[] = new int[n];
    Arrays.fill(nge, -1);
    Stack<Integer> stack = new Stack<>();
    for (int i = 0;i < 2*n;i++) {
      int curr = nums[i % n];
      while (!stack.isEmpty() && nums[stack.peek()] < curr) {
        nge[stack.pop()] = curr;
      }
      if (i < n) {
        stack.push(i);
      }
    }
    return nge;
  }
}

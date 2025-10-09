package monotonicstack.nextgreaterI;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MonotonicStack {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int n = nums2.length;
    int[] res = new int[nums1.length];
    Stack<Integer> stack = new Stack<>();
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0;i < n;i++) {
      while (!stack.isEmpty() && stack.peek() < nums2[i]) {
        int top = stack.pop();
        map.put(top, nums2[i]);
      }
      stack.push(nums2[i]);
    }

    for (int i = 0;i < nums1.length;i++) {
      res[i] = map.getOrDefault(nums1[i], -1);
    }

    return res;
  }
}

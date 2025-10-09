package monotonicstack.trapping;

import java.util.Stack;

public class TrappingRainwaterUsingStack {
  public int trap(int[] height) {
    int water = 0;
    Stack<Integer> stack = new Stack<>();
    for (int i = 0;i < height.length;i++) {
      while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
        int bottom = stack.pop();
        if (stack.isEmpty()) {
          break;
        }
        int left = stack.peek();
        int right = i;
        int width = right - left - 1;
        int boundedHeight = Math.min(height[left], height[right]) - height[bottom];
        water += (width * boundedHeight) ;
      }
      stack.push(i);
    }
    return water;
  }
}
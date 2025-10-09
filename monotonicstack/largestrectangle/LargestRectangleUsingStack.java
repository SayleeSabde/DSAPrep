package monotonicstack.largestrectangle;

import java.util.Stack;

/**
 *
 */
public class LargestRectangleUsingStack {
  public int largestRectangleArea(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    long maxArea = 0;
    for (int i = 0;i <= heights.length;i++) {
      int currheight = i == heights.length ? 0 : heights[i];
      while (!stack.isEmpty() && currheight < heights[stack.peek()]) {
        int height = heights[stack.pop()];
        int width = stack.isEmpty() ? i : i - stack.peek() - 1;
        int area = height*width;

        maxArea = Math.max(area, maxArea);
      }
      stack.push(i);
    }
    return (int)maxArea;
  }

}

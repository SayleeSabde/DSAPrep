package monotonicstack.largestrectangle;

/**
 * For every bar, find what are the areas of rectangle it can form
 */
public class LargestRectangleBruteforce {
  public int largestRectangleArea(int[] heights) {
    int n = heights.length;
    int maxArea = 0;

    for (int i = 0; i < n; i++) {
      int minHeight = heights[i];
      for (int j = i; j < n; j++) {
        minHeight = Math.min(minHeight, heights[j]);
        int width = j - i + 1;
        int area = minHeight * width;
        maxArea = Math.max(maxArea, area);
      }
    }

    return maxArea;
  }
}

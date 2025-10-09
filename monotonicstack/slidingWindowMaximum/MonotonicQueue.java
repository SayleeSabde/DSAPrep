package monotonicstack.slidingWindowMaximum;

import java.util.*;

/**
 * keep track of k elements and remove non-necessary elements.
 * We need a DS where we can remove non-necessary elements plus we can add latest.
 * Think of a queue.
 */
public class MonotonicQueue {
  public List<Integer> slidingWindowMaximum(List<Integer> nums, int k) {
    int n = nums.size();
    Deque<Integer> queue = new ArrayDeque<>();
    List<Integer> result = new ArrayList<>(n-k+1);

    for (int i = 0;i < n;i++) {
      // Remove indices outside the current window
      while (!queue.isEmpty() && queue.peekFirst() <= i-k) {
        queue.pollFirst();
      }

      // Maintain decreasing order in deque
      while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
        queue.pollLast();
      }

      // Add current index
      queue.offerLast(i);


      // Record max for window
      if (i >= k - 1) {
        result.set(i - k + 1, nums.get(queue.peekFirst()));
      }

    }
    return result;
  }
}

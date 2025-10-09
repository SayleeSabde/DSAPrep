package monotonicstack.slidingWindowMaximum;

import java.util.ArrayList;
import java.util.List;

/**
 * TC: O(n-k)*O(k)
 */
public class Bruteforce {

  public List<Integer> slidingWindowMaximum(List<Integer> nums, int k) {
    List<Integer> result = new ArrayList<>();
    int n = nums.size();
    for (int i = 0;i < n-k;i++) {
      int maxi = nums.get(i);
      for (int j = i;j < i+k-1;j++) {
        if (nums.get(j) > maxi) {
          maxi = nums.get(j);
        }
      }
      result.add(maxi);
    }
    return result;
  }
}

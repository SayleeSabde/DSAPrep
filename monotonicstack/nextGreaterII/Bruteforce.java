package monotonicstack.nextGreaterII;

import java.util.Arrays;

public class Bruteforce {

  public int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    int[] nge = new int[n];
    Arrays.fill(nge, -1);

    for (int i = 0;i < 2*n;i++) {
      int curr = nums[i%n];
      for (int j = 1;j < n;j++) {
        if (curr < nums[(i+j)% n]) {
          nge[i%n] = nums[(i+j)% n];
          break;
        }
      }
    }

    return nge;
  }
}

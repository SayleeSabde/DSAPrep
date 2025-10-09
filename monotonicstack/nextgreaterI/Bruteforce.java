package monotonicstack.nextgreaterI;

import java.util.HashMap;
import java.util.Map;

public class Bruteforce {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int n = nums2.length;
    int[] res = new int[nums1.length];
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0;i < n;i++) {
      for (int j = i+1;j < n;j++) {
        if (nums2[i] < nums2[j]) {
          map.put(nums2[i], nums2[j]);
          break;
        }
      }
    }

    for (int i = 0;i < nums1.length;i++) {
      res[i] = map.getOrDefault(nums1[i], -1);
    }

    return res;
  }
}

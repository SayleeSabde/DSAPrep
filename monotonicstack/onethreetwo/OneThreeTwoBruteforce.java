package monotonicstack.onethreetwo;

public class OneThreeTwoBruteforce {
  public boolean find132pattern(int[] nums) {

    for (int i = 0;i < nums.length;i++) {
      int iThElement = nums[i];
      for (int j = i+1;j < nums.length;j++) {
        if (iThElement < nums[j]) {
          int jThElement = nums[j];
          for (int k = j+1;k < nums.length;k++) {
            if (jThElement > nums[k] && nums[k] > iThElement) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
}

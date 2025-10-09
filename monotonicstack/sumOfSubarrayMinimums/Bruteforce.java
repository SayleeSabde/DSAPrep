package monotonicstack.sumOfSubarrayMinimums;

public class Bruteforce {
  public int sumSubarrayMins(int[] arr) {
    int n = arr.length;
    int mod = (int)1e9 + 7;
    int sum = 0;

    for (int i = 0; i < n; i++) {
      int min = arr[i];
      for (int j = i; j < n; j++) {
        min = Math.min(min, arr[j]);
        sum = (sum + min) % mod;
      }
    }

    return sum;
  }
}

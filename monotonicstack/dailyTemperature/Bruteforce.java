package monotonicstack.dailyTemperature;

public class Bruteforce {

  public int[] dailyTemperature(int[] temperatures) {
    int n = temperatures.length;
    int[] result = new int[n];

    for (int i = 0;i < n;i++) {
      int j;
      for (j = i+1;j < n;j++) {
        if (temperatures[i] < temperatures[j]) {
          result[i] = j-i;
          break;
        }
      }
      if (j == n) {
        result[i] = 0;
      }
    }

    return result;
  }
}

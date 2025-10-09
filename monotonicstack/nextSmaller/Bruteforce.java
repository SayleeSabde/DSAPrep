package monotonicstack.nextSmaller;

public class Bruteforce {
  public int[] finalPrices(int[] prices) {
    int n = prices.length;
    int[] finalPrices = new int[n];

    for (int i = 0;i < n;i++) {
      finalPrices[i] = prices[i];
      for (int j = i+1;j < n;j++) {
        if (prices[i] >= prices[j]) {
          finalPrices[i] = prices[i] - prices[j];
          break;
        }
      }
    }
    return finalPrices;
  }
}

package monotonicstack.validPreorder;

public class Bruteforce {

  //TC: O(n2)
  public boolean verifyPreorder(int[] preorder) {
    return isValid(preorder, 0, preorder.length-1, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean isValid(int[] preorder, int start, int end, int min, int max) {
    if (start > end) {
      return true;
    }
    int root = preorder[start];
    if (root <= min || root >= max) {
      return false;
    }

    int rightStart = start + 1;
    while (rightStart <= end && preorder[rightStart] < root) {
      rightStart++;
    }
    return isValid(preorder, start + 1, rightStart - 1, min, root)
          && isValid(preorder, rightStart, end, root, max);
  }
}

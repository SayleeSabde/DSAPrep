package monotonicstack.onlineStockSpan;

import java.util.Stack;

public class MonotonicStack {

  static class pair {
    int num;
    int cnt;

    public pair(int n, int c) {
      this.num = n;
      this.cnt = c;
    }
  }

  Stack<pair> st;

  public MonotonicStack() {
    st = new Stack<pair>();
  }

  public int next(int price) {
    push(price);
    return st.peek().cnt;
  }

  private void push(int price) {
    if (st.isEmpty()) {
      st.push(new pair(price, 1));
    } else {
      int c = 0;
      while(!st.isEmpty() && st.peek().num <= price) {
        c+=st.pop().cnt;
      }
      st.push(new pair(price, c+1));
    }
  }
}

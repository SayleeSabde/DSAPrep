package monotonicstack.removeNodes;

import java.util.Stack;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}

  ListNode(int val) { this.val = val; }

  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MonotonicStack {
  public ListNode removeNodes(ListNode head) {
    head = reverse(head);

    Stack<ListNode> stack = new Stack<>();
    ListNode curr = head;

    while (curr != null) {
      if (stack.isEmpty() || curr.val >= stack.peek().val) {
        stack.push(curr);
      }
      curr = curr.next;
    }

    ListNode newHead = null;
    ListNode prev = null;
    while (!stack.isEmpty()) {
      ListNode tmp = stack.pop();
      tmp.next = null;
      if (newHead == null) {
        newHead = tmp;
        prev = tmp;
      } else {
        prev.next = tmp;
        prev = tmp;
      }

    }
    return newHead;
  }

  private ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }

}

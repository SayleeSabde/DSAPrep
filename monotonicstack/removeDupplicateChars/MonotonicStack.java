package monotonicstack.removeDupplicateChars;

import java.util.Stack;

public class MonotonicStack {
  public String removeDuplicateLetters(String s) {
    int[] freq  = new int[26];

    boolean[] visited = new boolean[26]; // whether character is in result

    for (char c : s.toCharArray()) {
      freq[c - 'a']++;
    }

    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      freq[c - 'a']--; // one occurrence used

      if (visited[c - 'a']) continue; // already in result

      // Remove characters that are bigger and will appear again
      while (!stack.isEmpty() && c < stack.peek() && freq[stack.peek() - 'a'] > 0) {
        visited[stack.pop() - 'a'] = false;
      }

      stack.push(c);
      visited[c - 'a'] = true;
    }

    // Build result from stack
    StringBuilder sb = new StringBuilder();
    for (char c : stack) {
      sb.append(c);
    }
    return sb.toString();
  }
}

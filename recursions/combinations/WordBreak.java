package recursions.combinations;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/word-break/description/
 */
public class WordBreak {

    private static boolean canBreak(String s, Set<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }
        for (int end = start+1;end <= s.length();end++) {
            String prefix = s.substring(start, end);
            if (wordDict.contains(prefix)) {
                System.out.println(prefix);
                System.out.println(start + prefix.length());
                if (canBreak(s, wordDict, start + prefix.length())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        return canBreak(s, new HashSet<>(wordDict), 0);
    }
}

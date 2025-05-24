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
        for (String word: wordDict) {
            if (s.startsWith(word, start)) {
                //Explore p
                if (canBreak(s, wordDict, start+word.length())) {
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

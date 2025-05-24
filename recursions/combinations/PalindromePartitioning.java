package recursions.combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-partitioning/
 */
public class PalindromePartitioning {
    private static boolean checkPalindrome(String s) {
        int j = s.length()-1;
        for (int i = 0;i < s.length() && j >= 0;i++) {
            if (s.charAt(i) != s.charAt(j-i)) {
                return false;
            }
        }
        return true;
    }
    private static void generateSubstrings(String s, int index, List<List<String>> res, List<String> tmp) {
        if (index >= s.length()) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = index;i < s.length();i++) {
            boolean flag = checkPalindrome(s.substring(index, i+1));
            if (flag) {
                tmp.add(s.substring(index,i+1));
                generateSubstrings(s, i+1, res, tmp);
                tmp.remove(tmp.size()-1);
            }
        }

    }
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        generateSubstrings(s, 0, res, tmp);
        return res;
    }
}

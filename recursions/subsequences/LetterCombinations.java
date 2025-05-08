package recursions.subsequences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 */
public class LetterCombinations {

    static Map<Character, String> digiMap = new HashMap<>();
    static {
        digiMap.put('2', "abc");
        digiMap.put('3', "def");
        digiMap.put('4', "ghi");
        digiMap.put('5', "jkl");
        digiMap.put('6', "mno");
        digiMap.put('7', "pqrs");
        digiMap.put('8', "tuv");
        digiMap.put('9', "wxyz");
    }

    public static List<String> letterCombinations(String digits) {
        int n = digits.length();
        List<String> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }

        getCombinations(digits, "", res, 0, n);
        return res;
    }

    private static void getCombinations(String digits, String s, List<String> res, int ind, int n) {
        if (s.length() == n) {
            res.add(s);
            return;
        }

        String key = digiMap.get(digits.charAt(ind));

        for (int i = 0;i < key.length();i++) {
            getCombinations(digits, s + key.charAt(i), res, ind+1, n);
        }

    }
}

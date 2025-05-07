package recursions.subsequences;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate binary strings of length n without adjacent zeroes
 * https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/description/
 * Note: instead of concatening string, we can use stringbuilder and use append and deletechar method
 */
public class GenerateBinaryStringsWithoutAdjZeroes {

    public static List<String> generateBinStringsWithoutAdjZeroes(int n) {
        List<String> res = new ArrayList<>();

        helper(res, n, "");

        return res;
    }

    private static void helper(List<String> res, int n, String str) {
        if (str.length() == n) {
            res.add(str);
            return;
        }

        if (str.isEmpty() || (!str.isEmpty() && str.charAt(str.length()-1) != '0')) {
            helper(res, n, str + "0");
        }
        helper(res, n, str + "1");
    }
}

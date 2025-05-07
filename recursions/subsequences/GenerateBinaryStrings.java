package recursions.subsequences;

import java.util.ArrayList;
import java.util.List;

/**
 * Given input n, Generate all binary strings of length n
 * https://www.geeksforgeeks.org/generate-all-the-binary-strings-of-n-bits/
 */
public class GenerateBinaryStrings {

    public static List<String> generateBinaryStrings(int n) {
        List<String> res = new ArrayList<>();

        helper(res, n, "");

        return res;
    }

    private static void helper(List<String> res, int n, String str) {
        if (str.length() == n) {
            res.add(str);
            return;
        }

        helper(res, n, str + "0");
        helper(res, n, str + "1");
    }
}

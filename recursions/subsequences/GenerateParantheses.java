package recursions.subsequences;

import java.util.ArrayList;
import java.util.List;

/**
 * Given value "n", Generate all combinations of open and closed parantheses
 * https://leetcode.com/problems/generate-parentheses/description/
 */
public class GenerateParantheses {

    public static List<String> generateParenthesis(int n) {
        //your code goes here
        List<String> res = new ArrayList<>();

        helper(res, 0, 0, n, "");
        return res;

    }

    /**
     *
     * @param res  result list
     * @param oc open parentheses count
     * @param cc closed parantheses count
     * @param n given input n
     * @param s string to be added in result
     */
    private static void helper(List<String> res, int oc, int cc, int n, String s) {
        if (oc == n && cc == n) {
            res.add(s);
        }

        if (oc < n) {
            helper(res, oc+1, cc, n, s + "(");
        }
        if (cc < oc) {
            helper(res, oc, cc+1, n, s + ")");
        }
    }
}

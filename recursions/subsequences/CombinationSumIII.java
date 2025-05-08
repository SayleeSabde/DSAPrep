package recursions.subsequences;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum-iii/description/
 * Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
 * Only numbers 1 through 9 are used.
 * Each number is used at most once.
 * Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.
 */
public class CombinationSumIII {
    private static void helper(List<List<Integer>> res, int target, int sum, int index, List<Integer> tmp, int k) {

        if (tmp.size() == k || index > 9) {
            if (sum == target && tmp.size() == k) {
                res.add(new ArrayList<>(tmp));
            }
            return;
        }
        if (index <= (target-sum)) {
            tmp.add(index);
            helper(res, target, sum + index, index + 1, tmp, k);
            tmp.remove(tmp.size()-1);
        }

        helper(res, target, sum, index + 1, tmp, k);
    }

    public static List<List<Integer>> combinationSum(int target, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, target, 0, 1, new ArrayList<>(), k);
        return res;

    }
}

package recursions.subsequences;

import java.util.ArrayList;
import java.util.List;

/**
 * Same as Combination sum with no duplicates allowed
 * https://leetcode.com/problems/combination-sum-ii/description/
 */
public class CombinationSumII {

    private static void helper(List<List<Integer>> res, int[] candidates, int target, int sum, int index, List<Integer> tmp, int prev) {

        if (index == candidates.length) {
            if (sum == target) {
                res.add(new ArrayList<>(tmp));
            }
            return;
        } else if (sum > target) {
            return;
        }
        if (candidates[index] != prev) {
            tmp.add(candidates[index]);
            helper(res, candidates, target, sum + candidates[index], index+1, tmp, prev);
            tmp.remove(tmp.size()-1);
            prev = candidates[index];
        }

        helper(res, candidates, target, sum, index + 1, tmp, prev);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, candidates, target, 0, 0, new ArrayList<>(), -1);
        return res;

    }
}

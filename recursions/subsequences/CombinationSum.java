package recursions.subsequences;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/
 */
public class CombinationSum {

    private static void helper(List<List<Integer>> res, int[] candidates, int target, int sum, int index, List<Integer> tmp) {

        if (index == candidates.length) {
            if (sum == target) {
                res.add(new ArrayList<>(tmp));
            }
            return;
        }
        if (candidates[index] <= (target-sum)) {
            tmp.add(candidates[index]);
            helper(res, candidates, target, sum + candidates[index], index, tmp);
            tmp.remove(tmp.size()-1);
        }

        helper(res, candidates, target, sum, index + 1, tmp);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, candidates, target, 0, 0, new ArrayList<>());
        return res;

    }
}

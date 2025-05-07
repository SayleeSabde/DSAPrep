package recursions.subsequences;

import java.util.ArrayList;
import java.util.List;

/**
 * Print powerset of given array or generate all subsequences
 * https://leetcode.com/problems/subsets/description/
 */
public class PowerSet {

    private static void solve(int idx, int[] nums, List<Integer> list, List<List<Integer>> res) {
        res.add(new ArrayList<>(list));

        for (int i = idx;i < nums.length;i++) {
            list.add(nums[i]);
            solve(i+1, nums, list, res);
            list.remove(list.size()-1);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), res);
        return res;
    }
}

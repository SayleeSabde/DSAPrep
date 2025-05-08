package recursions.subsequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * i/p: [1,2,2]
 * o/p: [[],[1],[1,2],[1,2,2],[2],[2,2]]
 */
public class SubsetsII {

    private static void helper(List<List<Integer>> res, int[] nums, int index, List<Integer> tmp) {
        res.add(new ArrayList<>(tmp));

        for (int i = index;i < nums.length;i++) {
            if (i != index && nums[i-1] == nums[i])
                continue;

            tmp.add(nums[i]);
            helper(res, nums, i + 1, tmp);
            tmp.remove(tmp.size()-1);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(res, nums, 0, new ArrayList<>());
        return res;
    }
}

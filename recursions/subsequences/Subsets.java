package recursions.subsequences;

import java.util.ArrayList;
import java.util.List;

/**
 * Print the list containing sum of  subsets
 * https://takeuforward.org/plus/dsa/problems/subsets-i
 * e.g. Input : nums = [2, 3]
 * Output : [0, 2, 3, 5]
 */
public class Subsets {

    private static void helper(List<Integer> res, int[] nums, int index, List<Integer> tmp, int sum) {
        res.add(sum);

        for (int i = index;i < nums.length;i++) {
            tmp.add(nums[i]);
            helper(res, nums, i + 1, tmp, sum + nums[i]);
            tmp.remove(tmp.size()-1);
        }
    }

    public static List<Integer> subsetSums(int[] nums) {
        //your code goes here
        List<Integer> res = new ArrayList<>();
        helper(res, nums, 0, new ArrayList<>(), 0);
        return res;
    }
}

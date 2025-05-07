package recursions.subsequences;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums and an integer k.Return the number of non-empty subsequences
 * of nums such that the sum of all elements in the subsequence is equal to k.
 * https://takeuforward.org/plus/dsa/problems/count-all-subsequences-with-sum-k
 */
public class CountSubsequencesWithTargetSum {

    private static void helper(int[] nums, List<List<Integer>> res, List<Integer> tmp, int k, int index, int sum) {
        //if (index == nums.length) {
            if (sum == k) {
                res.add(new ArrayList<>(tmp));
                return;
            } else if (sum > k) {
                return;
            }


       // }

//        helper(nums, res, tmp, k, index+1, sum);
//        tmp.add(nums[index]);
//        helper(nums, res, tmp, k, index+1, sum + nums[index]);
//        tmp.remove(tmp.size()-1);

        for (int i = index;i < nums.length;i++) {
            tmp.add(nums[i]);
            helper(nums, res, tmp, k, i+1, sum+nums[i]);
            tmp.remove(tmp.size()-1);
        }

    }
    public static int countSubsequenceWithTargetSum(int[] nums, int k) {
        //your code goes here
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, res, new ArrayList<>(), k, 0, 0);
        return res.size();
    }
}

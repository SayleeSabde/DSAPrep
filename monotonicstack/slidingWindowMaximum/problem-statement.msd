You are given an array nums and an integer k. Return an array of the maximum values in every contiguous subarray of size k.
Example:
Input:  nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]


Explanation:
- Window [1,3,-1] → max = 3
- Window [3,-1,-3] → max = 3
- Window [-1,-3,5] → max = 5
- … and so on.

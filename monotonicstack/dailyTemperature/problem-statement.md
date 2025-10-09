
Given a list of daily temperatures temps,
return a list result such that result[i] is the number of days you’d have to wait
after day i to get a warmer temperature. If there is no future day with a warmer temperature, 
set result[i] = 0.

Example:
Input:  [73, 74, 75, 71, 69, 72, 76, 73]
Output: [1, 1, 4, 2, 1, 1, 0, 0]


Constraints:
- Time complexity must be O(n).
- Use a monotonic decreasing stack to track indices of unresolved temperatures.

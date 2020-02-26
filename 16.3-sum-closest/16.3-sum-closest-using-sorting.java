import java.util.Arrays;

/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 *
 * https://leetcode.com/problems/3sum-closest/description/
 *
 * algorithms
 * Medium (45.72%)
 * Likes:    1648
 * Dislikes: 119
 * Total Accepted:    424.8K
 * Total Submissions: 929K
 * Testcase Example:  '[-1,2,1,-4]\n1'
 *
 * Given an array nums of n integers and an integer target, find three integers
 * in nums such that the sum is closest to target. Return the sum of the three
 * integers. You may assume that each input would have exactly one solution.
 * 
 * Example:
 * 
 * 
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 * 
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * 
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int twoSum = nums[low] + nums[high];
                if (twoSum + nums[i] == target) {
                    return target;
                } else if (twoSum + nums[i] < target) {
                    low++;
                } else {
                    high--;
                }
                if (Math.abs(target - twoSum - nums[i]) < Math.abs(target - closest)) {
                    closest = twoSum + nums[i];
                }
            }
        }
        return closest;
    }
}
// @lc code=end

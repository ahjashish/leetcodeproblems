import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 *
 * https://leetcode.com/problems/3sum/description/
 *
 * algorithms
 * Medium (25.50%)
 * Likes:    5603
 * Dislikes: 680
 * Total Accepted:    778K
 * Total Submissions: 3M
 * Testcase Example:  '[-1,0,1,2,-1,-4]'
 *
 * Given an array nums of n integers, are there elements a, b, c in nums such
 * that a + b + c = 0? Find all unique triplets in the array which gives the
 * sum of zero.
 * 
 * Note:
 * 
 * The solution set must not contain duplicate triplets.
 * 
 * Example:
 * 
 * 
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * 
 * A solution set is:
 * [
 * ⁠ [-1, 0, 1],
 * ⁠ [-1, -1, 2]
 * ]
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // -4,-1,-1,0,1,2
        Arrays.sort(nums);
        List<List<Integer>> solutionSet = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            // Break the loop for positive integers in a sorted array
            if (nums[i] > 0)
                break;
            // Continue looking triplets for negative integers or 0
            if (i == 0 || nums[i] != nums[i - 1]) {
                int low = i+1;
                int high = nums.length - 1;
                int targetSum = 0 - nums[i];
                while (low < high) {
                    if (nums[low] + nums[high] == targetSum) {
                        List<Integer> matchedTriplet = 
                        Arrays.asList(nums[i], nums[low], nums[high]);
                        solutionSet.add(matchedTriplet);
                        while (low < high && nums[low] == nums[low+1]) low++;
                        while (low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] < targetSum) {
                        while (low < high && nums[low] == nums[low+1]) low++;
                        low++;
                    } else {
                        while (low < high && nums[high] == nums[high-1]) high--;
                        high--;
                    }
                }
            }
        }
        return solutionSet;
    }
}
// @lc code=end

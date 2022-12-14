package leetcodeDec2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 14
 * Problem 198: House Robber
 *
 */


class Day14_198_HouseRobber {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);
        
        nums[1] = Math.max(nums[0], nums[1]);
        for (int i=2; i<n; i++) 
            nums[i] = Math.max(nums[i-1], nums[i-2]+nums[i]);
        
        return nums[n-1];
    }
}
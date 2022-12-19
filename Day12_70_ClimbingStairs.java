package leetcodeDec2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 12
 * Problem 70: Climbing Stairs
 *
 */


class Day12_70_ClimbingStairs {
    public int climbStairs(int n) {
        int dp [] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i=2; i<=n; i++)
            dp[i] = dp[i-1] + dp[i-2]; 
        return dp[n];
    }
}
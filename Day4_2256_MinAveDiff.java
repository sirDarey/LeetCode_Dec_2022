package leetcodeDec2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 4
 * Problem 2256: Minimum Average Difference
 *
 */


class Day4_2256_MinAveDiff {
    
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long forwardSum [] = new long [n];
        forwardSum[0] = nums[0];
        long minSoFar = Integer.MAX_VALUE;
        int answer = 0;

        for (int i=1; i<n; i++)
            forwardSum[i] = forwardSum[i-1] + nums[i];
        long end = forwardSum[n-1];

        for (int i=0; i<n-1; i++) {
            long forward = forwardSum[i];
            long temp = Math.abs(forward / (i+1) - (end - forward) / (n-i-1));
            if (minSoFar > temp) {
                minSoFar = temp;
                answer = i;
            }
        }
        long last = forwardSum[n-1] / (n);

        return (minSoFar > last) ? n-1 : answer;
    }
}
package leetcodeDec2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 13
 * Problem 931: Minimum Falling Path Sum
 *
 */


class Day13_931_MinFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int minSoFar = Integer.MAX_VALUE;
        int m = matrix.length; 
        int n = matrix[0].length;

        int memo [][] = new int[m][n];
        for (int j=0; j<n; j++)
            memo[m-1][j] = matrix[m-1][j];
        
        for (int i=m-2; i>=0; i--) {
            for (int j=0; j<n; j++) {
                int leftDiagonal = (j-1 < 0)? Integer.MAX_VALUE : memo[i+1][j-1];
                int rightDiagonal = (j+1 == n)? Integer.MAX_VALUE : memo[i+1][j+1];
                memo[i][j] = matrix[i][j] + Math.min(memo[i+1][j], Math.min(leftDiagonal, rightDiagonal));
            }
        }

        for (int j=0; j<n; j++)
            minSoFar = Math.min(minSoFar, memo[0][j]);
        
        return minSoFar;
    }
}
package leetcodeDec2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 11
 * Problem 124: Binary Tree Maximum Path Sum
 *
 */


class Day11_124_BinTreeMaxPathSum {
    
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    int maxSoFar = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {        
        recur(root);
        return maxSoFar;
    }
    
    int recur (TreeNode node) {
        if (node == null)
            return 0;
        
        int leftSum = Math.max(0, recur(node.left));
        int rightSum = Math.max(0, recur(node.right));
        int pathSum = leftSum + rightSum + node.val;

        maxSoFar = Math.max(pathSum, maxSoFar);        
        return Math.max(leftSum, rightSum)+node.val;
    }
}
package leetcodeDec2022;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 10
 * Problem 1339: Maximum Product Of Splitted Binary Tree
 *
 */


class Day10_1339_MaxProdOfSplittedBinTree {
    
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
    
    List <Long> sumList = new ArrayList<>();

    public int maxProduct(TreeNode root) {
        long treeSum = postOrder(root);
        long maxSoFar = 0;
        int modulo = 1000000007;
        
        for (long x : sumList)
            maxSoFar = Math.max(maxSoFar, x*(treeSum - x));
        
        return (int)(maxSoFar % modulo);
    }

    long postOrder(TreeNode node){
        if (node == null)
            return 0;

        long left = postOrder(node.left);
        long right = postOrder(node.right);
        long subTreeSum = left + right + node.val;

        sumList.add(subTreeSum);
        return subTreeSum;
    }
}
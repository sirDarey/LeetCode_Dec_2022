package leetcodeDec2022;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 9
 * Problem 1026: Maximum Difference Between Node and Ancestor
 *
 */


class Day9_1026_MaxDiffBtwNodeAndAncestor {
    
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
    
    public int maxAncestorDiff(TreeNode root) {
        return recur(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    int recur (TreeNode node, int max, int min) {
        if (node == null)
            return 0;
        
        max = Math.max(max, node.val);
        min = Math.min(min, node.val);
        
        if (node.left == null && node.right == null)
            return max - min;
        return Math.max(recur(node.left, max, min), recur(node.right, max, min));
    }
}
package leetcodeDec2022;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 8
 * Problem 872: Leaf Similar Trees 
 *
 */


class Day8_872_LeafSimilarTrees {
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
    
    List <Integer> list1 = new ArrayList<>(),
                  list2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        recur (root1, list1);
        recur (root2, list2);

        return list1.equals(list2);
    }

    void recur(TreeNode root, List<Integer> list){
        if (root == null)
            return;

        if (root.left == null && root.right == null)
            list.add(root.val);
        else {
            recur(root.left, list);
            recur(root.right, list);
        }            
    }
}
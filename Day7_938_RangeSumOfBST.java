package leetcodeDec2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 7
 * Problem 938: Range Sum of BST
 *
 */


class Day7_938_RangeSumOfBST {
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
    public int rangeSumBST(TreeNode root, int low, int high) {

        if (root == null)
            return 0;
        
        int sum = 0;
        int value = root.val;

        if (value >= low && value <= high)
            sum += value;
        sum += rangeSumBST(root.left, low, high);
        sum += rangeSumBST(root.right, low, high);

        return sum;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        int left_tree = findLen(root.left);
        int right_tree = findLen(root.right);
        int max=Integer.MIN_VALUE;
        max=Math.max(max, left_tree+right_tree);

        int left_dia = diameterOfBinaryTree(root.left);
        int right_dia = diameterOfBinaryTree(root.right);

        return Math.max(max, Math.max(left_dia, right_dia));
    }

    public int findLen(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left = findLen(root.left);
        int right = findLen(root.right);

        return 1+Math.max(left, right);
    }
}

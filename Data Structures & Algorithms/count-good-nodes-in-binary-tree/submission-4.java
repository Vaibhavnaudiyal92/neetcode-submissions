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
    int count = 0;
    public int goodNodes(TreeNode root) {
        
        if(root==null)
        {
            return count;
        }

        
        int max=root.val;

        countGood(root, max);
        return count;
    }

    public void countGood(TreeNode root, int max)
    {

        if(root==null)
        {
            return;
        }
        if(root.val>=max)
        {
            count++;
            max=root.val;    
        }
        countGood(root.left, max);
        countGood(root.right, max);

        return;
    }
}

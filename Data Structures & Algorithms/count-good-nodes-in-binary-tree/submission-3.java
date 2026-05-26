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
    //int max=Integer.MIN_VALUE;
    int count_good=0;
    public int goodNodes(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        count_good=0;
        int max=Integer.MIN_VALUE;        
        countGood(root, max);
        return count_good;
    }

    public void countGood(TreeNode root, int max)
    {

        if(root==null)
        {
            return;
        }
        if(root.val>=max)
        {
            
            count_good=count_good+1;
            max = root.val;
        }
        countGood(root.left, max);
        countGood(root.right, max);
        return;
    }

}

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
    int pre=0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }

        return constructTree(preorder, 0, preorder.length-1);
    }

    public TreeNode constructTree(int[] preorder, int l, int r)
    {
        if(l>r)
        {
            return null;
        }
        int root_ele = preorder[pre];
        pre++;
        TreeNode root = new TreeNode(root_ele);
        int mid = map.get(root_ele);

        root.left = constructTree(preorder, l, mid-1);
        root.right = constructTree(preorder, mid+1, r);


        return root;
    }
}

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
    public List<Integer> rightSideView(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        if(root==null)
        {
            return res;
        }

        q.offer(root);

        while(!q.isEmpty())
        {
            int qLen=q.size();
            TreeNode right = null;
            for(int i=0;i<qLen;i++)
            {
                TreeNode temp = new TreeNode();
                temp = q.poll();
                if(temp!=null)
                {
                    q.offer(temp.left);
                    q.offer(temp.right);
                    right=temp;
                }
            }

            if(right!=null)
            {
                res.add(right.val);
            }


        }

        return res;
    }
}

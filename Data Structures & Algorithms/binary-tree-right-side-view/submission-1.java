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

            int qLen = q.size();
            int right = Integer.MIN_VALUE;
            for(int i=0;i<qLen;i++)
            {
                TreeNode temp=q.poll();
                
                if(temp!=null)
                {   
                    //right = temp;
                    right = temp.val;
                    q.offer(temp.left);
                    q.offer(temp.right);

                }

            }
            if(right>Integer.MIN_VALUE)
                res.add(right);
            
        }

        return res;
    }
}

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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int max=Integer.MIN_VALUE;
        int ans=0;
        int level=0;
        int cs=0;
        while(!q.isEmpty()){
            TreeNode currnode=q.remove();
            if(currnode==null){
                level++;
                if(max<cs){
                    ans=level;
                    max=cs;
                    cs=0;
                }
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    cs=0;
                }
            }
            else{
                cs+=currnode.val;
                if(currnode.left!=null){
                    q.add(currnode.left);
                }
                if(currnode.right!=null){
                    q.add(currnode.right);
                }
            }
        }
        return ans;
    }
}
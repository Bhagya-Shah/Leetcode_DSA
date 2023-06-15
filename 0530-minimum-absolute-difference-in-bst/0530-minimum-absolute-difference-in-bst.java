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
    List<Integer> list=new ArrayList<>();
    public void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            ans=Math.min(ans,list.get(i)-list.get(i-1));
        }
        return ans;
    }
}
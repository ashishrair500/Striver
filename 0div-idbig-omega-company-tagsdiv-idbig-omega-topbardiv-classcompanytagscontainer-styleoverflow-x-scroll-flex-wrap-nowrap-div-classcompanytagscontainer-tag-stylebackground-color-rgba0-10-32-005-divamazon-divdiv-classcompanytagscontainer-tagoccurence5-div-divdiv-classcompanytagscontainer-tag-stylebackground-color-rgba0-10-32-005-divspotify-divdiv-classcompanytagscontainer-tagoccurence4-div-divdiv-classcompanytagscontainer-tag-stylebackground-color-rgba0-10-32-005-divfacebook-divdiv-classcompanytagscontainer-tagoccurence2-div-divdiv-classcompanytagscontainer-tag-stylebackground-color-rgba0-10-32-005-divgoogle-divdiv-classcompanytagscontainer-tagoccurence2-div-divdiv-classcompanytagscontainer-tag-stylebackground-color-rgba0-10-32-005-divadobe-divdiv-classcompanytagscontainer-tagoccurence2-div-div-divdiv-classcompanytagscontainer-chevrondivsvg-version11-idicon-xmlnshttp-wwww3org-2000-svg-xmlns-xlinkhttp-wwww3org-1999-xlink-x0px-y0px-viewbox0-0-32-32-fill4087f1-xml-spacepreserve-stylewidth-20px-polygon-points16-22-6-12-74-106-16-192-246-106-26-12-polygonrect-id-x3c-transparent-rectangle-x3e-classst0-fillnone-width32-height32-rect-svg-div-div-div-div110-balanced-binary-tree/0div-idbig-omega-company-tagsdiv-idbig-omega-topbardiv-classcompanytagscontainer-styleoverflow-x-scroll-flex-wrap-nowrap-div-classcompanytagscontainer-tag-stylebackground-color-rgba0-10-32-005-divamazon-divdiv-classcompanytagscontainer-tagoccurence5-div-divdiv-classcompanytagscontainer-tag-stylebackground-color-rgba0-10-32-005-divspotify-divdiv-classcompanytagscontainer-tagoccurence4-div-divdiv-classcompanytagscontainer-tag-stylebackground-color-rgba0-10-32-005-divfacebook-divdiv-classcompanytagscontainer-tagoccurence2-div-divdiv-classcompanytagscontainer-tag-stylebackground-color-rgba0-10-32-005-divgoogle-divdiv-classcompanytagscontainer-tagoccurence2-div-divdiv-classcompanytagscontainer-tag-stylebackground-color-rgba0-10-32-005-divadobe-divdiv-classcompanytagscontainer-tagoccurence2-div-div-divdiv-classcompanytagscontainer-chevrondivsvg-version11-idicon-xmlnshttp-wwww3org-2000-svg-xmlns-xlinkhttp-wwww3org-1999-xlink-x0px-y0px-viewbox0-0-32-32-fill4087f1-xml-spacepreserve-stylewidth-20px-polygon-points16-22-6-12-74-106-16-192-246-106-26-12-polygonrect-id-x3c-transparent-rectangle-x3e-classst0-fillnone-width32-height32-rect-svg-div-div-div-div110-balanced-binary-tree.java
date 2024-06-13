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
    
   static int  is(TreeNode root){
        if(root==null) return 0;
       int l=is(root.left);
       int r=is(root.right);
       
       return 1 + Math.max(l,r);
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int l =is(root.left);
        int r =is(root.right);
        
       if(Math.abs(l-r)<=1  && isBalanced( root.left)&& isBalanced( root.right)) return true;
        
        return false;
    }
}
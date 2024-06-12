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
   public static void op(TreeNode root, List<Integer> ans){
       if(root==null) return;
       
        op(root.left,ans);
        op(root.right,ans);
       ans.add(root.val);
       
    }
    
    public List<Integer> postorderTraversal(TreeNode root){
        
        List<Integer> ans =new ArrayList<>();
        op(root,ans);
       return ans;
    }
}
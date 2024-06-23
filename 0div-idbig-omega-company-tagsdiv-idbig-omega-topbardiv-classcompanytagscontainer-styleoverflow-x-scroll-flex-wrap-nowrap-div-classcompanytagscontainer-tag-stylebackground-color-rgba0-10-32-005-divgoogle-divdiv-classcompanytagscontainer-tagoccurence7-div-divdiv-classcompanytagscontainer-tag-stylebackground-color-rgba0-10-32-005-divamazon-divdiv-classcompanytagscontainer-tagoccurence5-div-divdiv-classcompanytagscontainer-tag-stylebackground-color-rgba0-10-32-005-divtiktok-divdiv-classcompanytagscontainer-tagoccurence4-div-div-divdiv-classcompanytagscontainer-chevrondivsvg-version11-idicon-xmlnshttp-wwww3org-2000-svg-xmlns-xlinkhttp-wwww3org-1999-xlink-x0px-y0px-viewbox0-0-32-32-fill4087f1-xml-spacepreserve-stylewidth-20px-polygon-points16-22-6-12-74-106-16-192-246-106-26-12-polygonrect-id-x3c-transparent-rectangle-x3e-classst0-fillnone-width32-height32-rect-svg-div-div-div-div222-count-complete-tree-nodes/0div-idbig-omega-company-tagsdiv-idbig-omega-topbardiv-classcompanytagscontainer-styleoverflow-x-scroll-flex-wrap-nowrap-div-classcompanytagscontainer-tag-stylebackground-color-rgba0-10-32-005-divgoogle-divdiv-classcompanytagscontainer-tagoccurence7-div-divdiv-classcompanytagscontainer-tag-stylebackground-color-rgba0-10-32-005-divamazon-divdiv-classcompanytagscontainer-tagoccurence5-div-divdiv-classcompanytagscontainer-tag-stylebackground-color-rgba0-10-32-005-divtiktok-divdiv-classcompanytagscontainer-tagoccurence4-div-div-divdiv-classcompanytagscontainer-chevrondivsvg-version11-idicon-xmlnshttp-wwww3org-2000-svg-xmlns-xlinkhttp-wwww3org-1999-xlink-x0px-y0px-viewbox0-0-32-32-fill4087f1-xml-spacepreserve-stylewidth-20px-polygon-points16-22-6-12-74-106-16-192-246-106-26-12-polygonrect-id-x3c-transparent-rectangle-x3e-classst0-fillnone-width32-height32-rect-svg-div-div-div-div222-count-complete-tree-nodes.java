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
    void dfs(TreeNode root ,int []arr){
        if(root==null) return;
        
        arr[0]++;
        dfs(root.left,arr);
        dfs(root.right,arr);
    }
    public int countNodes(TreeNode root) {
      int arr[]=new int[1];
        dfs(root , arr);
        return arr[0];
  }
}
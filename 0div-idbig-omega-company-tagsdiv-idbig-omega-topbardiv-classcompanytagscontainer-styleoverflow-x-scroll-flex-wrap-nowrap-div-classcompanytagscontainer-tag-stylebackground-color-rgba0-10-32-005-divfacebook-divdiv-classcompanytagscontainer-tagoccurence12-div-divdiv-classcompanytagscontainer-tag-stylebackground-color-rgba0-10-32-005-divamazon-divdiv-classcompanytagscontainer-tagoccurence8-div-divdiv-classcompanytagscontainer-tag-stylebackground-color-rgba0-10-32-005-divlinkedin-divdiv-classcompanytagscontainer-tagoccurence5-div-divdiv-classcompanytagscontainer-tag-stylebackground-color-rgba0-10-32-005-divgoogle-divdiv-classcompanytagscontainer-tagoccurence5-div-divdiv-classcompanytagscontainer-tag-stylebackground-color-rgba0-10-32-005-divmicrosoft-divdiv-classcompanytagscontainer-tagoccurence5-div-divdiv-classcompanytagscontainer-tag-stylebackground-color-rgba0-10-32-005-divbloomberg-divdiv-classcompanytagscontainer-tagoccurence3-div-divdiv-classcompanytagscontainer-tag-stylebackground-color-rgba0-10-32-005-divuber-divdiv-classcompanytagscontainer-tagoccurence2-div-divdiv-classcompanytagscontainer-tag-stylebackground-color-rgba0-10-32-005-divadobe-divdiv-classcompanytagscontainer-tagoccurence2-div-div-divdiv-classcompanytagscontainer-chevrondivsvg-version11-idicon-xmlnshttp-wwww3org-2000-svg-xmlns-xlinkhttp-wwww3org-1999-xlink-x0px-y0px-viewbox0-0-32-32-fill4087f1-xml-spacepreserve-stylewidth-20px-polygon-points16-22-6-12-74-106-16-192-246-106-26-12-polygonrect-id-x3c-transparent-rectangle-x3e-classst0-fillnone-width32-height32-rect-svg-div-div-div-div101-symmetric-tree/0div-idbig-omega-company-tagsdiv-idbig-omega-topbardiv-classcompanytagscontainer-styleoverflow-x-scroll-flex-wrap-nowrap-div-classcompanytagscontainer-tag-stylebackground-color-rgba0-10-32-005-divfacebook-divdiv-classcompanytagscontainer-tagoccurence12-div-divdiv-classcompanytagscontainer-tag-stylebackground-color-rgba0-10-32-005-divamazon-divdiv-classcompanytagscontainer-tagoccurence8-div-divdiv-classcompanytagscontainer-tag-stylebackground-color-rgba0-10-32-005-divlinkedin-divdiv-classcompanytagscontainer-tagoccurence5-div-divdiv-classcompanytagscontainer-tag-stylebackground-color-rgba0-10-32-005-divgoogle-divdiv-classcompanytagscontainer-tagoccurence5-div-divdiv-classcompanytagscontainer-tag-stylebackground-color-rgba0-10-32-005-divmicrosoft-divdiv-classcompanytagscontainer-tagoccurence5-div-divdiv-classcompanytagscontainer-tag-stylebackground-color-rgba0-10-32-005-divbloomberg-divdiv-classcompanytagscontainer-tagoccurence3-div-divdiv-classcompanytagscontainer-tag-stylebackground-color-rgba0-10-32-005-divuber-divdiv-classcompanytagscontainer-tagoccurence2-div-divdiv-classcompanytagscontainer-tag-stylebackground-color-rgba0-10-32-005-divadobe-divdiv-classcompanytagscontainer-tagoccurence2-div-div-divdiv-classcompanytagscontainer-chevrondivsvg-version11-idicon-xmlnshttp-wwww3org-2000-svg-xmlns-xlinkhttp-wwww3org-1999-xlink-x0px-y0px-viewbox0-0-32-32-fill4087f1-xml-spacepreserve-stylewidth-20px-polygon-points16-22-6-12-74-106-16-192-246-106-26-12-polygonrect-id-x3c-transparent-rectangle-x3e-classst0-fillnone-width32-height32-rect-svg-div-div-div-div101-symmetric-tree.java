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
    void check(TreeNode root1,TreeNode root2,boolean []arr){
        if(root1==null|| root2==null)
        {  
           if(root1!=null || root2!=null)
               arr[0]=false;
            
            return;
        
        }
        if(root1.val!=root2.val) arr[0]=false;
        check( root1.left, root2.right,arr);
        check( root1.right, root2.left,arr);
    }
    public boolean isSymmetric(TreeNode root) {
        boolean [] arr=new boolean[1];
        arr[0]=true;
        check(root.left,root.right , arr);
        return arr[0];
    }
}
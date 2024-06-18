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
//    void get(TreeNode root,List<Integer>ds){
//         if(root==null) return;
//         ds.add(root.val);
        
//         get(root.right,ds);
        
//     }
    
    
    void right(TreeNode root, int level,List<Integer> ans){
        if(root==null) return;
        if(ans.size()==level){
            ans.add(root.val);
        }
        right(root.right,level+1,ans);
        right(root.left,level+1,ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans =new ArrayList<>();
        
         right(root,0,ans);
         return ans;
           
    }
    
    
        
}
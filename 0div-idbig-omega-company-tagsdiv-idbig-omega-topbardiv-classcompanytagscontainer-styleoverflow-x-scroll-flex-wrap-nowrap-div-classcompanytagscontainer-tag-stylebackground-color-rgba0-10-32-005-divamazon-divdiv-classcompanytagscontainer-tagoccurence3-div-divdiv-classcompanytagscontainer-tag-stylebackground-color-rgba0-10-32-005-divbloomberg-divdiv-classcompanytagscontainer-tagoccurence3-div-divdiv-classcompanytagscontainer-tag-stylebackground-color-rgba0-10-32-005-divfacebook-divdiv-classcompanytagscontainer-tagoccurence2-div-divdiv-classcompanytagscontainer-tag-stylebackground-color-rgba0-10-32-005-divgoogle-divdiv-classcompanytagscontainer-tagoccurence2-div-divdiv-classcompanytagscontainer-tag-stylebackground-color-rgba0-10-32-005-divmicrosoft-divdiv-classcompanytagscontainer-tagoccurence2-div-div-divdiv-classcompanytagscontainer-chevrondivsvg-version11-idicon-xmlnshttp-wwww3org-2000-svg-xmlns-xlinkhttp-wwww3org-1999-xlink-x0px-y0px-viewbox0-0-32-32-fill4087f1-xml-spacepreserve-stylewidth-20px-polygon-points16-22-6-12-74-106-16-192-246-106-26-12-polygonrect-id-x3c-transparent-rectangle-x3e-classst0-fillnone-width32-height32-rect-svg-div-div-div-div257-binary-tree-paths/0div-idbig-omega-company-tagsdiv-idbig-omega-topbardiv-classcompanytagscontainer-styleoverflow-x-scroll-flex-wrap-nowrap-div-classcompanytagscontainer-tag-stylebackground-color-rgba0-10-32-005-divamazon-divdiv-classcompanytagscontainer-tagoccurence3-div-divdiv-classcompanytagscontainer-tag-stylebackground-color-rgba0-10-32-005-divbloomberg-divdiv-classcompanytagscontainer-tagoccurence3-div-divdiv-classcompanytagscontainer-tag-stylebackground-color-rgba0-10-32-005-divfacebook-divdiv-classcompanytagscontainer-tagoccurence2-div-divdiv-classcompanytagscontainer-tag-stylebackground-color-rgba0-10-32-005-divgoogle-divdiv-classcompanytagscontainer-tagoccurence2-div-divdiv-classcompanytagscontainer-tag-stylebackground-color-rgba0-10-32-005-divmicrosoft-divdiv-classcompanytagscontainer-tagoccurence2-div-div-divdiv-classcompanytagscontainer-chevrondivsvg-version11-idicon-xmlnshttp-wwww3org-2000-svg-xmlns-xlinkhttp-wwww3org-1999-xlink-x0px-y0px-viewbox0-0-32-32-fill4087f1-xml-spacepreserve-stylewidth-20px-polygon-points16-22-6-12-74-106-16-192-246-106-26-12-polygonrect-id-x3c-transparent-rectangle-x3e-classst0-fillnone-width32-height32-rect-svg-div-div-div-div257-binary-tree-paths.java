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
    private static String pathToString(List<Integer> path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.size(); i++) {
            sb.append(path.get(i));
            if (i < path.size() - 1) {
                sb.append("->");
            }
        }
        return sb.toString();
    }
    static void ans(TreeNode root,List<String> ans,ArrayList<Integer> ds){
        if(root==null){
            return;
        }
        ds.add(root.val);
      
        if(root.left==null&& root.right==null){
            ans.add(pathToString(ds));
        }else{
            ans(root.left ,ans,ds);
            ans(root.right,ans ,ds);
        }
        ds.remove(ds.size()-1);
       
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans =new ArrayList<>();
         ans(root,ans,new ArrayList());
             return ans;
    }
}
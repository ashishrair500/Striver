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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
      
        if (root == null) {
            return ans;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count =0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
             List<Integer> a = new ArrayList<>();
            ArrayList<Integer> temp =new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
               
                TreeNode currentNode = queue.poll();
               temp.add(currentNode.val);
            
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
                
                
            }
            if(count%2!=0){
                Collections.reverse(temp);
            }
             
                a.addAll(temp);
            ans.add(a);
            count++;
            
        }
        
        return ans;
    }
}
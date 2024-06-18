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
    
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        TreeMap<Integer,Integer>mp= new TreeMap<>();
        Queue<TreeNode> q= new LinkedList<>();
        int levelsize=0;
        q.add(root);
        int key=0;
       //  mp.put(levelsize,root.val);  
        while(!q.isEmpty()){
            
        levelsize=q.size();
       
        for(int i=0; i<levelsize; i++){
          TreeNode node=q.poll();
        //  TreeNode node=p.getNode();  
         // int level=p.getLevel();
          mp.put(key,node.val);  
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
         }
            key++;
        }
        
        
        
        for(Map.Entry<Integer ,Integer>e:mp.entrySet()){
            ans.add(e.getValue());
        }
            return ans;
    }
    
    
        
}
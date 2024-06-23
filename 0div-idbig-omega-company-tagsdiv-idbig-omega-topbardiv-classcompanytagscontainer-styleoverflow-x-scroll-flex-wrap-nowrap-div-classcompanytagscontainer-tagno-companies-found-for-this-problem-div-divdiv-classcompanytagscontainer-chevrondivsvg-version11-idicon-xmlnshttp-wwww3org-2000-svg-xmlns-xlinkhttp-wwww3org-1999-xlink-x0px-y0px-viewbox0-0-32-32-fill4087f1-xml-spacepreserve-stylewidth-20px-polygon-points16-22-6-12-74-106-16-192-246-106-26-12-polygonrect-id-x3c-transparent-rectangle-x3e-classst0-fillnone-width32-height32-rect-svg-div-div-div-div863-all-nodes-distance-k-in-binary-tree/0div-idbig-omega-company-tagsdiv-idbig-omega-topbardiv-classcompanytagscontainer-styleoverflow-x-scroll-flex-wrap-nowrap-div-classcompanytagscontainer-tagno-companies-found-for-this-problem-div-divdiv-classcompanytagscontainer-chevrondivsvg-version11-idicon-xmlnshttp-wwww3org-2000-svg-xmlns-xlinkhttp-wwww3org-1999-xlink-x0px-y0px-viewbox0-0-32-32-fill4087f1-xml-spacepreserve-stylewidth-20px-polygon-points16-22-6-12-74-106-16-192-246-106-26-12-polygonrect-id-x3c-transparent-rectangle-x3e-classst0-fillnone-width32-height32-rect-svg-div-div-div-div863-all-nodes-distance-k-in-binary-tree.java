/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static void mark(TreeNode root , HashMap<TreeNode,TreeNode>parent_mark)
    {
      Queue<TreeNode>q =new LinkedList<>();
      q.offer(root);
      parent_mark.put(root,null);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                q.offer(curr.left);
                parent_mark.put(curr.left,curr);
            } 
            if(curr.right!=null){
                q.offer(curr.right);
                parent_mark.put(curr.right,curr);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode>parent_mark=new HashMap<>();
        mark(root,parent_mark);
        HashMap<TreeNode,Boolean>visited=new HashMap<>();
        Queue<TreeNode>q= new LinkedList<>();
        
        List<Integer> ans =new ArrayList<>();
        int level=0;
        q.offer(target);
        visited.put(target,true);
        
        
         while(!q.isEmpty()){
             
            int size=q.size();
             if(level==k){
                 break;
             }
              level++;
            for(int i=0 ;i<size; i++){
                
            TreeNode curr=q.poll();
                
            if(curr.left!=null && visited.get(curr.left)==null){
                q.offer(curr.left);
                visited.put(curr.left,true);
            } 
            if(curr.right!=null && visited.get(curr.right)==null){
                q.offer(curr.right);
                visited.put(curr.right,true);
            } 
           if(parent_mark.get(curr)!=null && visited.get(parent_mark.get(curr))==null){
                q.offer(parent_mark.get(curr));
                visited.put(parent_mark.get(curr),true) ;
            }
             
          }
            
        }
        
       while(!q.isEmpty()){
           TreeNode a=q.poll();
           ans.add(a.val);
       }
        return ans;
    }
}
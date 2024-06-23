//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException
    {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            Solution T = new Solution();
            int target = Integer.parseInt(br.readLine().trim());
            int k = Integer.parseInt(br.readLine().trim());
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = T.KDistanceNodes(root,target,k);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }

class Solution
{
    
    public static void adding(Node root,Map<Node,Node> map){
        
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            Node node=q.poll();
            
            if(node.left!=null){
                map.put(node.left,node);
                q.offer(node.left);
            }
            
            if(node.right!=null){
                map.put(node.right,node);
                q.offer(node.right);
            }
            
        }
        
    }
    
    public static Node finding(Node root,int target){
        
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            Node node=q.poll();
            
            if(node.data==target){
                return node;
            }
            
            if(node.left!=null){
                q.offer(node.left);
            }
            
            if(node.right!=null){
                q.offer(node.right);
            }
        }
        
        return root;
    }
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        Map<Node,Node> map=new HashMap<>();
        adding(root,map);
        
        Node node=finding(root,target);
        Map<Node,Integer> visited=new HashMap<>();
        visited.put(node,0);
        //BFS 
        
        Queue<Node> q=new LinkedList<>();
        q.offer(node);
        int cnt=0;
        
        
        while(!q.isEmpty()){
            
            
            int size=q.size();
            
            if(cnt==k){
                break;
            }
            
            while(size>0){
            
            Node n=q.poll();
            
            if(n.left!=null && visited.get(n.left)==null){
                q.offer(n.left);
                visited.put(n.left,0);
            }
            
            if(n.right!=null && visited.get(n.right)==null){
                q.offer(n.right);
                visited.put(n.right,0);
            }
            
            if(visited.get(map.get(n))==null && map.get(n)!=null){
                q.offer(map.get(n));
                visited.put(map.get(n),0);
            }
            
            size--;
            }
            
            cnt++;
            
        }
       ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            Node m=q.poll();
            ans.add(m.data);
        }
        
        Collections.sort(ans);
        return ans;
    }
};
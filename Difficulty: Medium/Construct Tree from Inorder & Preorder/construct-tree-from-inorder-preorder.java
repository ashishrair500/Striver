//{ Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
              inorder[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preorder[i] = sc.nextInt();
              
            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}
// } Driver Code Ends


class Solution {
   
    

    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // Map has no role in this question 
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        for(int x:inorder){
            map.put(x,i++);
        }
        Node root = BuildBT(preorder,0,n-1,inorder,0,n-1,map);
        return root;
    }
    public static Node BuildBT(int[] preorder,int preStart, int preEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer,Integer> map){
        if(preStart>preEnd || inStart>inEnd) return null;
        
        Node root = new Node(preorder[preStart]);
        // int index = map.get(root.data);
        int index = get_pos(inorder,inStart, inEnd, root.data);

        int nElme = index - inStart;
        
        root.left = BuildBT(preorder, preStart+1, preStart+nElme, inorder, inStart, index-1, map);
        root.right = BuildBT(preorder, preStart+nElme+1, preEnd, inorder, index+1, inEnd, map);
        return root;
    }
    // No. are duplicate so we have to find the index in range of inStart-inEnd
    public static int get_pos(int arr[], int start, int end, int val)
    {
        for(int i=start; i<=end; i++)
        {
            if(arr[i]==val) return i;
        }
        return -1;
    }
}

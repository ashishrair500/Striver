//{ Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
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
        if(root==null) return null;
        if(root.data==target) return root;
        Node left=finding(root.left,target);
        Node right=finding(root.right,target);
        return (left!=null)?left:right;
    }
    public static int minTime(Node root, int target) 
    {
        Map<Node,Node> map=new HashMap<>();
        adding(root,map);
        Node node=finding(root,target);
        Map<Node,Integer> visited=new HashMap<>();
        visited.put(node,0);
        Queue<Node> q=new LinkedList<>();
        q.offer(node);
        int cnt=-1;
        
        while(!q.isEmpty()){
            int size=q.size();
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
        return cnt;
    }
}
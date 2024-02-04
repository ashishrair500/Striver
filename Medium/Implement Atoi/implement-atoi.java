//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
        int ans=1;
	// Your code here
	if(s.length()==1 && Character.isDigit(s.charAt(0)))
	return (int)s.charAt(0)-48;
	else if(s.charAt(0)!='-'&&!Character.isDigit(s.charAt(0))) return -1;
	else if(!Character.isDigit(s.charAt(1))) return -1;
	
	if(s.charAt(0)=='-')
	{
	   ans=(int)s.charAt(1)-48;
	}else if(Character.isDigit(s.charAt(0))){
	  ans=(int)s.charAt(0)-48;
	  
	}
	else return -1;
	
	
	if (!Character.isDigit(s.charAt(1)))return -1;
	
	boolean flag =true;
	for(int i=1; i<s.length(); i++){
	    
	    	if(s.charAt(0)=='-' && flag==true){ 
	    	    flag=false;
	    	    continue;
	    	    
	    	}
	    
	        if(Character.isDigit(s.charAt(i))){
	        
	        ans=ans*10+((int)s.charAt(i)-48);
	        
	        }else return -1;
	    
	    
	    
	}
	return s.charAt(0)=='-'?-ans:ans;
	}
}

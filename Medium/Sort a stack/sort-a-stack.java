//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    static public void popq(int a ,Stack<Integer>st)
    {
        if(st.isEmpty() || st.peek()<a){
            st.push(a);
            return;
        }
    int z=st.pop();
    popq(a,st);
    st.push(z);
    }    
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        Stack<Integer> st =new Stack<>();
        st.push(s.pop());
        
        while(!s.isEmpty()){
            int a=s.pop();
            if(st.peek()>a){
                popq(a,st);
            }else st.push(a);
        }
        return st;
    }
}
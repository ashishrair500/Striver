class Solution {
    public String removeOuterParentheses(String s) {
        Stack <Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        st.push(s.charAt(0));
      for(int i=1; i<s.length(); i++){
          if(s.charAt(i)=='('){

              
              if(!st.isEmpty()){
                   sb.append(s.charAt(i));
              }
                           st.push('(');
          }else{
               st.pop();
              if(!st.isEmpty()){
                   sb.append(s.charAt(i));
              }
          }
      }
        
        
        return sb.toString();
    }
}
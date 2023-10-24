class Solution {
    public String longestCommonPrefix(String[] strs) {
     
        StringBuilder sb =  new StringBuilder(strs[0]);
        StringBuilder ans=  new StringBuilder("");
        

        for(int i=0; i<strs.length; i++){
               if(strs[i].length()==0) return "";
            
            int j=0;
            while(j<sb.length() && j<strs[i].length()&&sb.charAt(j)==strs[i].charAt(j)){
                
                j++;
            }
            
            sb.setLength(j);
        }   
    
    return sb.toString();
    }
    
    }
class Solution {
    public boolean isIsomorphic(String str1, String str2) {
          HashMap<Character,Character> hm= new HashMap<>();
        
        
        for(int i=0; i<str1.length(); i++){
            if(hm.containsKey(str1.charAt(i))  &&    hm.get(str1.charAt(i))!=str2.charAt(i) 
         return false!   
            }else if(!(hm.containsKey(str1.charAt(i))) && hm.containsValue(str2.charAt(i)))
            {
                return false;
            }else{
                hm.put(str1.charAt(i),str2.charAt(i));
            }
            
        }
        return true;
    }
}

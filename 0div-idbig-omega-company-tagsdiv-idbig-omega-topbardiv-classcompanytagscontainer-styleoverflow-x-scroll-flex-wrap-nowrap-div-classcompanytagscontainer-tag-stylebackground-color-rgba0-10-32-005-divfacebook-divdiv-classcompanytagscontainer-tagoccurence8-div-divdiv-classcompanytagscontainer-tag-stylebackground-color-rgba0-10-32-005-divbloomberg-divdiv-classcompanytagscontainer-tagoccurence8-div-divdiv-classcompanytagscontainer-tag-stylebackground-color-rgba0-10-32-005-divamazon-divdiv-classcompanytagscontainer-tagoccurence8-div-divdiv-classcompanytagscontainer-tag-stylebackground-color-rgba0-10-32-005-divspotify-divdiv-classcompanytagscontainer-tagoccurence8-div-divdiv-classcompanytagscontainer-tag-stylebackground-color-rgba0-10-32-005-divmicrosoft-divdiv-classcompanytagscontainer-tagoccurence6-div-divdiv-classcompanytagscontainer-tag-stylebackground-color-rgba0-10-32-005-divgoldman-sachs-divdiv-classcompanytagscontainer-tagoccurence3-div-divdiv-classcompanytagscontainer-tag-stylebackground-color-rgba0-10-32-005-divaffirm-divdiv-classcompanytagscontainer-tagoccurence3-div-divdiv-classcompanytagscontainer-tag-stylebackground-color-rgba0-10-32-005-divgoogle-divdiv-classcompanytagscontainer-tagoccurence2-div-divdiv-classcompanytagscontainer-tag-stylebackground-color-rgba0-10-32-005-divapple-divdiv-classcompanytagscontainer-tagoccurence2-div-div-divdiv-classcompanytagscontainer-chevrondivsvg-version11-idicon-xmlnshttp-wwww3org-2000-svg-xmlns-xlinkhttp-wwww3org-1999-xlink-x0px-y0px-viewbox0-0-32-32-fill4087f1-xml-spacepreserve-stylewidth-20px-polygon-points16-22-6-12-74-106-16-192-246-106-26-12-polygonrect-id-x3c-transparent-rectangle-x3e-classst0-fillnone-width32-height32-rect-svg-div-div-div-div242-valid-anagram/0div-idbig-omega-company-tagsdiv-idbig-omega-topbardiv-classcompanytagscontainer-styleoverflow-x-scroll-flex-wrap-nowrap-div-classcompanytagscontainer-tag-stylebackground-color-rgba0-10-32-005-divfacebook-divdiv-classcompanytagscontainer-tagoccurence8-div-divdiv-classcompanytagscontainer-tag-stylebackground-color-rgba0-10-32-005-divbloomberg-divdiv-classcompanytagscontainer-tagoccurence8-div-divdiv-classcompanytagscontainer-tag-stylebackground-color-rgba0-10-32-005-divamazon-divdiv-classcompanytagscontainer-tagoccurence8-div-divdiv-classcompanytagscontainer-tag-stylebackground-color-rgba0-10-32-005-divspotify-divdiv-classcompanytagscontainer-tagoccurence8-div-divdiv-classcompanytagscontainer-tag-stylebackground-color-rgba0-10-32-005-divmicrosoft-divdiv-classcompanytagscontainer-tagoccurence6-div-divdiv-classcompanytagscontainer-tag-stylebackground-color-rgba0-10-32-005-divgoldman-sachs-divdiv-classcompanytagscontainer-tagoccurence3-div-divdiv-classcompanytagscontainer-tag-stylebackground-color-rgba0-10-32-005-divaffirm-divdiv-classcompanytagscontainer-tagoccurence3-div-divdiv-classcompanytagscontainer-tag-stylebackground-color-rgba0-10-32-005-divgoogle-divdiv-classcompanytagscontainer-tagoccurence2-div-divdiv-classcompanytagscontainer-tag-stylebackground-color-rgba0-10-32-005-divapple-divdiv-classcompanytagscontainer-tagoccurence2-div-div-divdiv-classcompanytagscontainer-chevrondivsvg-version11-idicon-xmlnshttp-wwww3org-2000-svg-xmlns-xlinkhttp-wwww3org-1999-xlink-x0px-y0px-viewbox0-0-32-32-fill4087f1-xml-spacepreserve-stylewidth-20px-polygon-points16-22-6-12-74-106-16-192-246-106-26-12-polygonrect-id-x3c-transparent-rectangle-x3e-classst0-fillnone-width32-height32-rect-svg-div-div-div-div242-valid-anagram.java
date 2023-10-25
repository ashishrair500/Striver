class Solution {
    public boolean isAnagram(String s, String t) {
        
        char ch1 []=s.toCharArray();
        char ch2 []=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

       
        
        return Arrays.equals(ch1,ch2);
 

        
        /*
         if(s.length()!=t.length()) return false;
        
        HashMap<Character,Integer>hm = new HashMap<>();
        HashMap<Character,Integer>hm2 = new HashMap<>();

        for(int i=0; i<s.length(); i++ ){
            
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else{ hm.put(s.charAt(i),1);
                }
        }
        
        for(int i=0; i<t.length(); i++ ){
            if(hm2.containsKey(t.charAt(i))){
                hm2.put(t.charAt(i),hm2.get(t.charAt(i))+1);
            }
            else {
                hm2.put(t.charAt(i),1);
            }
            
        }
        
        for(char k:hm.keySet()){
            if(!hm.get(k).equals(hm2.get(k))) return false;
            
        }
        return true;*/
    
    }
}
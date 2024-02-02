class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer>hm= new HashMap<>();
        
        StringBuilder sb = new StringBuilder();
       ArrayList<Character>[] arr = new ArrayList[s.length()+1];
        
        for (int i = 0; i <=s.length(); i++) { 
            arr[i] = new ArrayList<Character>(); 
        }
        
        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
            
        }
        
        for(Map.Entry<Character,Integer>e:hm.entrySet()){
            arr[e.getValue()].add(e.getKey());
        }
        
         for (int i =arr.length-1; i>=0; i--){
             if(arr[i]!=null){
                 for(char c :arr[i]){
                     for(int j=0; j<i; j++){
                         sb.append(c);
                     }
                 }
                
             }
         }
        return sb.toString();
    }
}
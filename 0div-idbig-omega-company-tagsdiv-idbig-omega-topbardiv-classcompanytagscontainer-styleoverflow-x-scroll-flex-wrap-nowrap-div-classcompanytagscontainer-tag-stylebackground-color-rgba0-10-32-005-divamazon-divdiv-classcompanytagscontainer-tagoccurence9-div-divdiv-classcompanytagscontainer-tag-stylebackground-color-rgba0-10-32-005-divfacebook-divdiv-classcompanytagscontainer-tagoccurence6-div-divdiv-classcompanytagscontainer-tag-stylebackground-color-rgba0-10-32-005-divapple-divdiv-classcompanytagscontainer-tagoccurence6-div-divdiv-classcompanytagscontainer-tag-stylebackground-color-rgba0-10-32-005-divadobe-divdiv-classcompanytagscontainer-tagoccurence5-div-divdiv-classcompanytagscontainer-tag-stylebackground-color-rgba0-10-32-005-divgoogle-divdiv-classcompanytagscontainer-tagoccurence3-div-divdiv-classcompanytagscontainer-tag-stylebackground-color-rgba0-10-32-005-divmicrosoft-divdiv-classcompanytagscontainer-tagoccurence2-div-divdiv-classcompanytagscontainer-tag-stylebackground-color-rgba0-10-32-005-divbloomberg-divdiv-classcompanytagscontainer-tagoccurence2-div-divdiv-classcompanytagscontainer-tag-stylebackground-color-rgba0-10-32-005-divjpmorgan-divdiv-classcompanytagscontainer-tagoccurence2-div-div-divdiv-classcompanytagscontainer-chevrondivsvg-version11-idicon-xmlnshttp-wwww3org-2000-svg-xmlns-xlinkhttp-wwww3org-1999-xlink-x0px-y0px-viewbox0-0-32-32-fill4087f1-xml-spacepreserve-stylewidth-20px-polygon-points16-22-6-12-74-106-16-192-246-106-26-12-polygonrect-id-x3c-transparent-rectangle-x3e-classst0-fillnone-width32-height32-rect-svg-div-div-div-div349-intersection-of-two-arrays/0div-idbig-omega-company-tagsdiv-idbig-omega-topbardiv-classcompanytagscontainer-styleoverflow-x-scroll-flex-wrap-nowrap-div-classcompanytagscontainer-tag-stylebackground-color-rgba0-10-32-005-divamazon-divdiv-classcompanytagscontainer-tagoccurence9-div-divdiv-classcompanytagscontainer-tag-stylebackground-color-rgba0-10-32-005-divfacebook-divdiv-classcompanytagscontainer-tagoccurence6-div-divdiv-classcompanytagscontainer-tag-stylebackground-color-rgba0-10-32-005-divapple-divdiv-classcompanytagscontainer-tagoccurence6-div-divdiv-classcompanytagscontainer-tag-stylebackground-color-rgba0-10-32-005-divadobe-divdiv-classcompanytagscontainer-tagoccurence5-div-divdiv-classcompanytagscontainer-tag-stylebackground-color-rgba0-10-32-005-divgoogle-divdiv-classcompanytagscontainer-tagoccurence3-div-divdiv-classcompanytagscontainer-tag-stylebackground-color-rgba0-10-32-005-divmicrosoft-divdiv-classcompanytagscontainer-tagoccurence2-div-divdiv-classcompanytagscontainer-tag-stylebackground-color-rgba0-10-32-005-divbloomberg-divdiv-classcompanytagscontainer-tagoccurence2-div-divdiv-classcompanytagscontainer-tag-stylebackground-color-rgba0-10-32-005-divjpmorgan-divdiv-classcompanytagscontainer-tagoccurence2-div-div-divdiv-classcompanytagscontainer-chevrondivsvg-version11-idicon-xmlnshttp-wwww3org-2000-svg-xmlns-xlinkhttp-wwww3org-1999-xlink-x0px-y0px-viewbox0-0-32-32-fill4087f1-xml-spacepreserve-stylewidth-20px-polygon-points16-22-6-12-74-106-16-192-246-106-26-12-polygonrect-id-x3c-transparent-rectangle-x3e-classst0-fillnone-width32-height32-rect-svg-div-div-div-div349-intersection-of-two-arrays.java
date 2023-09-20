class Solution {
    public int[] intersection(int[] a, int[] b) {
        
        
         int n=a.length;
         int m=b.length;
        //Striver brute force approach
        
        ArrayList<Integer> as= new ArrayList<>();
        
        int visit[]= new int [m];
        Arrays.fill(visit,0);
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<m; j++){
                if(a[i]==b[j] && visit[j]==0){
                    if(!as.contains(b[j]))
                    as.add(b[j]);
                    visit[j]=1;
                    break;
                }
          //      if(b[j]>a[j]) break;
                
                
            }
            
        }
        
        int ans[]=new int[as.size()];
        
        for(int i=0; i<as.size();  i++){
            ans[i]=as.get(i);
            
        }
        
        return ans;
        
    
    }
}
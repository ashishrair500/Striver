class Solution {
    public int[] intersection(int[] a, int[] b) {
        
        
         int n=a.length;
         int m=b.length;
        ArrayList<Integer> as= new ArrayList<>();

        //Striver brute force approach
        /*
        
     //   int visit[]= new int [m];
       // Arrays.fill(visit,0);
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<m; j++){
                if(a[i]==b[j]){
                    if(!as.contains(b[j]))
                    as.add(b[j]);
                   // visit[j]=1;
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
        */
        
        //optimal solution ut arrays should be sorted
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i=0;
        int j=0;
        while(i<n && j<m){
            
            if(a[i]<b[j]){
               i++;
                
            }else if(a[i]>b[j]){
                j++;
            }
            else{
           if(!as.contains(a[i])){
             as.add(a[i]);
            }
                i++;
                j++;
            }
        }
        
        int ans[]=new int[as.size()];
        
        for(int k=0; k<as.size();  k++){
            ans[k]=as.get(k);
            
        }
        
        return ans;
        
        
        
    
    }
}
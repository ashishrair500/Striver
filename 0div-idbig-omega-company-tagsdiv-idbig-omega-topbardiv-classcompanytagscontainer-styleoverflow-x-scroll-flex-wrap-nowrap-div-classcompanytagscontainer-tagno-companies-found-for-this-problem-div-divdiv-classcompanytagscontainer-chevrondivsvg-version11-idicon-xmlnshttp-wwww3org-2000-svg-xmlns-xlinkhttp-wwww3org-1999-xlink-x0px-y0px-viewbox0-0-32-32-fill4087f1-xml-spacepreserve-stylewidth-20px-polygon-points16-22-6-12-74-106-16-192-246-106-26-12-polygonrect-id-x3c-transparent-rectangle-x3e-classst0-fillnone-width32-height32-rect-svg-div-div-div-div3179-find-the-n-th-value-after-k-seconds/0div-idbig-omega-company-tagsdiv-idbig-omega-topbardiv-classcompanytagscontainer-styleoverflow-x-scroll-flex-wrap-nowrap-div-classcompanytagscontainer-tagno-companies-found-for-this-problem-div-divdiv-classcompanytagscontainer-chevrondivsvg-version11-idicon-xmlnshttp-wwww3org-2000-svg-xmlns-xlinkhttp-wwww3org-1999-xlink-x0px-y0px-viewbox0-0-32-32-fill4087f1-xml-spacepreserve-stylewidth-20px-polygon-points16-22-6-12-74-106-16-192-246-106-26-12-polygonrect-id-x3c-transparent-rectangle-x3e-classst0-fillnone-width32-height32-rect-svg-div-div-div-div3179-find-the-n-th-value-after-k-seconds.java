class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int temp[]= new int[n];
          for(int i=0; i<n; i++)
               temp[i]=1;
        
        int c=0;
        
while(c<k){
    c++;
    for(int i=1; i<n; i++){
int sum = (int)((temp[i-1] + temp[i]) % (Math.pow(10,9) + 7));    
        temp[i]=sum;
    }
}            
return  temp[n-1];
    }
}
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length;
        
        for(int i=0; i<n/2; i++){
            int temp=happiness[i];
            happiness[i]=happiness[n-i-1];
            happiness[n-i-1]=temp;
        }
        
        int j=0;
        long ans=0;
        for(int i=0; i<n; i++){
             if(k==0){
                break;
            }
            if(happiness[i]-j>0){
                 ans+=happiness[i]-j;
            }
            k--;
            j++;
        }
        return ans;
//          Arrays.sort(happiness);
//         long res = 0;
//         int n = happiness.length, j = 0;

//         for (int i = n - 1; i >= n - k; --i) {
//             happiness[i] = Math.max(happiness[i] - j++, 0);
//             res += happiness[i];
//         }

//         return res;
    }
}
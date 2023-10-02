class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //only optimal approach  O(n^m) time and space O(n^m)
        
        ArrayList<Integer> as= new ArrayList<>();
        if(matrix.length==0) return as;
            int  top=0;
            int bottom=matrix.length-1;
            int right=matrix[0].length-1;
            int left=0;
       while(top<=bottom && left<=right){ 
        for(int i=left; i<=right; i++){
            as.add(matrix[top][i]);
        }
        top++;
          
        
        for(int i=top; i<=bottom; i++){
        as.add(matrix[i][right]);
         }
        right--;
        
        if(top<=bottom){
        for(int i=right; i>=left; i--){            
            as.add(matrix[bottom][i]);
         }
        }
        bottom--;
        
        if(left<=right){
        for(int i=bottom; i>=top; i--){          
            as.add(matrix[i][left]);
        }
        }
        left++;
       }
        
        return as;
    }
}
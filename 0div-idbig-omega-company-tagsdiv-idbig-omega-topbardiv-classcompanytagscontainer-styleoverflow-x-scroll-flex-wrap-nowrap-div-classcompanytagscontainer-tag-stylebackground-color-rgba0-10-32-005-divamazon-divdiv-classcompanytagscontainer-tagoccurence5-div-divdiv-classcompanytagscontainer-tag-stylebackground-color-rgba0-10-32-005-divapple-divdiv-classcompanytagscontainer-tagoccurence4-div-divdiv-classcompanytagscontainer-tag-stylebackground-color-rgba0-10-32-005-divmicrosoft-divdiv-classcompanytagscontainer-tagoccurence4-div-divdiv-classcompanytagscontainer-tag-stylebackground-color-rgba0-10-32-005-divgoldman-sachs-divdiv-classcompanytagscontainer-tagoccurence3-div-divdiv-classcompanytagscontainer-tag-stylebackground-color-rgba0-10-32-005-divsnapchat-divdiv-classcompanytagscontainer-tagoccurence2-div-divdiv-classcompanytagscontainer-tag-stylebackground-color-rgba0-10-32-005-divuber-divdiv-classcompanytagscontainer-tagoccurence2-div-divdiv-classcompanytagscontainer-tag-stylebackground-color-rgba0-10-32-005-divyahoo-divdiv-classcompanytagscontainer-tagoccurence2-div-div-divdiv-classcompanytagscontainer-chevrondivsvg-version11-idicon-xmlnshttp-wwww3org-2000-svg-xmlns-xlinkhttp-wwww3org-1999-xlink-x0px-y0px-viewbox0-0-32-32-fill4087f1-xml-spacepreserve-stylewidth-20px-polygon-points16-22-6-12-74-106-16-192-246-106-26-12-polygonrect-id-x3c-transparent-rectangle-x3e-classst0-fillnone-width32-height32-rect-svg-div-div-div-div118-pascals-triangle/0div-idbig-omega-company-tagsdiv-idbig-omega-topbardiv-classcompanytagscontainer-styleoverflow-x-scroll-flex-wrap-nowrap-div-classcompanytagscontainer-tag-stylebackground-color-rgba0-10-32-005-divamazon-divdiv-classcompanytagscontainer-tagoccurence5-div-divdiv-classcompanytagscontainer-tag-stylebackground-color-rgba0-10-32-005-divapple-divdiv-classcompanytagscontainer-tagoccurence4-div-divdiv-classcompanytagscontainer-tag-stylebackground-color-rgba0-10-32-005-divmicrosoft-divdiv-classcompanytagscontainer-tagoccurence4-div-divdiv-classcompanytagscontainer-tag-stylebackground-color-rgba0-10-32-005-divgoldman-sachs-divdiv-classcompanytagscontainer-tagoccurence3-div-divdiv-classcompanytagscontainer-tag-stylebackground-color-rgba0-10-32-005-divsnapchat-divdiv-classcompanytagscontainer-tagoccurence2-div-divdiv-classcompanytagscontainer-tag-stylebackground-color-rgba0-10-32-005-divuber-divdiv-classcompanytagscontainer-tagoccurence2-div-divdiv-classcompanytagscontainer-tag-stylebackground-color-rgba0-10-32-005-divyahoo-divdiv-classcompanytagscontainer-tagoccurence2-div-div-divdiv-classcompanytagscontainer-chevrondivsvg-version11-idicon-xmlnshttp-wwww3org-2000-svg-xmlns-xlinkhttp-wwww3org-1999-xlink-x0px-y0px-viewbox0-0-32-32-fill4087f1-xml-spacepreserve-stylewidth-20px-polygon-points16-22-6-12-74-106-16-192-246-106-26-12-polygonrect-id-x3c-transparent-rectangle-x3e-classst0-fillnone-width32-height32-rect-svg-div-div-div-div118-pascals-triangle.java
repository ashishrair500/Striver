class Solution {
    
    static List<Integer> generateRow(int row){
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        int ans=1;
        
        for(int col=1; col<row; col++ ){
            ans=ans*(row-col);
            ans=ans/(col);
            arr.add(ans);    
        }
        
        return arr;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=1; i<=numRows; i++){
       
            ans.add(generateRow(i));
    
            
            }
        
        
        return ans;
    }
}
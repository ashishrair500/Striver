class Solution {
    public int majorityElement(int[] nums) {
       // your code here
        //we can solve this proble using two loops in O(n^2) and using hashmap in O(n)
        //but for optimal approch we use moore voting machine
        int element=nums[0];
        int count=0;
        for(int i=0; i<nums.length; i++){
             if(count==0)element=nums[i];
            if(element==nums[i])count++;
            else{count--;}
           
                    }
        
        return element;
        
        //this loop to reverify element
        /*
          count=0;
          for(int i=0; i<nums.length; i++){
              if(nums[i]==element) 
              count++;
              
          }
        return count>size/2?element:-1;
        */
    }
}
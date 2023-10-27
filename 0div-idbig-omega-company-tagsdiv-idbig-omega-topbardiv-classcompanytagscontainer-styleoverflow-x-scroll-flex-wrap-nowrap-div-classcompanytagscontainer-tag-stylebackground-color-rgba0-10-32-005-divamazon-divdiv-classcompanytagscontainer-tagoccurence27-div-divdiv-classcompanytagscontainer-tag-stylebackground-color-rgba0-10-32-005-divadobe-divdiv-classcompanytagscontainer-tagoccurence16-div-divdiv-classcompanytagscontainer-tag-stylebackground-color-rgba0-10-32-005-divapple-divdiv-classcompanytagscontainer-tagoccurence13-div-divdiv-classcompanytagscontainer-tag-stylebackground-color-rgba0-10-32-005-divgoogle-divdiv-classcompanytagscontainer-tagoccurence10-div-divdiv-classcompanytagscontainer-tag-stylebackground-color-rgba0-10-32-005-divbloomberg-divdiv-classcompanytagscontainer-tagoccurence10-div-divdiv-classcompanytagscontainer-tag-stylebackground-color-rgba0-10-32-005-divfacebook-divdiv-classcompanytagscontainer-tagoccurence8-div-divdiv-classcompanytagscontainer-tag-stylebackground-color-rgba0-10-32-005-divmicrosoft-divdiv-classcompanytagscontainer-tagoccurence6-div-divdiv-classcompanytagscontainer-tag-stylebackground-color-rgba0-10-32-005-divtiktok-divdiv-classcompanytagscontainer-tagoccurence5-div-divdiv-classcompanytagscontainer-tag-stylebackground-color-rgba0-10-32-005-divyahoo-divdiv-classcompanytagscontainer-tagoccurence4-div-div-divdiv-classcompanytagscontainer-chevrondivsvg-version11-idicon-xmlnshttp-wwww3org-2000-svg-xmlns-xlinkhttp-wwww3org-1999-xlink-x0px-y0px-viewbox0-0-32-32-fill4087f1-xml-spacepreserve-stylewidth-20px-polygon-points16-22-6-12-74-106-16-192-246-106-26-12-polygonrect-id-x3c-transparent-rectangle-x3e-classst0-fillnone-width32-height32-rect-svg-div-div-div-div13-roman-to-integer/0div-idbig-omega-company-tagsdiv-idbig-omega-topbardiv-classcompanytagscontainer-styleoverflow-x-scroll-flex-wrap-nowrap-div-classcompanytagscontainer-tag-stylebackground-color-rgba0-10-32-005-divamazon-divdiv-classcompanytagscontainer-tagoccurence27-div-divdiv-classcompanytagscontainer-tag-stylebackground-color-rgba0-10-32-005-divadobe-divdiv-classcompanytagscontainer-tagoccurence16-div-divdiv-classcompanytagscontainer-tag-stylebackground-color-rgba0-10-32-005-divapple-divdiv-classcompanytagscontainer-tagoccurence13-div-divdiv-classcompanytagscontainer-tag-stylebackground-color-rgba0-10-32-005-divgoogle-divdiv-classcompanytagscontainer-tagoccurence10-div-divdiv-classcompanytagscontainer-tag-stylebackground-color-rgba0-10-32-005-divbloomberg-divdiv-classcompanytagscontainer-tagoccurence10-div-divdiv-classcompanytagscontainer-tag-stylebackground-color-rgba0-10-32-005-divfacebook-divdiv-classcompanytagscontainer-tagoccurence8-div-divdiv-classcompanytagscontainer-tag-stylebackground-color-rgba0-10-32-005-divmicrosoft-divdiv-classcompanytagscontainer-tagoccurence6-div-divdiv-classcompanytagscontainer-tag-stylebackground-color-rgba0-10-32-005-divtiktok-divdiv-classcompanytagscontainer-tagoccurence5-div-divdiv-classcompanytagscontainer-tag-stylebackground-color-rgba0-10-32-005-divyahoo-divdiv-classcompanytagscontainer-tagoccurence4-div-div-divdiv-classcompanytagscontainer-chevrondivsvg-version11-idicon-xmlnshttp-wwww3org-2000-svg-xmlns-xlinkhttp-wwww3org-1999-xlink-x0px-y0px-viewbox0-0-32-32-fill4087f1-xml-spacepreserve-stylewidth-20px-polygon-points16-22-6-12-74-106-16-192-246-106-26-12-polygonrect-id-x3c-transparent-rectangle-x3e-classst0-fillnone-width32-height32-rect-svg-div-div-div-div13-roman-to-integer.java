class Solution {
    public static int get(char ch){
    switch(ch){
        case 'I':return 1;
        case 'V':return 5;
        case 'X':return 10;
        case 'L':return 50;
        case 'C':return 100;
        case 'D':return 500;
        case 'M':return 1000;
        default: return 0;
    }
    }
    
    public int romanToInt(String s) {
        int n= s.length();
        int sum=0; 
        for(int i=0; i<n; i++){
            
            if((i+1)<n && get(s.charAt(i))<get(s.charAt(i+1))){
                sum=sum-get(s.charAt(i));
                
            }else
                sum+=get(s.charAt(i));
            
        }
        
        return sum;
    }
}
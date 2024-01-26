class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr= new int[nums1.length];
        int ans=-1;
        boolean flag=false;
        int k=0;
        for(int i=0; i<nums1.length; i++){
            int element=nums1[i];
            flag=false;
            int max=nums1[i];
            for(int j=0; j<nums2.length; j++){
                if(nums2[j]==element|| flag==true){
                    if(nums2[j]>max){
                        max=nums2[j];
                        break;
                    }
                    flag=true;
                }
               
            } if(max==nums1[i]) arr[k++]=-1;
                else arr[k++]=max;
        }
        return arr;
    }
}
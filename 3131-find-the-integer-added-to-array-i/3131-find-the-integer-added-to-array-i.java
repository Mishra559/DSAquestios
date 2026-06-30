class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {

       int min1 = Integer.MAX_VALUE;
       int min2 = Integer.MAX_VALUE;

       for(int x:nums1){
        if(min1>x){
            min1 = x;
        }
       }
       for(int x:nums2){
        if(min2>x){
            min2 = x;
        }
       }

       return min2-min1;
        
    }
}
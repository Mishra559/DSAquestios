class Solution {
    public int findNonMinOrMax(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int x:nums){
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
        }

        for(int x:nums){
            if(x>min && x<max){
                return x;
            }
        }

        return -1;
        
    }
}
class Solution {
    public int minAbsoluteDifference(int[] nums) {

        int min  = Integer.MAX_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1 || nums[i] == 2){
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j] == 2 && nums[i] == 1){
                        int diff = Math.abs(i-j);
                        min = Math.min(min,diff);
                    }
                    if(nums[j] == 1 && nums[i] == 2){
                        int diff = Math.abs(i-j);
                        min = Math.min(min,diff);
                    }
                }
            }
        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }

        return min;
        
    }
}
class Solution {
    public int findMaxK(int[] nums) {

        int result = -1;

        for(int i = 0;i<nums.length;i++){

            for(int j = 0;j<nums.length;j++){
                if(nums[i] + nums[j] == 0){
                    if(nums[i] > result){
                        result = nums[i];
                    }
                }
            }
        }

        return result;
        
    }
}
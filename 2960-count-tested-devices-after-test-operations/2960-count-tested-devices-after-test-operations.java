class Solution {
    public int countTestedDevices(int[] nums) {

        int count = 0;


        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i] > 0){
        //         count++;
        //         for(int j = i+1;j<nums.length;j++){
        //             nums[j] = nums[j] - 1;
        //         }
        //     }
        // }


        for(int x:nums){
            if(x-count >0){
                count++;
            }
        }
        return count;
        
    }
}
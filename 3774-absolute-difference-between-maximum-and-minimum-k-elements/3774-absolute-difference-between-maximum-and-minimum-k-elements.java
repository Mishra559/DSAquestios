class Solution {
    public int absDifference(int[] nums, int k) {

        Arrays.sort(nums);


        int left  = 0;
        int right = 0;


        for(int i = 0;i<k;i++){
            left += nums[i];
        }
        
        for(int i = nums.length - 1;i>= nums.length - k;i--){
            right += nums[i];
        }


        return Math.abs(left-right);
    }
}
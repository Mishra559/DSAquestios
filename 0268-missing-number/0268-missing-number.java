class Solution {
    public int missingNumber(int[] nums) {

        // int n = nums.length;

        // int sum = n*(n+1)/2;

        // int x = 0;

        // for(int y:nums){
        //     x += y;
        // }
        // return sum - x;


        int ans = nums.length;

        for(int i = 0;i<nums.length;i++){
            ans ^= i;
            ans ^= nums[i];
        }

        return ans;
    }
}
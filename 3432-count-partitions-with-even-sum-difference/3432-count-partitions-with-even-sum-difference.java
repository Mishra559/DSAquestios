class Solution {
    public int countPartitions(int[] nums) {
        int result = 0;

        int sum = 0;

        for(int i = 1;i<nums.length;i++){
            sum += nums[i];
        }

        int rightSum = nums[0];

        for(int i = 1;i<nums.length;i++){
            // int x = rightSum - sum;
            // if(x%2 == 0){
            //     result++;
            // }


            if((rightSum % 2) == (sum % 2)){
                result++;
            }
            rightSum += nums[i];
            sum -= nums[i];
        }

        return result;
    }
}
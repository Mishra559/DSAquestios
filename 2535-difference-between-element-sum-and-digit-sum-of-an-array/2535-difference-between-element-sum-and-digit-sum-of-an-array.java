class Solution {
    public int differenceOfSum(int[] nums) {


        int digitSum = 0;
        int elementSum = 0;

        for(int i = 0;i<nums.length;i++){
            digitSum += nums[i];

            if(nums[i] > 9){
                elementSum += elementSum(nums[i]);
            }
            else{
                elementSum += nums[i];
            }


        }

        return Math.abs(digitSum-elementSum);
        
    }

    private static int elementSum(int x){
        int sum = 0;

        while(x>0){
            int d = x%10;
            sum += d;
            x /=10;
        }

        return sum;
    }
}
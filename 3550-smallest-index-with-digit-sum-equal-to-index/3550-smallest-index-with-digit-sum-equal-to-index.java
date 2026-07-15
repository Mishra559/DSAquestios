class Solution {
    public int smallestIndex(int[] nums) {

        

        for(int i = 0;i<nums.length;i++){
            if(digitSum(nums[i]) == i){
                return i;
            }
        }

        return -1;

        
    }

    private static int digitSum(int n){
        if(n<=9){
            return n;
        }

        int sum = 0;
        while(n>0){
            int d = n%10;
            sum += d;
            n = n/10;
        }
        return sum;
    }
}
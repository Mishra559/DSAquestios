class Solution {
    public int maximizeSum(int[] nums, int k) {

        int max = Integer.MIN_VALUE;

        for(int x:nums){
            if(x>max){
                max = x;
            }
        }

        int sum = 0;

        for(int i = 0;i<k;i++){
            sum += max;
            max++;
        }
        return sum;
    }
}
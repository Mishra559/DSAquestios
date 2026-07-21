class Solution {
    public int maximizeSum(int[] nums, int k) {

        int max = Integer.MIN_VALUE;

        for(int x:nums){
            if(x>max){
                max = x;
            }
        }

        return k * (2 * max + k - 1) / 2;
    }
}
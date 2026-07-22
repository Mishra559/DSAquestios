class Solution {
    public int missingMultiple(int[] nums, int k) {

        Arrays.sort(nums);

        int result = k;

        for(int x:nums){

            if(x == result){
                result+=k;
            }
        }
        return result;
        
    }
}
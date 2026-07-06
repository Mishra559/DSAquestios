class Solution {
    public int evenNumberBitwiseORs(int[] nums) {

        int result = 0;

        for(int x:nums){
            if(x%2==0){
                result = result | x;
            }
        }

        return result;
        
    }
}
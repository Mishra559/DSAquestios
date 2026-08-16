class Solution {
    public int[] sortArrayByParity(int[] nums) {

        // extra space

        // int[] result = new int[nums.length];

        // int i = 0;
        // int j = nums.length - 1;

        // for (int k = 0; k < nums.length; k++) {
        //     if(nums[k] % 2 == 0){
        //         result[i++] = nums[k];
        //     }
        //     else{
        //         result[j--] = nums[k];
        //     }
        // }

        // return result;

        // no extra space

        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j] % 2 == 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        return nums;
    }
}
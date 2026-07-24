class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

        // int[] arr = new int[101];

        // for(int x:nums){
        //     arr[x]++;
        // }

        // int mid = nums.length/2;

        // return arr[nums[mid]] == 1;


        int mid = nums[nums.length/2];

        int count = 0;

        for(int x:nums){
            if(x == mid){
                count++;
                if(count>1){
                    return false;
                }
            }
        }
        return true;

        
    }
}
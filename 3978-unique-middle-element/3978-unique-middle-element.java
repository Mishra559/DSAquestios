class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

        int[] arr = new int[101];

        for(int x:nums){
            arr[x]++;
        }

        int mid = nums.length/2;

        return arr[nums[mid]] == 1;
        
    }
}
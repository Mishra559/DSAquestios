class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        for(int i = 0;i<k;i++){
            int minIndex = minValue(nums);
            int min = nums[minIndex];
            nums[minIndex] = min * multiplier;

        }

        return nums;
        
    }

    public static int minValue(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int x:arr){
            if(x<min){
                min = x;
            }
        }
        int result = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == min){
                result = i;
                break;
            }
        }

        return result;
        
    }
}
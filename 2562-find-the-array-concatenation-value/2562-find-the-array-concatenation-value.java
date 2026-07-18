class Solution {
    public long findTheArrayConcVal(int[] nums) {

        long result = 0;

        int i = 0;
        int j = nums.length - 1;

        while(i<j){

            result += concate(nums[i],nums[j]);
            i++;
            j--;
        }

        if(nums.length % 2 != 0){
            result += nums[nums.length/2];
        }

        return result;
        
    }

    private static int concate(int x,int y){

        StringBuilder sb = new StringBuilder();

        sb.append(Integer.toString(x));
        sb.append(Integer.toString(y));

        return Integer.parseInt(sb.toString());

    }
}
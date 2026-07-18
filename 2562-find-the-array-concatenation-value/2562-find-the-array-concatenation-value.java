class Solution {
    public long findTheArrayConcVal(int[] nums) {

        long result = 0;

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            result += concate(nums[i], nums[j]);
            i++;
            j--;
        }

        if (nums.length % 2 != 0) {
            result += nums[nums.length / 2];
        }

        return result;

    }

    private static int concate(int x, int y) {

        int temp = y;
        int power = 1;

        while (temp > 0) {
            power *= 10;
            temp /= 10;
        }

        return x * power + y;

    }
}
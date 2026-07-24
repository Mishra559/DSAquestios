class Solution {
    public double trimMean(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;

        int x = (n * 5)/100;

        int sum = 0;

        for(int i = x;i<n-x;i++){
            sum += arr[i];
        }
        double result = (double)sum/(n-2*x);

        return result;
    }
}
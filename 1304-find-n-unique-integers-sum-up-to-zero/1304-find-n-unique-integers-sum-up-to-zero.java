class Solution {
    public int[] sumZero(int n) {
        
        int[] arr = new int[n];

        int k = 1;

        int i = 0;
        int j = n - 1;

        while(i<j){
            arr[i++] = k;
            arr[j--] = -1 * k;
            k++;
        }

        if(n%2 != 0){
            arr[n/2] = 0;
        }
        return arr;
    }
}
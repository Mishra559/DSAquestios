class Solution {
    public int pivotInteger(int n) {

        if(n == 1){
            return 1;
        }

        int totalSum = n*(n+1)/2;

        int sum = 0;
        int result  = -1;

        for(int i = 1;i<n;i++){
            sum += i;
            int rem = totalSum - sum + i;
            if(sum == rem){
                result = i;
                break;
            }
        }

        return result;
        
    }
}
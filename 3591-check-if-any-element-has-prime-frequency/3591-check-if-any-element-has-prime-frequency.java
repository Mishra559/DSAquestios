class Solution {
    public boolean checkPrimeFrequency(int[] nums) {

        int[] freq = new int[101];

        for(int x:nums){
            freq[x]++;
        }

        for(int x:freq){
            if(isPrime(x)){
                return true;
            }
        }

        return false;
        
    }

    private static boolean isPrime(int x){
        if(x<2){
            return false;
        }
        if(x == 2){
            return true;
        }
        if(x%2 == 0){
            return false;
        }

        for(int i = 3;i*i<=x;i+=2){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
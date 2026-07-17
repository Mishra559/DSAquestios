class Solution {
    public int countPrimeSetBits(int left, int right) {

        int count = 0;

        for(int i = left;i<=right;i++){

            int n = i;

            int setBits = 0;

            while(n>0){
                setBits += (n&1);
                n>>=1;
            }

            if(isPrime(setBits)){
                count++;
            }  

        }

        return count;
        
    }

    private static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n%2 == 0){
            return false;
        }
        
        for(int i = 3;i*i <= n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
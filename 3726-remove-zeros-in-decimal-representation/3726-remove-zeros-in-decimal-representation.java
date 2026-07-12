class Solution {
    public long removeZeros(long n) {

        long result = 0;

        while(n>0){
            long d = n%10;
            if (d != 0) {
            result = result * 10 + d;
        }

        n /= 10;
        }

        while(result>0){
            long d = result%10;

           n = n * 10 + d;
            result = result/10;
        }
        return n;
        
    }
}
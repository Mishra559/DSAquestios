class Solution {
    public long sumAndMultiply(int n) {

        long sum = 0;
        int result = 0;

       

        while(n>0){
            int d = n%10;
            if(d == 0){
                n = n/10;
                continue;
            }

            sum += d;
            result = result*10+d;
            n = n/10;
        }

        int x = 0;

        while(result>0){
            int d = result %10;
            x = x*10 + d;
            result /= 10;
        }

        long y = sum*x;


       return y;
        
    }
}
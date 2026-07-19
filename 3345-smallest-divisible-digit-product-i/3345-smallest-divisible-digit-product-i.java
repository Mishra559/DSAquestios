class Solution {
    public int smallestNumber(int n, int t) {

        int num = 0;

        for(int i = n;i<=200;i++){
            int x = digitProduct(i);

            if(x%t == 0){
                return i;
            }
        }

        return -1;
        
    }

    private static int digitProduct(int x){
        if(x<10){
            return x;
        }

        int product = 1;

        while(x>0){
            int d = x%10;
            if(d == 0){
                return 0;
            }
            product *= d;
            x = x/10;
        }
        return product;
    }
}
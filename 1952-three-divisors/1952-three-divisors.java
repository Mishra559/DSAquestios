class Solution {
    public boolean isThree(int n) {

    //     if(n<=3){
    //         return false;
    //     }

    //     int count  = 2;

    //     for(int i = 2; i <= n/2 ;i++){
    //         if(n%i == 0){
    //             count++;
    //         }
    //     }

    //    if(count == 3){
    //     return true;
    //    }

    //    return false;

    int x = (int)Math.sqrt(n);

    if(x*x != n){
        return false;
    }

    return isPrime(x);
     
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
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }

    
}
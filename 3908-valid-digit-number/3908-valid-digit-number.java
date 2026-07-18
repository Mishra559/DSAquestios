class Solution {
    public boolean validDigit(int n, int x) {

        // String str = String.valueOf(n);
        // String y = String.valueOf(x);

        // if(str.startsWith(y)){
        //     return false;
        // }

        // if(str.contains(y)){
        //     return true;
        // }
        // return false;

        boolean hasX = false;
        

        while(n>=10){
            if(n%10 == x){
                hasX = true;
            }
            n = n/10;
        }

        
        return hasX && n != x;
        
    }
}
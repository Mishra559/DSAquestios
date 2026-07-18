class Solution {
    public boolean validDigit(int n, int x) {

        String str = String.valueOf(n);
        String y = String.valueOf(x);

        if(str.startsWith(y)){
            return false;
        }

        if(str.contains(y)){
            return true;
        }
        return false;
        
    }
}
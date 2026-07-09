class Solution {
    public boolean isStrictlyPalindromic(int n) {

        boolean flag = true;

        for(int i = 2;i<= n-2;i++){
            String base = Integer.toString(n,i);
            StringBuffer sb = new StringBuffer(base);
            if(!base.equals(sb.reverse().toString())){
                return false;
            }
        }

        return true;
        
    }
}
class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        for(int i = 0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            char ch1 = s.charAt(i+1);

            int x = ch - '0';
            int y = ch1 - '0';

            if(Math.abs(x-y)>2){
                return false;
            }
        }

        return true;
        
    }
}
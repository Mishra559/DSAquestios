class Solution {
    public int sumBase(int n, int k) {

        String str = Integer.toString(n, k);
        int sum = 0;

        for(char ch:str.toCharArray()){
            int x = ch - '0';
            sum += x;
        }

        return sum;
        
    }
}
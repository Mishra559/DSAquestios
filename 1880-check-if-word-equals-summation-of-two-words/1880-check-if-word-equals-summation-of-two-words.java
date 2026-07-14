class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for(char ch:firstWord.toCharArray()){
            int x = ch - 'a';
            sum1 = sum1*10 + x;
        }

        for(char ch:secondWord.toCharArray()){
            int x = ch - 'a';
            sum2 = sum2*10 + x;
        }

        for(char ch:targetWord.toCharArray()){
            int x = ch - 'a';
            sum3 = sum3*10 + x;
        }

        return sum1+sum2 == sum3;
        
    }
}
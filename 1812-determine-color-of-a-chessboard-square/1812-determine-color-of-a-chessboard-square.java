class Solution {
    public boolean squareIsWhite(String s) {

        char ch1 = s.charAt(0);
        char ch2 = s.charAt(1);

        int x = ch1 - 'a';
        int y = ch2 - '0';

        return (x+y)%2==0;


        
    }
}
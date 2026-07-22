class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int x = target - 'a';

        for(char ch:letters){

            if(ch - 'a' > x){
                return ch;
            }
        }
        return letters[0];
    }
}
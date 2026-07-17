class Solution {
    public boolean checkTwoChessboards(String s1, String s2) {
        
        int x1 = s1.charAt(0) - 'a';
        int y1 = s1.charAt(1) - '0';

        int x2 = s2.charAt(0) - 'a';
        int y2 = s2.charAt(1) - '0';


        // if((x1+y1) % 2 == 0 && (x2+y2) % 2 == 0){
        //     return true;
        // }

        // if((x1+y1) % 2 != 0 && (x2+y2) % 2 != 0){
        //     return true;
        // }

        // return false;

        return (x1 + y1) % 2 == (x2 + y2) % 2;


    }
}
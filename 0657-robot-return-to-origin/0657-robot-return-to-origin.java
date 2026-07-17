class Solution {
    public boolean judgeCircle(String moves) {

        if(moves.length() %2 != 0){
            return false;
        }

        int x = 0;
        int y = 0;


        for(char ch : moves.toCharArray()){
            if(ch == 'U')x++;
            else if(ch == 'L')y++;
            else if(ch == 'R')y--;
            else x--; 
        }


        return x == 0 && y == 0;

        
    }
}
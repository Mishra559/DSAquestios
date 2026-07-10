class Solution {
    public int countAsterisks(String s) {

        int result = 0;

        boolean inside = false;

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            // if(ch == '|'){
            //     i++;
            //     char ch2 = s.charAt(i);
            //     while(ch2 != '|'){
            //         i++;
            //         ch2 = s.charAt(i);
            //     }
            // }

            // else if(ch == '*'){
            //     result++;
            // }

            if(ch == '|'){
                inside = !inside;
            }

            else if(ch == '*' && !inside){
                result++;
            }

        }

        return result;
        
    }
}
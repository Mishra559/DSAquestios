class Solution {
    public String largestGoodInteger(String s) {

        int count = 0;

        int x = -1;

        for(int i = 0;i<s.length()-1;i++){

            char ch = s.charAt(i);

            if(ch == s.charAt(i+1)){

                count = 1;

                while(i + 1 < s.length() && ch == s.charAt(i+1)){
                    count++;
                    i++;
            
                }

                if(count>=3 && (ch - '0')  > x){
                    x = ch - '0';
                }
                count = 0;
            }
        }

        if(x == -1){
            return "";
        }

        char ch = (char)('0' + x);

        StringBuilder sb = new StringBuilder();

        sb.append(ch);
        sb.append(ch);
        sb.append(ch);

        return sb.toString();
        
    }
}
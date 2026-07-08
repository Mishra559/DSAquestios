class Solution {
    public String replaceDigits(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            sb.append(ch);

            if(i+1<s.length()){
                int digit = s.charAt(i + 1) - '0';
            char ch1 = (char) (ch + digit);
            sb.append(ch1);
            i++;
            }
        }

        return sb.toString();
        
    }
}
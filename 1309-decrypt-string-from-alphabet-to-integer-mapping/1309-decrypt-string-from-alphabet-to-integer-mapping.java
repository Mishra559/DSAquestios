class Solution {
    public String freqAlphabets(String s) {


        StringBuilder sb = new StringBuilder();

        int i = 0;

        while(i<s.length()){

                if(i+2<s.length() && s.charAt(i+2) == '#'){
                    int x = Integer.parseInt(s.substring(i,i+2));
                    char ch = (char) (x + 'a'-1);
                    sb.append(ch);
                    i += 3;
                }
                else{
                    int y = s.charAt(i) - '0';
                    char ch = (char) (y + 'a'-1);
                    sb.append(ch);
                    i++;                    
                }
        }

        return sb.toString();

        
        
    }
}
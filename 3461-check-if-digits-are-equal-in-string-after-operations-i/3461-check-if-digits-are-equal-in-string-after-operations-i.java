class Solution {
    public boolean hasSameDigits(String s) {

        while(s.length()>2){
            s = stringMethod(s);
        }

        if(s.charAt(0) == s.charAt(1)){
            return true;
        }

        return false;       
        
    }

    public static String stringMethod(String s){
        StringBuilder result = new StringBuilder();

        for(int i = 1;i<s.length();i++){
            int x = s.charAt(i) - '0';
            int y = s.charAt(i-1) - '0';         
            result.append((x + y) % 10);
        }
        return result.toString();
    }
}
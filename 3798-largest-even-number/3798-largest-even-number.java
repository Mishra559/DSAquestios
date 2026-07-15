class Solution {
    public String largestEven(String s) {

        int x = -1;
    
        for(int i = s.length()-1;i>=0;i--){
            char ch = s.charAt(i);

            if(ch == '0'||ch == '2' || ch == '4' || ch == '6' || ch == '8'){
                x = i;
                break;
            }
        }

        
        return x == -1 ? "" : s.substring(0,x+1);
        
    }
}
class Solution {
    public int reverseDegree(String s) {

        int result = 0;

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            int x = 'z' - ch + 1;

            result += ((i+1)*x);

        }

        return result;
        
    }
}
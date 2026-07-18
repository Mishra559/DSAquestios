class Solution {
    public int countSubstrings(String s) {

        int count = 0;

        for(int i = 0;i<s.length();i++){

            for(int j = i;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1))){
                    count++;
                }
            }
        }

        return count;
        
    }

    private static boolean isPalindrome(String str){

        if(str.length() == 1){
            return true;
        }
        int i = 0;
        int j = str.length() - 1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
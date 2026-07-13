class Solution {
    public int firstMatchingIndex(String s) {

        int result = -1;

        int i = 0;
        int j = s.length()-1;

        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                result = i;
                break;
            }
            i++;
            j--;
        }

        return result;
        
    }
}
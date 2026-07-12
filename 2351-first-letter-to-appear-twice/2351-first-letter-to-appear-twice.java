class Solution {
    public char repeatedCharacter(String s) {

        int[] arr = new int[26];
        char result = 'a';

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            int x = ch - 'a';
            arr[x]++;
            if(arr[x] == 2){
                result = ch;
                break;
            }
        }

        return result;

    
        
    }
}
class Solution {
    public char findTheDifference(String s, String t) {

        int[] arr = new int[26];

        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }

        for(char ch : t.toCharArray()){
            int x = ch - 'a';

            arr[x]--;

            if(arr[x] == -1){
                return ch;
            }
        }

        return ' ';
        
    }
}
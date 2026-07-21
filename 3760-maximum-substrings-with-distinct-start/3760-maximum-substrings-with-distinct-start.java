class Solution {
    public int maxDistinct(String s) {

        int[] freq = new int[26];

        int count = 0;

        for(char ch:s.toCharArray()){

            if(freq[ch - 'a'] == 0){
                count++;
            }

            freq[ch - 'a']++;

        }

        return count;
        
    }
}
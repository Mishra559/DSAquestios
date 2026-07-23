class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];


        for(char ch:word1.toCharArray()){
            freq1[ch-'a']++;
        }

        for(char ch:word2.toCharArray()){
            freq2[ch-'a']++;
        }

        for(int i = 0;i<freq1.length;i++){

            if(freq1[i] == 0 && freq2[i] == 0){
                continue;
            }

            if(Math.abs(freq1[i] - freq2[i]) > 3){
                return false;
            }
        }

        return true;
        
    }
}
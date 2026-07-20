class Solution {
    public int countPrefixSuffixPairs(String[] words) {

        int count = 0;

        for(int i = 0;i<words.length-1;i++){

            String str = words[i];

            for(int j = i+1;j<words.length;j++){
                if(str.length()>words[j].length()){
                    continue;
                }
                else if(words[j].startsWith(str) && words[j].endsWith(str)){
                    count++;
                }
            }
        }
        
        return count;
        
    }
}
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {

        int count = 0;

        for(int i = 0;i<words.length;i++){
            String str1 = words[i];
            for(int j = i+1;j<words.length;j++){
                String str2 = words[j];
                if(i != j){
                    if(str1.charAt(0) == str2.charAt(1) && str1.charAt(1) == str2.charAt(0))
                    count++;
                }
            }
        }

        return count;
        
    }

}
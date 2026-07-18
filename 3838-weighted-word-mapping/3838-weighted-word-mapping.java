class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder sb = new StringBuilder();

        for(String str:words){

            int sum = 0;
            for(char ch:str.toCharArray()){
                int x = ch - 'a';
                sum += weights[x];
            }

            sum = sum%26;

            char ch = (char) ('z'- sum);
            sb.append(ch);
        }

        return sb.toString();


        
    }
}
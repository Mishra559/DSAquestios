class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int result = 0;

        char[] arr = jewels.toCharArray();

        for(int i = 0;i<stones.length();i++){
            char ch = stones.charAt(i);

            for(char c:arr){
                if(ch == c){
                    result++;
                }
            }
        }

        return result;


        
    }
}
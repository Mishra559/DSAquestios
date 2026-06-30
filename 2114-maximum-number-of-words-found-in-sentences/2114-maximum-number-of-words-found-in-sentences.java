class Solution {
    public int mostWordsFound(String[] sentences) {

        
        int max = Integer.MIN_VALUE;

        for(String str:sentences){
            int count = 0;
            int l = str.length();
            str = str.replace(" ","");
            int r = str.length();
            count = l-r+1;
            if(count>max){
                max = count;
            }
        }

        return max;
        
    }
}
class Solution {
    public int maxPower(String s) {

        int maxCount = 1;

        int i = 0;

        while(i<s.length()-1){

            if(s.charAt(i) == s.charAt(i+1)){

                int count = 1;

                while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                    count++;
                    i++;
                }

                if(count > maxCount){
                    maxCount = count;
                }
            }
            i++;


        }

        return maxCount;
        
    }
}
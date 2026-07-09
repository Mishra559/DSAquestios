class Solution {
    public int largestAltitude(int[] gain) {

        int result = 0;
        int max = 0;

        for(int x:gain){
            int netGain = result + x;
            if(netGain>max){
                max = netGain;
            }
            result = netGain;
        }

        return max;
        
    }
}
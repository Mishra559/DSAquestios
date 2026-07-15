class Solution {
    public int getLeastFrequentDigit(int n) {

        int minFreq = Integer.MAX_VALUE;
        int min = 0;

        int[] freq= new int[11];

        while(n>0){
            int d = n%10;

            freq[d]++;

            n = n/10;

        }

        for(int i = 0;i<freq.length;i++){
            if(freq[i]>0 && freq[i] < minFreq){
                minFreq = freq[i];
                min = i;
            }
        }

        return min;
        
    }
}
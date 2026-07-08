class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = n*n;
        int oddSum = n*(n+1);

        

        while(oddSum != 0){
            int temp = oddSum;
            oddSum = evenSum % oddSum;
            evenSum = temp;
        }
        return evenSum;
        
    }
}
class Solution {
    public boolean isSameAfterReversals(int num) {

        long reverse1 = reverseDigit(num);
        long reverse2 = reverseDigit(reverse1);

        return num == reverse2;

        
        
    }


    private static long reverseDigit(long num){
        long reverse = 0;

        while(num > 0){
            long d = num%10;
            reverse = reverse*10 + d;
            num = num/10;
        }
        return reverse;
    }
}
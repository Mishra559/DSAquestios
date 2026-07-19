class Solution {
    public int addDigits(int num) {

        if(num == 0){
            return 0;
        }

        int sum = 0;

        while(num > 0){
            int d = num%10;
            sum += d;
            num = num/10;

            if(num == 0 && sum >9){
                num = sum;
                sum = 0;
            }
        }

        return sum;
        
    }
}
class Solution {
    public int alternateDigitSum(int n) {

        int sum = 0;
        boolean isEven = true;
        String str = Integer.toString(n);

        if(str.length()%2==0){
            isEven = false;
        }

        else{
            isEven = true;
        }

        while(n>0){
            int d = n%10;

            if(isEven){
                sum += d;
            }
            else{
                sum -=d;
            }

            isEven = !isEven;

            n = n/10;
        }

        return sum;
        
    }
}
class Solution {
    public int sumOfEncryptedInt(int[] nums) {

        int sum = 0;
        for(int x:nums){
            sum += encrypt(x);
        }

        return sum;
        
    }

    private static int encrypt(int x){
        int largest = 0;
        int count = 0;

        while(x>0){
            int d = x%10;
            if(d>largest){
                largest = d;
            }
            count++;
            x = x/10;
        }

        int result = 0;

        

        for(int i = 0;i<count;i++){
            result = result*10 + largest;
        }

        return result;


    }
}
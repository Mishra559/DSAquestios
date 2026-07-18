class Solution {
    public int countEven(int num) {

        int count = 0;

        for(int i = 2;i<=num;i++){
            if(evenSum(i)){
                count++;
            }
        }

        return count;
        
    }

    private static boolean evenSum(int x){
        if(x == 2 || x == 4 || x == 6 || x == 8 || x == 11){
            return true;
        }
        
        int sum = 0;

        while(x>0){
            int d = x%10;
            sum += d;
            x = x/10;
        }

        return sum%2 == 0;

    }
}
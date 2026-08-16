class Solution {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);

        if(costs[0] > coins){
            return 0;
        }

        int count = 0;
        int sum = 0;

        for(int x:costs){
            sum = sum + x;
            if(sum > coins){
                break;
            }
            count++;
        }
        return count;
        
    }
}
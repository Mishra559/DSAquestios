class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int appleSum = 0;

        for(int x:apple){
            appleSum += x;
        }

        Arrays.sort(capacity);
        int count = 0;
        int capacitySum = 0;

        for(int i = capacity.length - 1;i>=0;i--){

            capacitySum += capacity[i];
            count++;

            if(capacitySum >= appleSum){
                return count;
            }

        }

        return count;
        
    }
}
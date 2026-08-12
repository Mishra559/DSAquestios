class Solution {
    public int wateringPlants(int[] plants, int capacity) {

        int result = 0;
        int temp = capacity;

        for(int i = 0;i<plants.length;i++){

            if(capacity - plants[i] < 0){
                result += 2*i;
                capacity = temp;
            }
            
                result++;
                capacity = capacity - plants[i];
            
        }
        return result;
        
    }
}
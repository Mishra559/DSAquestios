class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {

        int result = -1;

        


        for(int i = 0;i<capacity.length;i++){
            int x = capacity[i];
            if(x>=itemSize && (result == -1 || capacity[result] > x)){
                result = i;
            }
        }

        return result;
        
    }
}
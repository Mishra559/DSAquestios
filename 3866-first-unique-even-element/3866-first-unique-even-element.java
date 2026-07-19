class Solution {
    public int firstUniqueEven(int[] nums) {

        int[] arr = new int[100];

        for(int x:nums){
            arr[x-1]++;
        }

        for(int x:nums){
            if(x%2 == 0 && arr[x-1] == 1){
                return x;
            }
        }

        return -1;
        
    }
}
class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        // Map<Integer,Integer> map = new HashMap<>();

        // int result = 0;

        // for(int x:nums)map.put(x,map.getOrDefault(x,0)+1);

        // for(int x:map.keySet()){
        //     if(map.get(x) == 2){
        //         result ^= x;
        //     }
        // }

        byte[] arr = new byte[50];

        int result = 0;

        for(int i = 0;i<nums.length;i++){
            byte x = (byte)nums[i];
            arr[x-1]++;
        }

        for(int i = 0;i<50;i++){
            if(arr[i] == 2){
                result ^= (i+1);
            }
        }

        return result;
        
    }
}
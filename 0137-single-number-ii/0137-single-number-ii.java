class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int result = -1;

        for(int x:map.keySet()){
            if(map.get(x) == 1){
                result = x;
                break;
            }
        }

        return result;
        
    }
}
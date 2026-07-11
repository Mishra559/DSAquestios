class Solution {
    public int sumOfUnique(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int x:map.keySet()){
            if(map.get(x) == 1){
                result += x;
            }
        }

        return result;
        
    }
}
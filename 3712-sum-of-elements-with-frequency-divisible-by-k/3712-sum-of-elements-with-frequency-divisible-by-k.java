class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int result = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int x:nums){
            if(map.get(x) % k == 0){
                result += x;
            }
        }

        return result;
        
    }
}
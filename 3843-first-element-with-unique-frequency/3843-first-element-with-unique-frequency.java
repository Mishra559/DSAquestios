class Solution {
    public int firstUniqueFreq(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        Map<Integer,Integer> freq = new HashMap<>();

        for(int x:map.values()){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }

        for(int x:nums){

            if(freq.get(map.get(x)) == 1){
                return x;
            }
        }
        return -1;

        
        
    }
}
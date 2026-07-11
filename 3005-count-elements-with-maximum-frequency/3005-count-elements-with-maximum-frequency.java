class Solution {
    public int maxFrequencyElements(int[] nums) {

        int result = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        int max = Integer.MIN_VALUE;

        for(int x:map.keySet()){
            if(map.get(x)>max){
                max = map.get(x);
            }
        }

        int maxCount = 0;

        for(int x:map.keySet()){
            if(map.get(x) == max){
                maxCount++;
            }
        }


        return maxCount*max;


    }
}
class Solution {
    public int findLucky(int[] arr) {

        int result = -1;

        Map<Integer,Integer> map = new LinkedHashMap<>();


        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int x:map.keySet()){
            if(map.get(x) == x){
                result = Math.max(result, x);
            }
        }

        return result;
    }
}
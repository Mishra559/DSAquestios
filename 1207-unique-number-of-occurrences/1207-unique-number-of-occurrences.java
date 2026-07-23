class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int count = 0;
        int prev = 0;

        Set<Integer> set = new HashSet<>();

        for(int x:map.values()){

            if(set.contains(x)){
                return false;
            }
            set.add(x);
        }

        return true;
        
    }
}
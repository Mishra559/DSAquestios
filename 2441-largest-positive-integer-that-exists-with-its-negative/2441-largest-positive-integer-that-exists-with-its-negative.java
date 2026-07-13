class Solution {
    public int findMaxK(int[] nums) {

       Set<Integer> set = new HashSet<>();
       int result = -1;

       for(int x:nums){
        set.add(x);
       }

       for(int x:nums){
        if(x>0 && set.contains(-x)){
            result = Math.max(result,x);
        }
       }



        return result;
        
    }
}
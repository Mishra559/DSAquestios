class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        List<Integer> list = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        for(int x:nums){
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
            set.add(x);
        }

        for(int i = min+1;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }

        return list;

        
    }
}
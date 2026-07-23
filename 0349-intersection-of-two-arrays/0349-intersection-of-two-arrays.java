class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();


        for(int x:nums1){
            set.add(x);
        }
        
        Set<Integer> set1 = new HashSet<>();

        for(int x:nums2){
            if(set.contains(x)){
               set1.add(x);
            }
        }

       return set1.stream()
               .mapToInt(Integer::intValue)
               .toArray();
    }
}
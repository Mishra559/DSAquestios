class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int[] arr = new int[nums.length+1];

        if(nums.length == 1){
            return list;
        }

        for(int i = 0;i<nums.length;i++){
            arr[nums[i]]++;

            if(arr[nums[i]] > 1){
                list.add(nums[i]);
            }
        }

        return list;


        
    }
}
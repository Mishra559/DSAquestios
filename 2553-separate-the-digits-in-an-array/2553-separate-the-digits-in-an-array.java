class Solution {
    public int[] separateDigits(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for(int x:nums){
            List<Integer> list1 = new ArrayList<>();
            if(x/10 != 0){
               while(x>0){
                 int d = x%10;
                list1.add(d);
                x = x/10;
               }
            }
            else{
                list1.add(x);
            }

            Collections.reverse(list1);
            list.addAll(list1);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
    }
}
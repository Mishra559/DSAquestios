class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;

        for(int x:candies){
            if(x>max){
                max = x;
            }
        }

        List<Boolean> list = new ArrayList<>();

        for(int x:candies){
            if(x+extraCandies >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }


        return list;
        
    }
}
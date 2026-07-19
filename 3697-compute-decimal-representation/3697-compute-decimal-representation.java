class Solution {
    public int[] decimalRepresentation(int n) {

        List<Integer> list = new ArrayList<>();

        int x = 1;

        while(n>0){
            int d = n%10;
            if(d*x != 0){
                list.add(d*x);
            }
            x *= 10; 
            n /= 10;  
        }

        Collections.reverse(list);

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
    }
}
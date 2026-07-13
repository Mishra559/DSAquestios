class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {


        List<Integer> list = new ArrayList<>();

        for(int i = left;i<= right;i++){
            if(selfDivide(i)){
                list.add(i);
            }
        }

        return list;
        
    }


    private static boolean selfDivide(int x){
        int temp = x;

        while(x>0){
            int d = x%10;
            if(d == 0 || temp % d != 0 ){
                return false;
            }
            x = x/10;
        }
        return true;
    }
}
class Solution {
    public int countSeniors(String[] details) {


        int count = 0;

        for(String x:details){
            String sub = x.substring(11,13);
            int y = Integer.parseInt(sub);
            if(y>60){
                count++;
            }
        }

        return count;
        
    }
}
class Solution {
    public int countSeniors(String[] details) {


        int count = 0;

        for(String x:details){
            // String sub = x.substring(11,13);
            // int y = Integer.parseInt(sub);

            int age = (x.charAt(11) - '0')*10 + (x.charAt(12) - '0');
            if(age>60){
                count++;
            }
        }

        return count;
        
    }
}
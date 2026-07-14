class Solution {
    public String removeTrailingZeros(String num) {


        int j = num.length()-1;

        while(j>0){
            if(num.charAt(j) != '0'){
                break;
            }
            j--;
        }


        return num.substring(0,j+1);


        
    }
}
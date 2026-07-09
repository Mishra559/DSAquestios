class Solution {
    public String addSpaces(String s, int[] spaces) {

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i<spaces.length){

            if(j==spaces[i]){
                sb.append(" ");
                sb.append(s.charAt(j++));
                i++;
            }
            else{
                sb.append(s.charAt(j++));
            }
        }

        while(j<s.length()){
            sb.append(s.charAt(j++));
        }

        return sb.toString();
        
    }
}
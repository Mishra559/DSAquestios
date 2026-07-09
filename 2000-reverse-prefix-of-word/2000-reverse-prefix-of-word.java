class Solution {
    public String reversePrefix(String word, char ch) {

        int x = word.indexOf(ch);

        if(x == -1){
            return word;
        }


        String sub = word.substring(0,x+1);
        String rem = word.substring(x+1);
        StringBuffer sb = new StringBuffer(sub);

        sb.reverse();

        sb.append(rem);
        return sb.toString();
        
    }
}
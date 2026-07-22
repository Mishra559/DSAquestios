class Solution {
    public String decodeMessage(String key, String message) {

        key = key.replaceAll(" ","");

        Map<Character,Integer> map = new LinkedHashMap<>();

        int i = 0;

        for(char ch:key.toCharArray()){
            if(map.get(ch) == null){
                map.put(ch,i++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char ch:message.toCharArray()){

            if(ch != ' '){
                char ch1 = (char) ('a' + map.get(ch));
                sb.append(ch1);
            }
            else if(ch == ' '){
                sb.append(" ");
            }
        }

        return sb.toString();     


        
        
    }
}
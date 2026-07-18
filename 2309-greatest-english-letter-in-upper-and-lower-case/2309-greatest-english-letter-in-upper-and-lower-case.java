class Solution {
    public String greatestLetter(String s) {

        Set<Character> set = new HashSet<>();

        char result = ' ';

        for(char ch:s.toCharArray()){
            set.add(ch);
        }

        for(char ch:s.toCharArray()){

            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
                if(set.contains(ch)){
                    if(ch > result){
                        result = ch;
                    }
                }
            }
            else{
                if(set.contains(Character.toLowerCase(ch))){
                    if(ch > result){
                        result = ch;
                    }
                }
            }
        }

        if(result == ' '){
            return "";
        }

        return Character.toString(result);
        
    }
}
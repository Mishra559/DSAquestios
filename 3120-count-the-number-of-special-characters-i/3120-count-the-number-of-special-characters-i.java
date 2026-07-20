class Solution {
    public int numberOfSpecialChars(String word) {

       Set<Character> set = new HashSet<>();
       int count = 0;

       for(char ch:word.toCharArray()){

        if(Character.isUpperCase(ch) && !set.contains(ch) && set.contains(Character.toLowerCase(ch))){
            count++;
        }
        if(Character.isLowerCase(ch) && !set.contains(ch) && set.contains(Character.toUpperCase(ch))){
            count++;
        }
        set.add(ch);
       }

       return count;
    }
}
class Solution {
    public int minimizedStringLength(String s) {

        Set<Character> set = new LinkedHashSet<>();

        for(char ch:s.toCharArray()){
            set.add(ch);
        }

        return set.size();
        
    }
}
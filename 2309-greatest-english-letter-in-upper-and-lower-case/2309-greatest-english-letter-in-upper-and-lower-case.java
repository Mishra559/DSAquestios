class Solution {
    public String greatestLetter(String s) {

        Set<Character> set = new HashSet<>();

        char result = ' ';

        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (char ch : s.toCharArray()) {

            char upper = Character.toUpperCase(ch);
            char lower = Character.toLowerCase(ch);

            if (set.contains(upper) && set.contains(lower) && upper > result) {
                result = upper;
            }
        }

        if (result == ' ') {
            return "";
        }

        return Character.toString(result);

    }
}
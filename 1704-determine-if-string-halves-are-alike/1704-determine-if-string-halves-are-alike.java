class Solution {
    public boolean halvesAreAlike(String s) {

        int n = s.length();

        String s1 = s.substring(0, n / 2);
        String s2 = s.substring(n / 2);

        return countVowels(s1) == countVowels(s2);
          
    }

    private static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (char ch : str.toCharArray()) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }
        return count;
    }
}
class Solution {
    public boolean halvesAreAlike(String s) {

        int n = s.length();

        String s1 = s.substring(0, n / 2);
        String s2 = s.substring(n / 2);

        if(countVowels(s1) == countVowels(s2) && countConsonants(s1) == countConsonants(s2)){
            return true;
        }

        return false;

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

    private static int countConsonants(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (char ch : str.toCharArray()) {

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }

        }
        return count;
    }
}
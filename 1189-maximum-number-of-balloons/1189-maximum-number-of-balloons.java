class Solution {
    public int maxNumberOfBalloons(String text) {

        if (text.length() < 7) {
            return 0;
        }

        int[] freq = new int[26];

        for (char ch : text.toCharArray()) {
            if (ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n') {
                freq[ch - 'a']++;
            }
        }

        int count = 0;

        while (true) {

            if (freq['a' - 'a'] < 1 ||
                    freq['b' - 'a'] < 1 ||
                    freq['l' - 'a'] < 2 ||
                    freq['o' - 'a'] < 2 ||
                    freq['n' - 'a'] < 1) {

                return count;
            }

            freq['a' - 'a']--;
            freq['b' - 'a']--;
            freq['l' - 'a'] -= 2;
            freq['o' - 'a'] -= 2;
            freq['n' - 'a']--;

            count++;

        }

    }
}
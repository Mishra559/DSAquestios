class Solution {
    public int similarPairs(String[] words) {

        int count = 0;

        boolean[] seen = new boolean[words.length];

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (checkChars(words[i], words[j])) {
                    count++;
                }
            }
            seen[i] = true;
        }

        return count;

    }

    private static boolean checkChars(String s1, String s2) {
        boolean[] a = new boolean[26];
        boolean[] b = new boolean[26];

        for (char ch : s1.toCharArray()) {
            a[ch - 'a'] = true;
        }

        for (char ch : s2.toCharArray()) {
            b[ch - 'a'] = true;
        }

        return Arrays.equals(a, b);
    }
}
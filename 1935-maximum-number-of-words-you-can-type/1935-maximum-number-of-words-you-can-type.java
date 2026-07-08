class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String[] arr = text.split(" ");

        int count = 0;

        for (String str : arr) {
            boolean flag = true;

             for (int i = 0; i < str.length(); i++) {
                if (brokenLetters.indexOf(str.charAt(i)) != -1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }

        return count;

    }
}
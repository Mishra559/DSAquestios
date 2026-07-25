class Solution {
    public int maximumValue(String[] strs) {

        int result = 0;

        for (String str : strs) {

            boolean isNumber = true;

            for (char ch : str.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    isNumber = false;
                    break;
                }
            }

            int value;

            if (isNumber) {
                value = Integer.parseInt(str);
            } else {
                value = str.length();
            }

            result = Math.max(result, value);
        }

        return result;

    }
}
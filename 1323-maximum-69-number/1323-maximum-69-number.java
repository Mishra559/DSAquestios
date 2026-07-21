class Solution {
    public int maximum69Number(int num) {

        String str = String.valueOf(num);

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch == '6') {
                arr[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(arr));

    }
}
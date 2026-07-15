class Solution {
    public int getLucky(String s, int k) {

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int x = ch - 'a' + 1;
            sb.append(Integer.toString(x));
        }

        int sum = 0;

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int x = ch - '0';
            sum += x;
        }

        
        
        while (--k > 0) {
            int result = 0;
            while(sum > 0){
                int d = sum%10;
                result += d;
                sum /= 10;
            }

            sum = result;
        }

        return sum;

    }

}
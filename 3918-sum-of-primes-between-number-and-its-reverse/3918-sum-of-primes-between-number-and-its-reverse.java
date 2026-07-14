class Solution {
    public int sumOfPrimesInRange(int n) {

        int temp = n;
        int rev = 0;

        while (temp > 0) {
            int d = temp % 10;
            rev = rev * 10 + d;

            temp = temp / 10;
        }

        int a = Math.min(rev, n);
        int b = Math.max(rev, n);
        int sum = 0;

        for (int i = a; i <= b; i++) {

            if (isPrime(i)) {
                sum += i;
            }

        }

        return sum;

    }

    private static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
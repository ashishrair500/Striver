class Solution {
    private double powHelper(double x, long n, double result) {
    if (n == 0) return result;
    if (n % 2 == 0) {
        return powHelper(x * x, n / 2, result);
    } else {
        return powHelper(x, n - 1, result * x);
    }
    }
    public double myPow(double x, int n) {
       if (n == 0) return 1.0;
    long N = n;
    if (N < 0) {
        x = 1 / x;
        N = -N;
    }
    return powHelper(x, N, 1.0);
    }
}
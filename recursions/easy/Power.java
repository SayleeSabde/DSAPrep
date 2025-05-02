package recursions.easy;

/**
 * Calculate power of number.
 * If number is too large, return modulo 109 + 7
 */
public class Power {
    static int mod=(int)1e9+7;
    public static long myPow(long x, long nn) {
        long ans = 1;
        if (nn == 0) {
            return 1;
        }
        ans = myPow(x, nn/2);
        if (nn%2 == 0) {
            return (ans*ans)%mod;
        } else {
            return (x*ans*ans)%mod;
        }
    }
}

package recursions.easy;

/**
 * Count good numbers of length n
 * A number is good if there is even number at even index and odd number at odd index
 * If there are too many good numbers, return answer modulo 109 + 7
 */
public class CountGoodNumbers {
    static int mod=(int)1e9+7;

    public static int goodNumbers(long n) {
        long first=(n%2==0?(n/2):(n/2)+1);    //deciding n/2 or n/2+1 depending on n is even or odd
        long second=n/2;      //second power would be n/2 only irrespective of even or odd

        long evenNums = Power.myPow(5, first);
        long oddNums = Power.myPow(4, second);

        long ans = 1;
        ans = (ans * evenNums) % mod;
        ans = (second!=0) ? (ans*oddNums)%mod : ans;//computing total product
        return (int) (ans % mod);
    }
}

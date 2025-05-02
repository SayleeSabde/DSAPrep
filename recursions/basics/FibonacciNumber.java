package recursions.basics;

/** Print nth fibonacci term 0based indexing
 *
 */
public class FibonacciNumber {
    public static int fibonacciNum(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fibonacciNum(n-1);
        int slast = fibonacciNum(n-2);
        return last + slast;
    }
}

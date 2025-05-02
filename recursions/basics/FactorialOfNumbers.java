package recursions.basics;

/**
 * Print factorial of number.
 */
public class FactorialOfNumbers {
    public static int factorialOfNumber(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialOfNumber(n - 1);
    }
}

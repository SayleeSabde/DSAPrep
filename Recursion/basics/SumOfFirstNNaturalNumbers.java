package Recursion.basics;

/**
 * Print sum of N natural numbers
 */
public class SumOfFirstNNaturalNumbers {
    public static int sumOfNNumbers(int n, int num) {
        if (n == 0 || num > n) {
            return 0;
        }
        return num + sumOfNNumbers(n, num + 1);
    }
}

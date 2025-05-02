package Recursion.basics;

/**
 * Print 1 to N using recursion
 */

public class PrintOneToN {
    public static void printOneToN(int n, int num) {
        if (num > n) {
            return;
        }
        System.out.println(num);
        printOneToN(n, num + 1);
    }

    public static void printOneToNUsingBackTracking(int n, int num) {
        if (num < 1) {
            return;
        }
        printOneToNUsingBackTracking(n, num - 1);
        System.out.println(num);
    }
}

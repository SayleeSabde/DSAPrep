package Recursion.basics;

/**
 * Print N to One.
 * Tip: Never change the input - Clean code practice
 */
public class PrintNToOne {
    public static void printNToOne(int n, int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printNToOne(n, num-1);
    }
}

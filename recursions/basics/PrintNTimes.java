package recursions.basics;


/**
 * Print the text N times.
 */
public class PrintNTimes {
    public static void printNTimes(int n, String text) {
        if (n == 0) {
            return;
        }
        System.out.println(text);
        printNTimes(n-1, text);
    }
}
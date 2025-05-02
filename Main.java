import java.util.Scanner;

import static recursions.basics.FibonacciNumber.fibonacciNum;
import static recursions.basics.StringPalindromeCheck.isPalindrome;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        printOneToN(n, 1);
        String str1 = "saylee";
        String str2 = "aba";
        System.out.println(isPalindrome(str1, 0));
        System.out.println(isPalindrome(str2, 0));

        System.out.println(fibonacciNum(n));

    }
}

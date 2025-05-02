import java.util.Scanner;

import static Recursion.basics.FactorialOfNumbers.factorialOfNumber;
import static Recursion.basics.FibonacciNumber.fibonacciNum;
import static Recursion.basics.PrintNToOne.printNToOne;
import static Recursion.basics.PrintOneToN.printOneToN;
import static Recursion.basics.PrintOneToN.printOneToNUsingBackTracking;
import static Recursion.basics.ReverseGivenArray.reverseArray;
import static Recursion.basics.StringPalindromeCheck.isPalindrome;
import static Recursion.basics.SumOfFirstNNaturalNumbers.sumOfNNumbers;

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

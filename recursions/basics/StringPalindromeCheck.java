package recursions.basics;

/**
 * Check if string is palindrome or not.
 */
public class StringPalindromeCheck {
    public static boolean isPalindrome(String str, int i) {
        if (i >= str.length()/2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length()-i-1)) {
            return false;
        }
        return isPalindrome(str, i + 1);
    }
}

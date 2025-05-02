package recursions.easy;

/**
 * ATOI using recursion
 * Ignore any whitespace, consider positive/negative signs, and convert to integer
 */
public class Atoi {
    private static int myAtoI(char[] arr, int index, boolean sign, long num) {
        if (index == arr.length) {
            return sign ? Math.toIntExact(num)  : -1*Math.toIntExact(num);
        }
        if (arr[index] == ' ') {
            return myAtoI(arr, index+1, sign, num);
        }
        if (arr[index] == '+' || arr[index] == '-') {
            boolean isPos = arr[index] == '+';
            return myAtoI(arr, index+1, isPos, num);
        }
        int digit = Character.getNumericValue(arr[index]);
        if (digit < 0 || digit > 9)
            return sign ? Math.toIntExact(num) : -1*Math.toIntExact(num);
        num = num * 10 + digit;
        if (num > Integer.MAX_VALUE) {
            num = sign ? Integer.MAX_VALUE: Integer.MIN_VALUE;
            return myAtoI(arr, index+1, sign, num);
        }
        return myAtoI(arr, index+1, sign, num);

    }
    public static int atoi(String s) {
        return myAtoI(s.toCharArray(), 0, true, 0);
    }
}

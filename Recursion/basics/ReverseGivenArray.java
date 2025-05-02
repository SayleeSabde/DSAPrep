package Recursion.basics;

/**
 * Reverse Given Array
 */

public class ReverseGivenArray {

    public static void reverseArray(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
        reverseArray(arr, start + 1, end - 1);
    }
}

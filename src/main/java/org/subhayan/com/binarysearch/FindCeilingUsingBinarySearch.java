package org.subhayan.com.binarysearch;

/**
 * Ceiling = The Smallest element in the array greater than or equal to the target
 */

public class FindCeilingUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6};
        System.out.println(findCeilingUsingBinarySearch(arr1, 10));
    }

    private static int findCeilingUsingBinarySearch(int[] arr, int targetElement) {
        int start = 0;
        int end = arr.length - 1;
        int ceiling;
        if (targetElement > arr[end]) {
            System.out.println("Target element larger than the largest element in the array!");
            return -1;
        }
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == targetElement) {
                ceiling = arr[middle];
                return ceiling;
            }
            if (arr[middle] > targetElement) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        ceiling = arr[start];
        return ceiling;
    }
}

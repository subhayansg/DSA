package org.subhayan.com.binarysearch;

/**
 * The index of the next smallest number just greater than that number.
 * If there are multiple values that are equal to the number, upper_bound() returns the index of the first such value.
 * i.e. the smallest index such that arr[index] > x
 * [3, 5, 8, 15, 19] , 8         -> 3 (index of 15)
 * [3, 5, 8, 15, 19] , 9         -> 3 (index of 15)
 * [3, 5, 8, 15, 19] , 20        -> 5 (end index + 1)
 * [3, 5, 8, 15, 19] , 2        -> 0 (first index)
 * [3, 5, 8, 15, 19, 19, 20] , 19 -> 6 (index of 20)
 */
public class UpperBoundUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 8, 15, 19};
        int[] arr2 = {3, 5, 8, 15, 19, 19, 20};
        System.out.println(upperBoundUsingBinarySearch(arr1, 8));
        System.out.println(upperBoundUsingBinarySearch(arr1, 9));
        System.out.println(upperBoundUsingBinarySearch(arr1, 20));
        System.out.println(upperBoundUsingBinarySearch(arr1, 2));
        System.out.println(upperBoundUsingBinarySearch(arr2, 19));
    }

    static int upperBoundUsingBinarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int upperBound = x > arr[end] ? end + 1 : start;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] > x) {
                upperBound = middle;
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return upperBound;
    }
}

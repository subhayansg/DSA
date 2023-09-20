package org.subhayan.com.binarysearch;

/**
 * The index of the next smallest number just greater than or equal to that number.
 * If there are multiple values that are equal to the number, lower_bound() returns the index of the first such value.
 * i.e. the smallest index such that arr[index] >= x
 * [3, 5, 8, 15, 19] , 8         -> 2 (index of 8)
 * [3, 5, 8, 15, 19] , 9         -> 3 (index of 15)
 * [3, 5, 8, 15, 19] , 20        -> 4 (index of 19)
 * [3, 5, 8, 15, 19, 19, 19] , 9 -> 4 (first index of 19)
 * This is same as Ceil
 */
public class LowerBoundUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 8, 15, 19};
        int[] arr2 = {3, 5, 8, 15, 19, 19, 19};
        System.out.println(lowerBoundUsingBinarySearch(arr1, 8));
        System.out.println(lowerBoundUsingBinarySearch(arr1, 2));
        System.out.println(lowerBoundUsingBinarySearch(arr1, 9));
        System.out.println(lowerBoundUsingBinarySearch(arr1, 20));
        System.out.println(lowerBoundUsingBinarySearch(arr2, 19));
    }

    static int lowerBoundUsingBinarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int lowerBound = x < arr[start] ? start : end;
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (arr[middle] >= x) {
                    lowerBound = middle;
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
            return lowerBound;
        }
}

package org.subhayan.com.binarysearch;

/**
 * https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 * Array of infinite number s = we can't use array.length
 * Search in a box, double the box size in each iteration
 */
public class FindElementInArrayOfInfiniteNums {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 9, 11};
        System.out.println(findThePosInWhichNumPresent(arr1, 9));
    }

    static int findThePosInWhichNumPresent(int[] arr, int targetElement) {
        int start = 0;
        int end = 1;
        while (targetElement > arr[end]) {
            int newStart = end + 1;
            // end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearchAscSorted(arr, targetElement, start, end);
    }

    static int binarySearchAscSorted(int[] arr, int targetElement, int start, int end) {

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == targetElement) {
                return middle;
            } else if (arr[middle] < targetElement) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}

package org.subhayan.com.binarysearch;

/**
 * Floor = The Greatest element in the array smaller than or equal to the target
 */

public class FindFloorUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 6};
        System.out.println(findFloorUsingBinarySearch(arr1, 0));
    }

    private static int findFloorUsingBinarySearch(int[] arr, int targetElement) {
        int start = 0;
        int end = arr.length - 1;
        int floor;
        if (targetElement < arr[start]) {
            System.out.println("Target element smaller than the smallest element in the array!");
            return -1;
        }
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == targetElement) {
                floor = arr[middle];
                return floor;
            }
            if (arr[middle] > targetElement) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        floor = arr[end];
        return floor;
    }
}

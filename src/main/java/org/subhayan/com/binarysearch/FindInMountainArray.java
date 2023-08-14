package org.subhayan.com.binarysearch;

/**
 * https://leetcode.com/problems/find-in-mountain-array/
 */
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,3,2,0};
        System.out.println(searchInMountainArray(arr1, 3));
    }

    static int searchInMountainArray(int[] arr, int targetElement) {
        int indexOfPeak = findPeakIndex(arr);
        int descArrStart = indexOfPeak;
        int descArrEnd = arr.length - 1;
        int ascArrStart = 0;
        int ascArrEnd = indexOfPeak;

        while (ascArrStart <= ascArrEnd) {
            int mid = ascArrStart + (ascArrEnd - ascArrStart) / 2;
            if (arr[mid] == targetElement) {
                return mid;
            } else if (arr[mid] > targetElement) {
                ascArrEnd = mid - 1;
            } else {
                ascArrStart = mid + 1;
            }
        }
        while (descArrStart <= descArrEnd) {
            int mid = descArrStart + (descArrEnd - descArrStart) / 2;
            if (arr[mid] == targetElement) {
                return mid;
            } else if (arr[mid] > targetElement) {
                descArrStart = mid + 1;
            } else {
                descArrEnd = mid - 1;
            }
        }
        return -1;
    }

    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] > arr[middle + 1]) {
                end = middle;
            } else {  // (arr[middle] < arr[middle + 1])
                start = middle + 1;
            }
        }
        return start;
    }
}

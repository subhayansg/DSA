package org.subhayan.com.binarysearch;

/**
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * https://leetcode.com/problems/find-peak-element/
 * bi-tonic/ mountain array = [1,3,5,7,4,2,0] -> peak = 7, contains no duplicates
 */
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,4,2,0};
        System.out.println(findPeak(arr1));
    }

    static int findPeak(int[] arr) {
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
        return arr[start];
    }
}

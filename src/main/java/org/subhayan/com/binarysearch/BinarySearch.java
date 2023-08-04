package org.subhayan.com.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(binarySearchAscSorted(arr1, 1));
    }

    static int binarySearchAscSorted(int[] arr, int targetElement) {
        int start = 0;
        int end = arr.length - 1;

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

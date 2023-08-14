package org.subhayan.com.binarysearch;

public class BinarySearchOrderAgnostic {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(orderAgnosticBinarySearch(arr1, 5));
        System.out.println(orderAgnosticBinarySearch(arr2, 5));
    }

    static int orderAgnosticBinarySearch(int[] arr, int targetElement) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in Asc or Desc
        boolean isAsc = arr[start] < arr[end];
        if (isAsc) {
            System.out.println("Array is sorted in Asc order");
        } else {
            System.out.println("Array is sorted in Desc order");
        }
        while(start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == targetElement) {
                return middle;
            }
            if (isAsc) {
                if (arr[middle] < targetElement) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (arr[middle] > targetElement) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }

}

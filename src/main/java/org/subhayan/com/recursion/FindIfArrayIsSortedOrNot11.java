package org.subhayan.com.recursion;

public class FindIfArrayIsSortedOrNot11 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 8, 9, 12};
        int[] arr2 = {1, 2, 4, 8, 7, 12};
        int[] arr3 = {1, 2, 1};
        System.out.println(isArraySorted(arr1));
        System.out.println(isArraySorted(arr2));
        System.out.println(isArraySortedUsingRecursion(arr3, 0));
        System.out.println(isArraySortedUsingRecursion(arr1, 0));
    }

    private static boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i] < arr[i + 1]) {
                continue;
            } else if (i + 1 < arr.length && arr[i] > arr[i + 1]) {
                return false;
            } else {
                continue;
            }
        }
        return true;
    }

    private static boolean isArraySortedUsingRecursion(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] && isArraySortedUsingRecursion(arr, i + 1);
    }

}

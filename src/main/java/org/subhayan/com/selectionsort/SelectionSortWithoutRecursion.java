package org.subhayan.com.selectionsort;

import java.util.Arrays;

public class SelectionSortWithoutRecursion {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 2, 1, 6, 5};
        int[] arr2 = {1};
        System.out.println("Max index: " + getMaxIndex(arr1, 0, 5));
        selectionSortWithoutRecursion(arr1);
        System.out.println(Arrays.toString(arr1));
        selectionSortWithoutRecursion(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void selectionSortWithoutRecursion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max element in the remaining array and swap with correct index
            int lastIndexForThisIteration = arr.length - i - 1;
            int indexOfMaxElementForThisIteration = getMaxIndex(arr, 0, lastIndexForThisIteration);
            swap(arr, lastIndexForThisIteration, indexOfMaxElementForThisIteration);
        }
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    private static int getMaxIndex(int[] arr, int startIndex, int lastIndex) {
        int maxIndex = startIndex;
        for (int i = startIndex; i <= lastIndex; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

package org.subhayan.com.bubblesort;

import java.util.Arrays;

public class BubbleSortWithoutRecursion {

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 2, 1, 6, 5};
        bubbleSortWithoutRecursion(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void bubbleSortWithoutRecursion(int[] arr) {
        boolean swap = false;
        // run the steps n-1 times, where n = arr.length
        for (int i = 0; i < arr.length; i++) {
            // for each step the largest element will be at the last index
            // j will start from 1 and go till n - i
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            // If you have not swapped for particular value of i, the array is sorted, no need to run further
            if (!swap) {
                break;
            }
        }
    }

}

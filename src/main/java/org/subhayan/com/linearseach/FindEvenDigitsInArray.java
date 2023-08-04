package org.subhayan.com.linearseach;

import java.util.Arrays;

public class FindEvenDigitsInArray {
    public static void main(String[] args) {
        System.out.println("Find even digits in an array");
        int[] arr1 = {61, 23, 43, 24, 15};
        int[] evenArr = findEvenInArray(arr1);
        System.out.println("Even digits in the array: " + Arrays.toString(evenArr));
    }

    private static int[] findEvenInArray(int[] arr) {
        int arrLen = arr.length;
        int[] evenArr = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[i] = arr[i];
            }
        }
        return evenArr;
    }
}

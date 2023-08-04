package org.subhayan.com.linearseach;

import java.util.Arrays;

public class FindEvenNumberOfDigitsInArray {
    public static void main(String[] args) {
        int[] arr1 = {12, 345, 2, 6, 7896};
        int[] arrWithNumWithEvenDigits;
        arrWithNumWithEvenDigits = findNumsWithEvenDigits(arr1);
        System.out.println(Arrays.toString(arrWithNumWithEvenDigits));
        System.out.println(getLengthOfANum(0));
        System.out.println(getLengthOfANumSimpler(0));
    }

    private static int[] findNumsWithEvenDigits(int[] arr) {
        int[] arrWithNumsWithEvenDigits = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int numOfDigits = getLengthOfANum(arr[i]);
            if (numOfDigits % 2 == 0) {
                arrWithNumsWithEvenDigits[i] = arr[i];
            }
        }
        return arrWithNumsWithEvenDigits;
    }

    private static int getLengthOfANum(int num) {
        int numOfDigits = 0;
        if (num == 0) {
            numOfDigits = 1;
            return numOfDigits;
        }
        while (num != 0) {
            num = num / 10;
            numOfDigits++;
        }
        return numOfDigits;
    }


    private static int getLengthOfANumSimpler(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}

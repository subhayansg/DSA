package org.subhayan.com.linearseach;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr2d = {
                {22, 2, 25},
                {18, 21, 45, -8},
                {7, 88, 56, 99},
                {12, 5}
        };
        System.out.println(searchIn2DArray(arr2d, 21));
        System.out.println("Arr len " + arr2d.length); // length of 2D array is number of rows
        System.out.println("Max value in 2D array: " + maxIn2DArray(arr2d));
        System.out.println("Min value in 2D array: " + minIn2DArray(arr2d));
    }

    private static int maxIn2DArray(int[][] arr2d) {
        int maxNum = arr2d[0][0];
        for (int[] rowArr : arr2d) {
            for (int colVal : rowArr) {
                if (colVal > maxNum) {
                    maxNum = colVal;
                }
            }
        }
        return maxNum;
    }

    private static int minIn2DArray(int[][] arr2d) {
        int minNum = arr2d[0][0];
        for (int[] rowArr : arr2d) {
            for (int colVal : rowArr) {
                if (colVal < minNum) {
                    minNum = colVal;
                }
            }
        }
        return minNum;
    }

    private static boolean searchIn2DArray(int[][] arr2d, int targetNum) {
        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                if (anInt == targetNum) {
                    return true;
                }
            }
        }
        return false;
    }


}

package org.subhayan.com.linearseach;

public class FindMinNumber {
    public static void main(String[] args) {
        System.out.println("Find minimum number in an array");
        int[] arr1 = {61, 23, 43, 24, 15};

        int minNum = min(arr1);
        System.out.println(minNum);
    }

    private static int min(int[] arr) {
        int minNum = arr[0];
        for(int i : arr) {
            if (i < minNum) {
                minNum = i;
            }
        }
        return minNum;
    }
}

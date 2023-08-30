package org.subhayan.com.recursion;

import java.util.ArrayList;

public class LinearSearchUsingRecursion12 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 8, 9, 12};
        int[] arr2 = {1, 2, 4, 8, 9, 12};
        int[] arr3 = {1, 2, 4, 1, 9, 12, 1};
        System.out.println(linearSearch(arr1, 0, 9));
        System.out.println(linearSearch(arr1, 0, 99));
        System.out.println(linearSearch(arr2, 0, 12));
        returnAllOccurrences(arr3, 0, 1);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(returnAllOccurrences2(arr3, 0, 1, list1));
        System.out.println(returnAllOccurrences3(arr3, 0, 1));
    }

    private static int linearSearch(int[] arr, int i, int target) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return linearSearch(arr, i + 1, target);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    private static void returnAllOccurrences(int[] arr, int i, int target) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        returnAllOccurrences(arr, i + 1, target);
    }

    private static ArrayList<Integer> returnAllOccurrences2(int[] arr, int i, int target, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        return returnAllOccurrences2(arr, i + 1, target, list);
    }

    // Don't take list as argument, create the list in the body of the function
    // In this case a new list will get created for each recursive call
    private static ArrayList<Integer> returnAllOccurrences3(int[] arr, int i, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }

        // This will contain index for that specific function call
        if (arr[i] == target) {
            list.add(i);
        }

        // Get all the indexes that are there after the current index
        ArrayList<Integer> indexesFromLaterCalls = returnAllOccurrences3(arr, i + 1, target);

        // Now add all indexes
        list.addAll(indexesFromLaterCalls);

        return list;
    }
}

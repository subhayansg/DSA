package org.subhayan.com.linearseach;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear search");
        int[] arr1 = new int[]{1, 2, 3, 4, 5};

        int index = linearSearch(arr1, 99);
        System.out.println(index);
    }

    // search in the array:
    //                      return the index if item found
    //                      return -1 if item not found
    static int linearSearch(int[] arr, int targetElement) {
        if (arr.length == 0) {
            return -1;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == targetElement) {
                    return i;
                }
            }
        }
        return -1;
    }
}
package org.subhayan.com.recursion;

public class BinarySearchUsingRecursion4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(binarySearchUsingRecursion(arr1, 1, 0, arr1.length - 1));
    }
    /* Points to remember about variables during recursion:
        1. Arguments of the function - will go into the next function call
        2. Return type - make sure to return the result of a function call of the same return type of the recursive function
        3. Body of function
     */
    /* -> In case of binary search, start and end are the two arguments that should be part of the function
        Otherwise we can't pass their value for each iteration
        -> Middle is a variable that should be part of body of the function
     */

    // This is for ascending sorted array
    static int binarySearchUsingRecursion(int[] arr, int targetElement, int start, int end) {  // point 1
        int middle = start + (end - start) / 2;  // point 3
        for (int i = start; i <= end; i++) {
            if (arr[middle] == targetElement) {
                return middle;
            }
            if (arr[middle] < targetElement) {
                return binarySearchUsingRecursion(arr, targetElement, middle + 1, end); // point 2
            } else {
                return binarySearchUsingRecursion(arr, targetElement, start, middle - 1);
            }
        }
        return -1;
    }
}

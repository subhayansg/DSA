package org.subhayan.com.binarysearch;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * https://leetcode.com/problems/search-insert-position/description/
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 8};
        System.out.println(searchInsertPositionInArray(arr1, 7));
    }

    static int searchInsertPositionInArray(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int insertPosition = target > nums[end] ? end + 1 : start;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] >= target) {
                insertPosition = middle;
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return insertPosition;
    }
}

package org.subhayan.com.binarysearch;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums1 = {5,7,7,8,8,10};
        int[] nums2 = {5,7,7,7,7,8,8,10};
        int[] nums3 = {};
        System.out.println(Arrays.toString(findFirstAndLastPosition(nums1, 8)));
        System.out.println(Arrays.toString(findFirstAndLastPosition(nums1, 6)));
        System.out.println(Arrays.toString(findFirstAndLastPosition(nums2, 7)));
        System.out.println(Arrays.toString(findFirstAndLastPosition(nums3, 0)));

    }

    private static int[] findFirstAndLastPosition(int[] nums, int targetElement) {
        int firstPos = -1, lastPos = -1;
        int[] ans = new int[]{firstPos, lastPos};
        if (nums.length == 0) {
            return ans;
        }
        firstPos = search(nums, targetElement, true);
        if (firstPos != -1) {
            lastPos = search(nums, targetElement, false);
        }
        return new int[]{firstPos, lastPos};
    }

    static int search(int[] nums, int targetElement, boolean findStartIndex) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] > targetElement) {
                end = middle - 1;
            } else if (nums[middle] < targetElement) {
                start = middle + 1;
            } else {
                index = middle;
                if (findStartIndex) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return index;
    }
}

package org.subhayan.com.binarysearch;

/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */

public class SmallestLetterGreaterThanTarget {

        public static void main(String[] args) {
            char[] letters1 = {'c','f','j'};
            char[] letters2 = {'x','x','y','y'};

            System.out.println(findSmallestLetterGreaterThanTarget(letters1, 'a'));
            System.out.println(findSmallestLetterGreaterThanTarget(letters1, 'c'));
            System.out.println(findSmallestLetterGreaterThanTarget(letters1, 'j'));
            System.out.println(findSmallestLetterGreaterThanTarget(letters2, 'z'));
            System.out.println(findSmallestLetterGreaterThanTarget(letters2, 'y'));
        }

        private static char findSmallestLetterGreaterThanTarget(char[] charArr, char targetChar) {
            int start = 0;
            int end = charArr.length - 1;
            char ceiling;
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (charArr[middle] > targetChar) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
            ceiling = charArr[start % charArr.length];
            return ceiling;
        }
}

package org.subhayan.com.recursion.patterns;

/**
 * * Print the following:
 *              * * * *
 *              * * *
 *              * *
 *              *
 */
public class Pattern1 {
    public static void main(String[] args) {
        printPatter1();
        printPattern1WithRecursion(4, 0);
    }

    static void printPatter1() {
        int i = 1;
        while (i <= 4) {
            int j = 4 - i + 1;
            while (j >= 1) {
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    static void printPattern1WithRecursion(int row, int column) {
        if (row == 0) {
            return;
        }
        if (column < row) {
            System.out.print("* ");  // print first * of a row
            printPattern1WithRecursion(row, column + 1);  // continue printing rest of the columns
        } else {  // when column = row, go to next line
            System.out.println();
            printPattern1WithRecursion(row - 1, 0);  // start printing, next row will have 1 less item
        }
    }
}

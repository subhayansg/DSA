package org.subhayan.com.recursion.patterns;

public class Pattern2 {
    public static void main(String[] args) {
        printPattern2WithRecursion(4, 0);
    }

    private static void printPattern2WithRecursion(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            printPattern2WithRecursion(row, col + 1);
            System.out.print("* ");
        } else {
            printPattern2WithRecursion(row - 1, 0);
            System.out.println();
        }
    }
}

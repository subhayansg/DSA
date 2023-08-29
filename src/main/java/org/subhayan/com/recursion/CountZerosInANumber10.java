package org.subhayan.com.recursion;

public class CountZerosInANumber10 {
    public static void main(String[] args) {
        System.out.println(countZeros(1010));
    }

    // 100 -> 100%10
    static int countZeros(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            return helper(n / 10, ++count);
        }
        return helper(n / 10, count);
    }
}

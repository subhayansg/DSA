package org.subhayan.com.linearseach;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] bank1 = {{1,2,3}, {3,2,1}};
        int[][] bank2 = {{1,5}, {7,3}, {3,5}};
        int indexOfRichestInBank1 = findRichest(bank1);
        System.out.println(indexOfRichestInBank1);
        System.out.println(findRichest(bank2));
    }

    private static int findRichest(int[][] bank1) {
        int previousTotalAsset = 0;
        for (int[] rowArr : bank1) {
            int totalAsset = 0;
            for (int col : rowArr) {
                totalAsset = totalAsset + col;
            }
            if (totalAsset > previousTotalAsset) {
                previousTotalAsset = totalAsset;
            }
        }
        return previousTotalAsset;
    }
}

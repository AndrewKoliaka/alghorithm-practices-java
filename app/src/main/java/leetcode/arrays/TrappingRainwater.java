package leetcode.arrays;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 */

public class TrappingRainwater {
    public static int getResult(int[] arr) {
        var total = 0;

        for (int i = 0; i < arr.length; i++) {
            var maxL = 0;
            var maxR = 0;

            for (int l = i; l >= 0; l--) {
                if (arr[l] > maxL) {
                    maxL = arr[l];
                }
            }

            for (int r = i; r < arr.length; r++) {
                if (arr[r] > maxR) {
                    maxR = arr[r];
                }
            }

            var totalWaterForHeight = getTotalWaterForHeight(maxL, maxR, arr[i]);

            if (totalWaterForHeight > 0) {
                total += totalWaterForHeight;
            }
        }

        return total;
    }

    private static int getTotalWaterForHeight(int maxL, int maxR, int currentHeight) {
        return Math.min(maxL, maxR) - currentHeight;
    }
}

package dailyCodingProblem.arrays;

public class BuildingsWithSunsetView {
    public static void main(String[] args) {
        int[] arr1 = { 3, 7, 8, 3, 6, 1 };
        int[] arr2 = { 3, 7, 8, 3, 6 };
        int[] arr3 = { 1 };
        int[] arr4 = {};

        System.out.println(getBuildingsCount(arr1));
        System.out.println(getBuildingsCount(arr2));
        System.out.println(getBuildingsCount(arr3));
        System.out.println(getBuildingsCount(arr4));
    }

    public static int getBuildingsCount(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int count = 1;
        int max = arr[0];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }

        return count;
    }
}

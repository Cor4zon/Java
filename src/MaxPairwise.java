import java.util.Scanner;

public class MaxPairwise {
    public static void main(String[] args) {
        int[] testOne = {900000, 100000};                   // 90000000000
        int[] testTwo = {1, 2, 3, 4, 5, 6};                 // 30
        int[] testThree = {2};                              // найти аналог assert
        int[] testFour = {1, 4, 6, 39, -3, 0, 0, 100, 23};  // 390

        System.out.println(getMaxPairwise(testOne));
        System.out.println(getMaxPairwise(testTwo));
        System.out.println(getMaxPairwise(testThree));
        System.out.println(getMaxPairwise(testFour));

    }

    static int getMaxPairwise(int[] array) {
        assert array.length < 2;

        int maxA = array[0];
        int maxIndex = 0;
        int maxB = array[1];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxA) {
                maxA = array[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < array.length; i++)
            if (array[i] > maxB && i != maxIndex) maxB = array[i];

        return maxA * maxB;
    }


}

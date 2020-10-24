import java.util.*;
import java.io.*;
import java.util.Random;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(long[] numbers) {
        long max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product,
                        numbers[first] * numbers[second]);
            }
        }
        return max_product;
    }

    static long getMaxPairwiseProductFast(long[] numbers) {
        long maxA = numbers[0];
        int maxIndexA = 0;
        long maxB = numbers[0];
        int maxIndexB = -1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxA) {
                maxA = numbers[i];
                maxIndexA = i;
            }
        }

        for (int i = 0; i < numbers.length; i++)
            if ((maxIndexB == -1 || numbers[i] > maxB) && i != maxIndexA)
            {
                maxB = numbers[i];
                maxIndexB = i;
            }

        return maxA * maxB;
    }

    public static void main(String[] args) {
        /* Stress test
        int N = 0;
        int[] Numbers;
        int ansOne;
        int ansTwo;

        Random rnd = new Random();

        while (true) {
            N = rnd.nextInt(1000) + 2;
            System.out.println(N);

            Numbers = new int[N];
            for (int i = 0; i < N; ++i) {
                Numbers[i] = rnd.nextInt(10000);
                System.out.print(Numbers[i] + " ");
            }
            System.out.println();

            ansOne = getMaxPairwiseProduct(Numbers);
            ansTwo = getMaxPairwiseProductFast(Numbers);
            if (ansOne != ansTwo){
                System.out.println("Wrong answer: " + ansOne + " != " + ansTwo);
                break;
            }
        }
        */

        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
//        long start = System.nanoTime();
        System.out.println(getMaxPairwiseProductFast(numbers));
//        long end = System.nanoTime();
//        System.out.println("Time: " + (double)(end - start) / 1_000_000_000 + " sec.");

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}

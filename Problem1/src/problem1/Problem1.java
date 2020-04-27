package problem1;

import java.util.Arrays;

/** @author Araya Siriadun 58090046 */
public class Problem1 {
    public static void main(String[] args) {
        int fail = 0;
        int[][] testCases = {
            {5, 1, 1},
            {234, 234, 234},
            {18, 6, 6},
            {6, 18, 6},
            {36, 24, 12},
            {24, 36, 12},
            {77, 21, 7},
            {104513, 23, 1}
        };
        System.out.println(
                "the test of the method gcd(int p, int q) using the following the test cases:");
        for (int i = 0; i < testCases.length; i++) {
            boolean truth = gcd(testCases[i][0], testCases[i][1]) == testCases[i][2];
            if (!truth) {
                fail++;
            }
            System.out.println(
                    String.format("%s (%d) %s", truth, i + 1, Arrays.toString(testCases[i])));
        }
        System.out.print(String.format("%d test(s) done", testCases.length));
        if (fail > 0) {
            System.out.print(String.format(":%d failed", fail));
        }
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }
}

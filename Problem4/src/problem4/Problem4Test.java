package problem4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import org.junit.jupiter.api.RepeatedTest;

/** @author Araya Siriadun 58090046 */
class Problem4Test {
    private Problem4 problem4 = new Problem4();

    @RepeatedTest(value = 100)
    void testSortRandom() {
        int length = new Random().nextInt(100 + 1);
        if (length < 2) {
            return;
        }
        int[] array = new Random().ints(length, -1000000, 1000000 + 1).toArray();
        problem4.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                fail("Array is not sorted.");
            }
        }
        assertEquals(length, array.length);
    }
}

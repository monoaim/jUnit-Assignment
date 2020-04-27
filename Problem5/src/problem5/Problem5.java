package problem5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/** @author Araya Siriadun 58090046 */
class Problem5Test {
    @ParameterizedTest
    @CsvFileSource(resources = "test.csv")
    void testComb(int x, int y, long z) {
        assertEquals(Problem5.comb(x, y), z);
    }
}

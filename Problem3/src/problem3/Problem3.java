package problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/** @author Araya Siriadun 58090046 */
class Problem3Test {
    @ParameterizedTest
    @ValueSource(strings = {"12", "Hello_World", "1011.1", "-101", "1 1 0 1", ""})
    void testBinToDecEx(String numBin) {
        assertThrows(IllegalArgumentException.class, () -> Problem3.binToDec(numBin));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1001", "0"})
    void testBinToDecNoEx(String numBin) {
        Problem3.binToDec(numBin);
    }
}

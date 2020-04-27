package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** @author Araya Siriadun 58090046 */
class Problem2Test {
    @ParameterizedTest
    @MethodSource("testCases")
    void testGcd(int p, int q, int expOutput) {
        assertEquals(Problem2.gcd(p, q), expOutput);
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(5, 1, 1),
                Arguments.of(234, 234, 234),
                Arguments.of(18, 6, 6),
                Arguments.of(6, 18, 6),
                Arguments.of(36, 24, 12),
                Arguments.of(24, 36, 12),
                Arguments.of(77, 21, 7),
                Arguments.of(104513, 23, 1));
    }
}

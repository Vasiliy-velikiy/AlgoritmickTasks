package medium.fibonacci;

import medium.fibonacci.AdditiveNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditiveNumberTest {

    @Test
    void isAdditiveNumber() {
        AdditiveNumber solution = new AdditiveNumber();
        boolean actual = solution.isAdditiveNumber("112358");
        assertEquals(true, actual);

        actual = solution.isAdditiveNumber("199100199");
        assertEquals(true, actual);
    }
}
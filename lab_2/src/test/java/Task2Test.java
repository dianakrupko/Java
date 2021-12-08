import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    double[] arr = {4, 5, 6, 7, 9};
    Boolean available;

    @BeforeEach
    void setUp() {
        available = true;
    }

    @Test
    void isVariety() {
        Boolean expected = true;
        assertEquals(expected, Task2.isVariety(arr));
    }
}
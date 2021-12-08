import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    double[] arr = new double[]{4, 5, 6, 7, 9, 4, 7};
    int actual;


    @BeforeEach
    void setUp() {
        actual = 3;
    }

    @Test
    void returncount() {
        int expected = 3;
        assertEquals(expected, Task1.returncount(arr));
    }
}
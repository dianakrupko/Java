import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    double[] arr = new double[]{4, 5, 6, 4};
    int actual;


    @BeforeEach
    void setUp() {

        actual = 6;
    }

    @Test
    void returncount() {
        int expected = 6;
        assertEquals(expected, Task3.returncount(arr));
    }
}
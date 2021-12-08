import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    int[] a = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 314, 334};
    int m=5;
    int d=2;
    boolean ly=false;

    int actual;

    @BeforeEach
    void setUp() {
        actual = 122;
    }

    @Test
    void myday() {
        int expected = 122;
        assertEquals(expected, Task4.myday(5,2,a[4],false));
    }
}
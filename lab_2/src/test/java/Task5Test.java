import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    int[] arr = new int[]{4, 5, 6, 7, 9, 4, 7};
    int k;
    int actual;


    @BeforeEach
    void setUp() {
        k=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                k += 1;
            }
        }
        actual = k;
    }

    @Test
    void returnCount() {
        int expected = 2;
        assertEquals(expected, Task5.returnCount(arr));
    }
}
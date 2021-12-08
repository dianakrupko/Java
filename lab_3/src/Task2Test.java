import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    String str;
    @BeforeEach
    void setUp(){
        str="Ok";
    }

    @Test
    void CCharacter() {
        String expected= "Ok";
        assertEquals(expected,Task2.CCharacter(str));
    }
}
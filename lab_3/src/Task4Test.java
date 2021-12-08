import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    String[] args={"5.6","99","\'f\'","\"ffg\"", "***" };

    @BeforeEach
    void setUp() {
        String[] args = {"5.6", "99", "\'f\'", "\"ffg\"", "***"};
    }

    @Test
    void FReal() {
        String expected= "Real";
        assertEquals(expected,Task4.FReal(args));
    }

    @Test
    void FInteger() {
        String expected= "Integer";
        assertEquals(expected,Task4.FInteger(args));
    }

    @Test
    void FCharacter() {
        String expected= "Character";
        assertEquals(expected,Task4.FCharacter(args));
    }

    @Test
    void FString() {
        String expected= "String";
        assertEquals(expected,Task4.FString(args));
    }

    @Test
    void FIdentifier() {
        String expected= "Identifier";
        assertEquals(expected,Task4.FIdentifier(args));
    }
}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    String[] args={"do","988","rrhh", "===" };
    @BeforeEach
    void setUp() {
        String[] args={"do","988","rrhh", "===" };
    }

    @Test
    void FKeyword() {
        String expected= "Keyword";
        assertEquals(expected,Task3.FKeyword(args));
    }

    @Test
    void FIndentifier() {
        String expected= "Indentifier";
        assertEquals(expected,Task3.FIndentifier(args));
    }

    @Test
    void FIllegal() {
        String expected= "Illegal";
        assertEquals(expected,Task3.FIllegal(args));
    }
}
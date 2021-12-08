import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    String s;
    String str;
    int key;
    @BeforeEach
    void setUp(){
        s="Diana";
        str="Infsf";
        key=5;
    }
    /*@AfterEach
    void shown(){
        System.err.println("Test is completed");
    }*/

    @Test
    void encryption() {
        String expected = Task1.Encryption(s,key);
        String acctual = "Infsf";
        assertEquals(expected,acctual);
    }

    @Test
    void decrypt() {
        String expected = "Diana";
        String acctual = Task1.Decrypt(str,key);
        assertEquals(expected,acctual);
    }
}
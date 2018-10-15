import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStringMethodsTest {

    @Test
    public void abcTest1() {
        boolean result = TwoStringMethods.abcTest("123abc");
        assertEquals(true, result);
    }

    public void abcTest2() {
        boolean result = TwoStringMethods.abcTest("123.abc");
        assertEquals(false, result);
    }

    public void abcTest3() {
        boolean result = TwoStringMethods.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void alternateStrings1() {
        String output = TwoStringMethods.alternateStrings("abc", "xyz");
        assertEquals("axbycz", output);
    }

    public void alternateStrings2() {
        String output = TwoStringMethods.alternateStrings("Hi", "There");
        assertEquals("HTihere", output);
    }

    public void alternateStrings3() {
        String output = TwoStringMethods.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", output);
    }

    public void alternateStrings4() {
        String output = TwoStringMethods.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", output);
    }

}
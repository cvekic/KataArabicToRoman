import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mladjan on 26.3.2014.
 */
public class ArabicToRomanTest {

    ArabicToRoman subject;

    @Before
    public void setUp() {
        subject = new ArabicToRoman();
    }

    @Test
    public void mustReturnIfor1() {
        assertEquals("I", subject.convert(1));
    }

    @Test
    public void mustReturnIIfor2() {
        assertEquals("II", subject.convert(2));
    }

    @Test
    public void mustReturnIIIfor3() {
        assertEquals("III", subject.convert(3));
    }

    @Test
    public void mustReturnXfor10() {
        assertEquals("X", subject.convert(10));
    }

    @Test
    public void mustReturnXXfor20() {
        assertEquals("XX", subject.convert(20));
    }

    @Test
    public void mustReturnIVfor4() {
        assertEquals("IV", subject.convert(4));
    }

    @Test
    public void mustReturnVfor5() {
        assertEquals("V", subject.convert(5));
    }

    @Test
    public void mustReturnIXfor9() {
        assertEquals("IX", subject.convert(9));
    }

    @Test
    public void mustReturnVIIIfor8() {
        assertEquals("VIII", subject.convert(8));
    }

    @Test
    public void mustReturnVIIfor7() {
        assertEquals("VII", subject.convert(7));
    }

    @Test
    public void mustReturnMMCDXCIXfor2499() {
        assertEquals("MMCDXCIX", subject.convert(2499));
    }

    @Test
    public void mustReturnMMMCMXLIXfor3949() {
        assertEquals("MMMCMXLIX", subject.convert(3949));
    }

    @Test
    public void mustReturnMCMXCfor1990() {
        assertEquals("MCMXC", subject.convert(1990));
    }

}

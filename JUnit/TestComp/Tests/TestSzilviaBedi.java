import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class TestSzilviaBedi {


    private WordToolbox str ;
    private WordToolbox str2;
    private WordToolbox str3;
    private WordToolbox str4;

    @Test
    public void countHowMany1() throws Exception {
        str = new WordToolbox("Tarzan's toenails");
        assertEquals(2, str.countHowMany('t'));
    }

    @Test
    public void countHowMany2() throws Exception {
        str2 = new WordToolbox("Me Tarzan, You Jane");
        assertEquals(1, str2.countHowMany('t'));
    }

    @Test
    public void isAnAnagram() throws Exception {
        str3 = new WordToolbox("aloft");
        str4 = new WordToolbox("");
        assertFalse(str3.isAnAnagram("falsetto"));
        assertTrue(str3.isAnAnagram("float"));
        assertFalse(str3.isAnAnagram(""));
        assertFalse(str4.isAnAnagram("something"));
    }

}



import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class AppleTest {

    private Apple myObject;
    private ArrayList<Integer> alTest;

    @Before
    public void setUp() throws Exception {
        myObject = new Apple();
    }

    @Test
    public void getApple() throws Exception {
        assertEquals("apple", myObject.getApple());
    }

    @Test
    public void sumApples() throws Exception {
        alTest = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(10, myObject.sumArray(alTest));
    }

    @Test
    public void sumApplesEmpty() throws Exception {
        alTest = new ArrayList<>();
        assertEquals(0, myObject.sumArray(alTest));
    }

    @Test
    public void sumApplesOneElement() throws Exception {
        alTest = new ArrayList<>(4);
        assertEquals(0, myObject.sumArray(alTest));
    }

    @Test (expected = NullPointerException.class)
    public void sumApplesNull() throws Exception {
        alTest = new ArrayList<>(null);
        assertNull(myObject.sumArray(alTest));
    }

}
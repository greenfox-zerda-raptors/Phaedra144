package GrassHopper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ${SzilviaB} on 2017. 01. 02..
 */
public class GrassHopperTest {
    GrassHopper myObject;

    @Before
    public void setUp() throws Exception {
        myObject = new GrassHopper();
    }

    @Test
    public void test1() {
        assertEquals(1,
                myObject.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                myObject.summation(8));
    }
}
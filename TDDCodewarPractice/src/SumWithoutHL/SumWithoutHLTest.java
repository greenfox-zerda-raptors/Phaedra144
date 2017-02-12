package SumWithoutHL;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ${SzilviaB} on 2017. 01. 02..
 */
public class SumWithoutHLTest {
    private SumWithoutHL sumObject;
    @Before
    public void setUp() throws Exception {
        sumObject = new SumWithoutHL();
    }


    @Test
    public void test1() throws Exception {
        assertEquals(16, sumObject.sum(new int[] { 6, 2, 1, 8, 10}));
    }

}
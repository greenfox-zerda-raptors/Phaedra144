package SquareEveryDigit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by ${SzilviaB} on 2017. 01. 02..
 */
public class SquareDigitTest {

    private SquareDigit myObject;

    @Before
    public void setUp() throws Exception {
        myObject = new SquareDigit();
    }

    @Test
    public void test0() {
        assertEquals(0, myObject.squareDigits(0));
    }

    @Test
    public void test1() {
        assertEquals(1, myObject.squareDigits(1));
    }

    @Test
    public void test2() {
        assertEquals(11, myObject.squareDigits(11));
    }

    @Test
    public void test3() {
        assertEquals(111, myObject.squareDigits(111));
    }

    @Test
    public void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
    }



}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class FibonacciTest {

    private Fibonacci newObject;


    @Before
    public void setUp() throws Exception {
        newObject = new Fibonacci();
    }

    @Test
    public void fibo1() throws Exception {
        assertEquals(55, newObject.fibo(10) );
    }


    @Test
    public void fibo() throws Exception {
        assertEquals(1, newObject.fibo(-2) );

    }

    @Test
    public void fiboZero() throws Exception {
        assertEquals(1, newObject.fibo(0) );

    }

}
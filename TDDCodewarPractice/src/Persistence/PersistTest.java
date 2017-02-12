package Persistence;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ${SzilviaB} on 2017. 01. 21..
 */
public class PersistTest {



    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
    }
    @Test
    public void BasicTests1() {
        assertEquals(0, Persist.persistence(4));

    }
    @Test
    public void BasicTests2() {
        assertEquals(2, Persist.persistence(25));
    }
    @Test
    public void BasicTests3() {
        assertEquals(4, Persist.persistence(999));
    }

}
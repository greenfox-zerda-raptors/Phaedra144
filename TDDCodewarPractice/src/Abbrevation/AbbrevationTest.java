package Abbrevation;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ${SzilviaB} on 2017. 01. 21..
 */
public class AbbrevationTest {

    Abbrevation myObject;

    @Before
    public void setUp() throws Exception {
        myObject = new Abbrevation();
    }

    @Test
    public void testNull() throws Exception {

        assertEquals(null, myObject.abbr(null));


    }


    @Test
    public void testEmpty() throws Exception {

        assertEquals("", myObject.abbr(""));


    }


    @Test
    public void testFun() throws Exception {

        assertEquals("fun", myObject.abbr("fun"));


    }




    @Test
    public void testIntenationalization() throws Exception {

        assertEquals("i18n", myObject.abbr("internationalization"));


    }

    @Test
    public void testHighlyEffective() throws Exception {

        assertEquals("h4y-e7e", myObject.abbr("highly-effective"));


    }

    @Test
    public void testSentence() throws Exception {

        assertEquals("H3o I am the new g8n.", myObject.abbr("Hello I am the new generation."));


    }



}
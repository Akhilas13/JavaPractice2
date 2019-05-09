package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest even;

    @Before
    public void setUp() throws Exception {
        even=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        even=null;
    }
    @Test
    public void testEvenNumber(){
        assertEquals(true,even.isEven(8));
    }
    @Test
    public void testEvenNumbers(){
        assertNotEquals(false,even.isEven(8));
    }
    @Test
    public void testOddnumber(){
        assertEquals(false,even.isEven(9));
    }
    @Test
    public void testOddNumbers(){
        assertNotEquals(true,even.isEven(9));
    }
    @Test
    public void testEven(){
        assertTrue(even.isEven(46));
    }
    @Test
    public void testOdd(){
        assertFalse(even.isEven(55));
    }
}
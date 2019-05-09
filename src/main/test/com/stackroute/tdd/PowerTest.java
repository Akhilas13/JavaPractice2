package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PowerTest {
    PowerOfFour number;

    @Before
    public void setUp() throws Exception {
        number=new PowerOfFour();

    }

    @After
    public void tearDown() throws Exception {
        number=null;
    }
    @Test
    public void testPowerOfFour(){
        assertEquals("it is power of 4",number.powerOfNumber(16));
    }
    @Test
    public void testZero(){
        assertEquals("it is not a power of 4",number.powerOfNumber(0));
    }
    @Test
    public void testRandomnumber(){
        assertEquals("it is not a power of 4",number.powerOfNumber(9));
    }
    @Test
    public void testNumberOne(){
        assertEquals("it is power of 4",number.powerOfNumber(1));

    }


}
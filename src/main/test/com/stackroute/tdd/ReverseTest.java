package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse input;

    @Before
    public void setUp() throws Exception {
        input=new Reverse();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }
    @Test
    public void testStringPalindrome(){
        assertEquals("malayalam",input.stringPalindrome("malayalam"));

    }

    @Test
    public void testStringNotPalindrome(){
        assertEquals("kcats",input.stringPalindrome("stack"));
    }
    @Test
    public void testStringNotPalindromes(){
        assertNotEquals("stack",input.stringPalindrome("stack"));
    }
    @Test
    public void testNumberPalindrome(){
        assertEquals(111,input.numberPalindrome(111));
    }
    @Test
    public void testNumberNotPalindrome(){
        assertEquals(321,input.numberPalindrome(123));
    }
}
package com.Adventure;

import static org.junit.Assert.*;

public class UtilitiesTest {
private Utilities utils;
@org.junit.Before
public void setup(){
    utils = new Utilities();
}
    @org.junit.Test
    public void everyNthChar() throws Exception {

        char[] output = utils.everyNthChar(new char[] {'h','e','l','l','o'},2);
        assertArrayEquals(new char[]{'e','l'}, output);
        char[] output2 = utils.everyNthChar(new char[] {'h','e','l','l','o'},8);
        assertArrayEquals(new char[]{'h','e','l','l','o'}, output2);
    }

    @org.junit.Test
    public void removePairs() throws Exception{

  assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
  assertNull(null, utils.removePairs(null));
    }

    @org.junit.Test
    public void converter() throws Exception{

       assertEquals(300, utils.converter(10,5));
    }
    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() throws Exception{

        utils.converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception{

       assertNull(utils.nullIfOddLength("odd"));
       assertNotNull(utils.nullIfOddLength("even"));
    }
}
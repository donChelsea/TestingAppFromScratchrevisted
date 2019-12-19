package com.example.unittestingappfromscratch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulatorUnitTest {

    private StringManipulator stringManipulator;

    @Before
    public void setUp() throws Exception {
        stringManipulator = StringManipulator.getInstance();
    }

    @Test
    public void isLessThan10Null() {
        String input = null;
        boolean actual = stringManipulator.isLessThan10(input);
        assertTrue(actual);
    }

    @Test
    public void isLessThan10EmptyString() {
        String input = "";
        boolean actual = stringManipulator.isLessThan10(input);
        assertTrue(actual);
    }

    @Test
    public void isOddLengthOneCharacter() {
        String input = "g";
        boolean actual = stringManipulator.isOddLength(input);
        assertTrue(actual);
    }

    @Test
    public void isOddLengthNull() {
        String input = null;
        boolean actual = stringManipulator.isOddLength(input);
        assertFalse(actual);
    }

    @Test
    public void zipperWordsOneNullValue() {
        String input1 = null;
        String input2 = "input";
        String actual = stringManipulator.zipperWords(input1, input2);
        Assert.assertNotNull(actual);
    }

    @Test
    public void zipperWordsFirstWordIsLonger() {
        String input1 = "apples";
        String input2 = "eggs";
        String actual = stringManipulator.zipperWords(input1, input2);
        Assert.assertEquals("aepgpglses", actual);
    }

    @Test
    public void deconstructedWordNoVowels() {
        String input = "gnmdklfm";
        String actual = stringManipulator.deconstructedWord(input);
        Assert.assertEquals(input, actual);
    }

    @Test
    public void deconstructuredWordNull() {
        String input = null;
        String actual = stringManipulator.deconstructedWord(input);
        Assert.assertNotNull(actual);
    }

    @Test
    public void wordSumEmpty() {
        String input1 = "";
        String input2 = "";
        int actual = stringManipulator.wordSum(input1, input2);
        Assert.assertEquals(0, actual);
    }

    @After
    public void tearDown() throws Exception {
        stringManipulator = null;
    }
}
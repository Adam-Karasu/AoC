package day8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by murad-1 on 19/02/16.
 */
public class Day8Test {

    Day8 test;

    @Before
    public void setUp() throws Exception {
        test = new Day8();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testEscapedDoubleBackSlash() throws Exception {
        String expected = "abc\\def\\ghi";
        String actual = test.escapeDouble("abc\\\\def\\\\ghi");
        System.out.println(expected);
        System.out.println(actual);

        assertEquals(expected, actual);

    }

    @Test
    public void testEscapedDoubleQuote() throws Exception {
        String expected = "abc-def-ghi";
        String actual = test.escapeDoubleQuote("abc\\\"def\\\"ghi");
        System.out.println(expected);
        System.out.println(actual);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveLeadingAndTrailingQuotes() throws Exception {
        String expected = "abcdefghi";
        String actual = test.removeLeadingAndTrailingQuotes("\"abcdefghi\"");
        System.out.println("Actual: " + actual);


        assertEquals(expected, actual);
    }

    @Test
    public void testReplaceSingleCharHexCode() throws Exception {
        String expected = "abc@def@ghi";
        String actual = test.replaceSingleCharHexCode("abc\\xe6def\\x65ghi");
        System.out.println("Actual: " + actual);

        assertEquals(expected, actual);
    }

    @Test
    public void testTestCombo() throws Exception {
        String expected = "abc@def@ghi";
        String actual = test.handelEscapeSequences("\"abc\\xe3def\\xff\"");
        System.out.println("Actualk: " + actual);

        assertEquals(expected, actual);
    }

    @Test
    public void testHandelEscapeSequences() throws Exception {
        String expected = "a\\bc@def@\"ghi";
        String actual = test.handelEscapeSequences("\"a\\\\bc\\xe3def\\xff\"ghi\"");

        assertEquals(expected, actual);
    }
}
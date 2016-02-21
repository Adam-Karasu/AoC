package day8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.reader.MyReader;

import static org.junit.Assert.*;

/**
 * Created by murad-1 on 19/02/16.
 */
public class Day8Test {

    Day8 test;
    MyReader myReader;

    @Before
    public void setUp() throws Exception {
        myReader = new MyReader();
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
        //String expected = "a\\bc@def@\"ghi";
        String expected = "n\\c";
        //String actual = test.handelEscapeSequences("\"a\\\\bc\\xe3def\\xff\"ghi\"");

        String actual = test.handelEscapeSequences("\"n\\\\c\"");

        assertEquals(expected, actual);
    }

    @Test
    public void singleTest() throws Exception {
        String expected = "34612";
        String actual = test.removeLeadingAndTrailingQuotes("\"46\"\\x8e\\\"");
        String actual2 = test.replaceSingleCharHexCode(actual);
        String actual3 = test.escapeDouble(actual2);
        String actual4 = test.escapeDoubleQuote(actual3);
        assertEquals(expected.length(), actual4.length());
    }

    @Test
    public void testAll() throws Exception {
        for (String item : myReader.readFileByLine("puzzle_inputs/Day8Test")
             ) {
            test.handelEscapeSequences(item);
        }
        System.out.println("Answer = " + test.difference());
    }
}
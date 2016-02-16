package util.regex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by murad on 13/02/16.
 */
public class MyRegexTest {

    MyRegex regex;

    @Before
    public void setUp() throws Exception {
        regex = new MyRegex("(\\d+)x(\\d+)x(\\d+");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMatch(){
        String actual = "";
        String expected  = "333333";
        String[] result = regex.autoSort("33x33x33");
        actual = result[0] + result[1] + result[2];
        assertEquals(expected, actual);
    }
}
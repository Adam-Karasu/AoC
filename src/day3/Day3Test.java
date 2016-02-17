package day3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.regex.MyRegex;

import static org.junit.Assert.*;

/**
 * Created by murad-1 on 17/02/16.
 */
public class Day3Test {

    MyRegex myRegex;

    @Before
    public void setUp() throws Exception {
myRegex = new MyRegex("[^<>v]");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTest() throws Exception {


    }
}
package day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by murad-1 on 11/02/16.
 */
public class Day2Test {
    Day2 day2;
    @Before
    public void setUp() throws Exception {
         day2 = new Day2();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSplitInput() throws Exception {
        String[] expected = {"55","66", "77"};
        String[] actual = day2.splitDataOnLine("55x66x77");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCalculate() throws Exception {
        String [] boxDimensions = {"2", "3", "4"};
        int actual = day2.calculatePaperNeeded(boxDimensions);

        assertEquals(502, actual);

        assertEquals(50, actual);

    }

    @Test
    public void testReadAndCalculateAllBoxes() throws Exception {

    }

    @Test
    public void testFindMinDimensions() throws Exception{
        int expected = 6;
        int[] minArray = day2.min(2,3,4);
        int actual = minArray[0] * minArray[1];
        System.out.println(Arrays.toString(minArray));
                assertEquals(expected, actual);
    }
}
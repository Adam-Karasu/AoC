package day7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.reader.MyReader;

import java.util.Collections;

/**
 * Created by murad-1 on 18/02/16.
 */
public class WireExtractorTest {








    WireExtractor test;
    String[] testInstructions = {"23 -> x", "456 -> y", "x AND y -> d", "x OR y -> e", "x LSHIFT 2 -> f","y RSHIFT 2 -> g","NOT x -> h","NOT y -> i"};
    MyReader myReader;
    @Before
    public void setUp() throws Exception {
        myReader = new MyReader();
        test = new WireExtractor();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFindWire2() throws Exception {

        for (String item : testInstructions
             ) {
            test.executeGate(item);
        }

        System.out.println(test.getWires().toString());


    }

    @Test
    public void testFindWire() throws Exception {

        for (String item :
                myReader.readFileByLine("puzzle_inputs/Day7Input")) {
            test.findWire(item);
        }
        Collections.sort(test.getOrderedWires());
        test.getOrderedWires().forEach(System.out::println);
    }
}
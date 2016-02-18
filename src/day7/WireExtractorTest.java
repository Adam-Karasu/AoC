package day7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by murad-1 on 18/02/16.
 */
public class WireExtractorTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFindWire() throws Exception {
        WireExtractor test = new WireExtractor();
        test.findWire("30 AND a -> g");
    }
}
package day6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by murad on 15/02/16.
 */
public class Day6Test {

    Day6 day6;
    LightGrid lightGrid;
    int lightGridSize;
    Instruction instruction;

    @Before
    public void setUp() throws Exception {
        lightGrid = new LightGrid(10);
        day6 = new Day6(lightGrid);
        lightGridSize = lightGrid.getLightGrid().length;
        instruction = new Instruction();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testLightGrid() {
        for (int i = 0; i < lightGridSize; i++) {
            for (int j = 0; j < lightGridSize; j++) {
                lightGrid.alterInternal(i, j, 0);
                System.out.print(lightGrid.getLightGrid()[i][j] + "  ");
            }
            System.out.println();
        }
    }

    @Test
    public void testUnpack() {
        String[] test = {"Turn on", "2", "5", "6", "8"};
        day6.releaseInstructions(test);
    }

    @Test
    public void testInstructionAccess() {
        instruction.getFirstPoint().getX();
        System.out.println(instruction.getFirstPoint().getX());
    }
}

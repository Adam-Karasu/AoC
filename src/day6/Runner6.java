package day6;

import util.reader.MyReader;
import util.regex.MyRegex;

/**
 * Created by murad on 16/02/16.
 */
public class Runner6 {

    Day6 day6;
    LightGrid lightGrid;
    MyReader myReader;
    MyRegex myRegex;

    public Runner6() {
        setUp();
    }

    private void setUp() {
        myReader = new MyReader();
        myRegex = new MyRegex("(toggle|turn off|turn on) (\\d+),(\\d+) through (\\d+),(\\d+)");
        lightGrid = new LightGrid(1000);
        day6 = new Day6(lightGrid);

        for (String item : myReader.readFileByLine("puzzle_inputs/Day6Input")
                ) {
            day6.releaseInstructions(myRegex.autoSort(item));
        }
        System.out.println(lightGrid.countLights());
    }

    public static void main(String[] args) {
        new Runner6();
    }
}

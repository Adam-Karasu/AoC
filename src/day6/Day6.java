package day6;

import javafx.scene.effect.Light;

/**
 * Created by murad on 13/02/16.
 */
public class Day6 {

    private LightGrid lightGrid;

    public Day6(LightGrid lightGrid) {
        this.lightGrid = lightGrid;
    }

    public void releaseInstructions(String[] instruction) {
        String operation = instruction[0];
        int x = Integer.parseInt(instruction[1]);
        int y = Integer.parseInt(instruction[2]);
        int x2 = Integer.parseInt(instruction[3]);
        int y2 = Integer.parseInt(instruction[4]);
        testTurnOn(operation, x, y, x2, y2);
        //System.out.println(operation + x +  x2 +  y + y2);
    }

    public void testTurnOn(String operation, int x, int y, int x2, int y2) {
        for (int i = x; i <= x2; i++) {
            for (int j = y; j <= y2; j++) {
                call(operation, i, j);
            }
        }
    }

    private void call(String operation, int row, int col) {

        switch (operation) {
            case "turn on":
                lightGrid.turnOn(row, col);
                break;
            case "turn off":
                lightGrid.turnOff(row, col);
                break;
            case "toggle":
                lightGrid.toggle(row, col);
                break;
        }
    }
}



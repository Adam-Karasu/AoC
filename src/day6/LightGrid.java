package day6;

/**
 * Should the light grid know how to turn its self on and off?
 * <p>
 * Created by murad on 13/02/16.
 */
public class LightGrid {

    private int[][] lightGrid;
    private int size;


    public LightGrid(int nonJaggedDoubleIntArray) {
        this.size = nonJaggedDoubleIntArray;
        lightGrid = new int[nonJaggedDoubleIntArray][nonJaggedDoubleIntArray];
    }

    public int[][] getLightGrid() {
        return lightGrid;
    }

    public void alterInternal(int row, int col, int input) {
        lightGrid[row][col] = input;
    }

    public void turnOn(int row, int col) {
        ++lightGrid[row][col];
    }

    public void turnOff(int row, int col) {
        if (lightGrid[row][col] > 0) {
            --lightGrid[row][col];
        }

    }

    public void toggle(int row, int col) {
        lightGrid[row][col] += 2;
    }

    public int countLights() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                total += lightGrid[i][j];
            }
        }
        return total;
    }

    public void print() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print(lightGrid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

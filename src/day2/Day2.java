package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * TODO when calculating the ribbon length needed, only use the two smallest numbers
 * TODO currently the first two numbers in the array are bing used causing the answer to be too big
 * <p>
 * TODO update the documentation on calculatePaperNeeded(String e) to reflect the above need
 * <p>
 * Created by murad on 11/02/16.
 */
public class Day2 {

    public static void main(String[] args) {
        new Day2();
    }

    public Day2() {
        System.out.println(readFile());
    }

    public String[] splitDataOnLine(String dataLine) {
        String[] test = dataLine.split("x");
        return test;
    }

    /**
     * equation - 2*l*w + 2*w*h + 2*h*l
     * example -
     * 2x3x4
     * 2*6 + 2*12 + 2*8 = 52
     *
     * @param dimensions
     * @return
     */
    public int calculatePaperNeeded(String[] dimensions) {
        int length = Integer.parseInt(dimensions[0]);
        int width = Integer.parseInt(dimensions[1]);
        int height = Integer.parseInt(dimensions[2]);

        int squareFeet = (2 * length * width) + (2 * width * height) + (2 * height * length);
        int[] twoSmallestSidesLengthForBow = min(width, length, height);
        return squareFeet + twoSmallestSidesLengthForBow[0] * twoSmallestSidesLengthForBow[1];
    }

    /**
     * finds the two smallest numbers out of the dimensions given
     * used to find the length of ribbon needed for bow
     * http://www.codinghelmet.com/?path=exercises/two-smallest
     *
     * @param
     * @return
     */
    public int[] min(int width, int length, int height) {
        int[] twoSmallestDimensions = new int[2];
        int lowest = width;
        int secondLowest = length;

        if (length < width) {
            lowest = length;
            secondLowest = width;
        }

        if (height < lowest) {
            secondLowest = lowest;
            lowest = height;
        } else if (height < secondLowest) {
            secondLowest = height;
        }

        twoSmallestDimensions[0] = lowest;
        twoSmallestDimensions[1] = secondLowest;
        return twoSmallestDimensions;
    }

    public int readFile() {
        int totalPaperNeeded = 0;
        try {
            FileReader fileReader = new FileReader("puzzel_inputs/Day2Input");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            String[] splitDimensions;

            while ((line = bufferedReader.readLine()) != null) {
                splitDimensions = splitDataOnLine(line);
                totalPaperNeeded += calculatePaperNeeded(splitDimensions);
                //System.out.println(Arrays.toString(splitDimensions)); //prints array
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return totalPaperNeeded;
    }
}

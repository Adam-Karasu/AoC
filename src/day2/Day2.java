package day2;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by murad on 11/02/16.
 */
public class Day2 {

    public static void main(String[] args) {
        new Day2();
    }

    public Day2() {
        System.out.println(readFile());
    }

    public List<String> splitDataOnLine(String dataLine) {
        List<String> test = new ArrayList<>();
        test.add(dataLine.split("x"));
        return test;
    }

    /**
     * equation - 2*l*w + 2*w*h + 2*h*l
     * example -
     * 2x3x4
     * 2*6 + 2*12 + 2*8 = 52
     * 52 + slack = answer
     *
     * slack is the total of multiplying the two smallest sides
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
     * used to find the length of paper needed for wrapping
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

    public List<String> readFile() {
        int totalPaperNeeded = 0;
        List<String> splitDimensions = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("puzzle_inputs/Day2Input");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;


            while ((line = bufferedReader.readLine()) != null) {
                splitDimensions = splitDataOnLine(line);
                totalPaperNeeded += calculatePaperNeeded(splitDimensions);
                //System.out.println(Arrays.toString(splitDimensions)); //prints array
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return splitDimensions;
    }
}

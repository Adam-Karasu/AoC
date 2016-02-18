package util.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by murad on 13/02/16.
 */
public class MyReader {

    public List<String> readFileByLine(String inputLocation) {

        List<String> splitDimensions = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(inputLocation);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                splitDimensions.add(line);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return splitDimensions;
    }
}

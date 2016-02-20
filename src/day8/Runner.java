package day8;

import util.reader.MyReader;

/**
 * Created by murad-1 on 20/02/16.
 */
public class Runner {

    MyReader myReader;
    Day8 day8;
    public Runner() {
        myReader = new MyReader();
        day8 = new Day8();
        setUp();
    }

    public void setUp() {

        for (String item : myReader.readFileByLine("puzzle_inputs/Day8Input")
                ) {
            System.out.println(day8.handelEscapeSequences(item));
        }
    }

    public static void main(String[] args){

        new Runner();
    }
}

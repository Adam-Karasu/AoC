package day8;

import util.reader.MyReader;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
            System.out.println( day8.handelEscapeSequences(item));
            day8.part2(item);

        }

        System.out.println(day8.difference());
        System.out.println(day8.diffP2() + "------------");
    }

    public static void main(String[] args) {

        new Runner();
    }
}
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
<<<<<<< HEAD
            day8.part2(item);

        }

        System.out.println(day8.difference());
        System.out.println(day8.diffP2() + "------------");
=======
            day8.encodeP2(item);
        }

        System.out.println(day8.difference());
        System.out.println(day8.differenceP2()  + "-------------------");
>>>>>>> fe3740e9a5452187172dde1fa4a2337e6ce0ab90
    }

    public static void main(String[] args) {

        new Runner();
    }
}
package day3;

import java.util.ArrayList;
import java.util.Hashtable;


/**
 * Created by murad on 13/02/16.
 */
public class Day3 {

    static Hashtable<String, Integer> positionsVistited = new Hashtable<>();

    static int count;

    public Day3() {

    }

    public static void test(String key, int value) {
        ++count;
        positionsVistited.put(key, value);
    }

    public static void main(String[] args) {
        test("test", 1);
        test("test2", 1);
        System.out.println(positionsVistited.toString());

    }
}
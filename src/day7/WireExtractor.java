package day7;

import util.reader.MyReader;

import java.util.*;

/**
 * Created by murad-1 on 18/02/16.
 */
public class WireExtractor {

    List<String> orderedWires = new ArrayList<>();
    HashMap<String, Integer> wires = new HashMap<>();

    public List<String> getOrderedWires() {
        return orderedWires;
    }

    public void executeGate(String instruction) {
        //split into array
        String[] instructionSplit = instruction.split(" ");


        if (Character.isDigit(instruction.charAt(0))) {
            wires.put(instructionSplit[2], Integer.parseInt(instructionSplit[0]));
//break  ;
        }

       // if (instructionSplit)

        //if first char is digit
        //else if lower case
        //else if upper case
    }

    public HashMap<String, Integer> getWires() {
        return wires;
    }

    public void findWire(String instruction) {
/*
if (Character.isDigit(instruction.charAt(0))) {
            orderedWires.add(instruction);
        }

        if (instruction.charAt(0)== 'b'){
            orderedWires.add(instruction);
        }
        */
    }
}

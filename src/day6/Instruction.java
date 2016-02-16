package day6;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by murad on 16/02/16.
 */
public class Instruction {

    private String operation;
    private Point firstPoint, secondPoint;
    private List<Instruction> instructionList = new ArrayList<>();

    public Instruction(){

    }
    public Instruction(String operation, Point firstPoint, Point secondPoint) {
        this.operation = operation;
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public void addToInstructionList(String o, Point p1, Point p2) {
        instructionList.add(new Instruction(o, p1, p2));
    }

    public String getOperation() {
        return operation;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }
}

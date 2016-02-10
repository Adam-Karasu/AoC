/**
 * Created by murad on 10/02/16.
 */
public class Day1 {

    private static int count;
    private static  char[] direction = new char[]{')','(','(','(',')'};

    public static void main(String[] args) {
        for (char input: direction) {
            travelDirection(input);
        }
        System.out.println(count);
    }

    public static void travelDirection(char direction) {
        if (direction == '(' ) {
            travelUp();
        } else {
            traveDown();
        }
    }

    public static void travelUp() {
        ++count;
    }

    public static void traveDown() {
        --count;
    }

}

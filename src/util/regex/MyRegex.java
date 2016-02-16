package util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO alter output (notes given at source of this todo)
 * - give better name
 * - create an output array that can have its sizse set at runtime (constructor variable)
 * TODO stop instantiating new String array on each autoSort(String s ) call
 *
 * Created by murad on 13/02/16.
 */
public class MyRegex {

    private Pattern expression;

    public MyRegex(String expression) {
        this.expression = Pattern.compile(expression);
    }

    /**
     * for each line in a document add salient data (based on the regex you provide)
     * to a string array. this array is recreated each time this methods is called - find a better
     * solution
     *
     * @param toMatch
     * @return
     */
    public String[] autoSort(String toMatch) {
        String[] outputArray;
        Matcher matcher = expression.matcher(toMatch);
        int size = findOutPutSize(matcher);
        outputArray = new String[size];

        if (matcher.matches()) {

            for (int i = 0; i < size; i++) {
                /* + 1 is added to grab the correct group, instead of taking whole pattern
                (matcher.group(0) = whole pattern) only groups 1 and upwards is taken
                */
                outputArray[i] = matcher.group(i + 1);
            }
        }
        return outputArray;
    }

    public int findOutPutSize(Matcher matcher) {
        int size = 0;
        if (matcher.matches()) {
            size = matcher.groupCount();
        }
        return size;
    }
}

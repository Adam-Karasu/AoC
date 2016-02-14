package util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO alter output (notes given at source of this todo)
 * - give better name
 * - create an output array that can have its sizse set at runtime (constructor variable)
 * -
 * <p>
 * Created by murad on 13/02/16.
 */
public class MyRegex {

    private Pattern expression;

    public MyRegex(String expression) {
        this.expression = Pattern.compile(expression);
    }

    public String[] day2RegexStringArray(String toMatch) {
        String[] day2output = new String[3];
        Matcher matcher = expression.matcher(toMatch);
        if (matcher.find()) {
            day2output[0] = matcher.group(1);
            day2output[1] = matcher.group(2);
            day2output[2] = matcher.group(3);
        }
        return day2output;
    }

    public String[] day6StringDirection(String toMatch){
        String[] day6output = new String[6];
        Matcher matcher = expression.matcher(toMatch);
        if(matcher.find()){
            day6output[0] = matcher.group(1);
            day6output[1] = matcher.group(2);
            day6output[2] = matcher.group(3);
            day6output[3] = matcher.group(4);
            day6output[4] = matcher.group(5);
        }
        return day6output;
    }
}

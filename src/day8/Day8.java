package day8;

/**
 * Created by murad-1 on 19/02/16.
 */
public class Day8 {

    int oriLength;
    int newLength;
    String escapeHexadecimal = "(\\\\x[a-f0-9]{2})";

    public String replaceSingleCharHexCode(String str){
        String ans = str.replaceAll(escapeHexadecimal, "@");
        return ans;
    }

    public String escapeDouble(String str) {
        String ans = str.replace("\\\\", "\\");
        return ans;
    }

    public String escapeDoubleQuote(String str) {
        String ans = str.replace("\\\"", "-");

        return ans;
    }

    public String removeLeadingAndTrailingQuotes(String str) {
        String ans = str.substring(1, str.length());
        String ans1 = ans.substring(0, ans.length() - 1);
        return ans1;
    }

    public String handelEscapeSequences(String str){

        oriLength += str.length();
        String a1 = removeLeadingAndTrailingQuotes(str);
        String a2 = replaceSingleCharHexCode(a1);
        String a3 = escapeDouble(a2);
        String answer = escapeDoubleQuote(a3);
        newLength += answer.length();

        return answer;
    }

    public int difference(){

        System.out.println(oriLength );
        System.out.println(newLength);
        int answer = oriLength - newLength;
        return answer;
    }

}
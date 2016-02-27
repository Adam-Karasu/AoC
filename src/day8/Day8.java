package day8;

/**
 * Created by murad-1 on 19/02/16.
 */
public class Day8 {

    int p2oriLeng;
    int p2newLeng;
    int oriLength;
    int newLength;
    String escapeHexadecimal = "(\\\\x[a-f0-9]{2})";
    String doubleQoute = "(\")";
    int iOri;
    int t;

    public String replaceSingleCharHexCode(String str) {
        String ans = str.replaceAll(escapeHexadecimal, "1");
        t += 1;
        return ans;
    }

    public int test() {
        return (t + iOri) - iOri;
    }

    public void setiOri(String str) {
        iOri = str.length() + 2;
    }

    public String begingAndEnd(String str) {
        return "\"\\\"" + str + "\\\"\"";
    }

    enum  encode{

    }
    public String part2(String str) {

        p2oriLeng += (str.toCharArray().length + 2);
        String ans2 = encodeDouble(str);
        String answer = encodeQuote(ans2);
        String ans1 = begingAndEnd(answer);
        //each special character has to be counted as the sum of all its parts not just
        //the special charater its selg
        p2newLeng += ans1.length();
        return ans1;
    }

    public String encodeHex(String str) {
        return str.replaceAll(escapeHexadecimal, "\\\\\\\\xff");
    }

    public String encodeDouble(String str) {
        return str.replace("\\" , "\\\\");
    }

    public int diffP2() {
        return p2newLeng - p2oriLeng;
    }

    public String encodeQuote(String str) {

        //add one here for every call to this method
        return str.replace("\"","\\\\\\\"");
    }

    public int getT() {
        return t;
    }

    public String escapeDouble(String str) {
        String ans = str.replace("\\\\", "2");
        t += 4;
        return ans;
    }

    public String escapeDoubleQuote(String str) {
        String ans = str.replace("\\\"", "3");
        t += 3;
        return ans;
    }

    public String removeLeadingAndTrailingQuotes(String str) {
        String ans = str.substring(1, str.length());
        String ans1 = ans.substring(0, ans.length() - 1);
        t += 4;
        return ans1;
    }

    public String handelEscapeSequences(String str) {

        oriLength += str.length();
        String a1 = removeLeadingAndTrailingQuotes(str);

        String a2 = escapeDouble(a1);

        String a3 = escapeDoubleQuote(a2);
        String answer = replaceSingleCharHexCode(a3);
        newLength += answer.length();

        System.out.println(str.length());
        System.out.println(answer.length());

        return answer;
    }

    public int difference() {

        System.out.println(oriLength);
        System.out.println(newLength);
        int answer = oriLength - newLength;
        return answer;
    }

}

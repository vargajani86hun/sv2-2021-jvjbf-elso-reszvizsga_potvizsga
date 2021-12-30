package firstnumber;

public class FirstNumber {

    public char getFirstNumber(String s) {
        if (s.isEmpty()) {
            return ' ';
        }
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return c;
            }
        }
        return ' ';
    }
}

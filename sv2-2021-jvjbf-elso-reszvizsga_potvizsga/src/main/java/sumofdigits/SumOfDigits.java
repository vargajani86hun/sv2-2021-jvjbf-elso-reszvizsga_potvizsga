package sumofdigits;

public class SumOfDigits {

    public int getSumOfDigits(int number) {
        int sum = 0;
        for (Character c : Integer.toString(number).toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}

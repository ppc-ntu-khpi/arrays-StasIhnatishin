package domain;

public class Exercies {

    public static boolean Calculate(int number) {
        int original = number;
        int digits = (int) Math.log10(number) + 1;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == original;
    }
}

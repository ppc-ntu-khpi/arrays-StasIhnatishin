package test;

import domain.Exercies;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для перевірки: ");
        int number = scanner.nextInt();

        boolean isArmstrong = Exercies.Calculate(number);

        if (isArmstrong) {
            System.out.println(number + " є числом Армстронга.");
        } else {
            System.out.println(number + " не є числом Армстронга.");
        }
        
        scanner.close();
    }
}

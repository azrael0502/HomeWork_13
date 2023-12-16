package HomeWork6;

import java.util.Scanner;

public class CalTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();

        try {
            double result = Calculator.powerXY(x, y);
            System.out.println("Result: " + result);
        } catch (CalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

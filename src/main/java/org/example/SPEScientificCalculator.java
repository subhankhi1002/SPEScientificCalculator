package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class SPEScientificCalculator {
    public double findSquareRoot(int number) {
        return Math.sqrt(number);
    }

    public double calculateFactorial(int number) {
        double factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial *= i;
        return factorial;
    }

    public double computeNaturalLog(int number) {
        return Math.log(number);
    }

    public long evaluatePower(int base, int exponent) {
        return (long) Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SPEScientificCalculator calculator = new SPEScientificCalculator();

        while (true) {
            System.out.println("Choose operation \n" +
                    "1. Square root function - √x \n" +
                    "2. Factorial function - x!\n" +
                    "3. Natural logarithm (base е) - ln(x)\n" +
                    "4. Power function - x^b\n" +
                    "5. Press 8 to exit\n");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            int number;
            int exponent;
            double result;
            switch (choice) {
                case 1:
                    System.out.println("Enter Your Desired number:");
                    number = scanner.nextInt();
                    result = calculator.findSquareRoot(number);
                    System.out.println("Square root function of this number is :" + result);
                    break;
                case 2:
                    System.out.println("Enter Your Desired number:");
                    number = scanner.nextInt();
                    result = calculator.calculateFactorial(number);
                    System.out.println("Factorial of this number is :" + result);
                    break;
                case 3:
                    System.out.println("Enter Your Desired number:");
                    number = scanner.nextInt();
                    result = calculator.computeNaturalLog(number);
                    System.out.println("Natural logarithm (base е) of this number is :" + result);
                    break;
                case 4:
                    System.out.println("Enter Your Desired number:");
                    number = scanner.nextInt();
                    System.out.println("Enter Your Another Desired number:");
                    exponent = scanner.nextInt();
                    long result1 = calculator.evaluatePower(number, exponent);
                    System.out.println("Power function of thi number :" + result1);
                    break;
                default:
                    System.out.println("Exiting \n");
                    exit(0);
            }
        }
    }
}

package org.cquinto;

import java.util.Scanner;

/**
 * Cristian Ezequiel Quinto
 */
public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int testCases = scanner.nextInt();

        if (testCases > 1 && testCases < 10) {
            for (int i = 0; i < testCases; i++) {
                System.out.print("Enter a positive integer: ");
                int number = scanner.nextInt();

                long factorial = 1;

                while (number > 0) {
                    factorial *= number;
                    number--;
                }

                int lastDigit = (int) (factorial % 10);

                System.out.println(lastDigit);
            }
        }
    }

}

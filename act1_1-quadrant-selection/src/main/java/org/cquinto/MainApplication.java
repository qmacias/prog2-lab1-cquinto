package org.cquinto;

import java.util.Scanner;

/**
 * Cristian Ezequiel Quinto
 */
public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x value: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y value: ");
        double y = scanner.nextDouble();

        if (-1000 < x && x < 1000 && x != 0) {
            if (-1000 < y && y < 1000 && y != 0) {
                if (x > 0) {
                    if (y > 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(4);
                    }
                } else if (y > 0) {
                    System.out.println(2);
                } else {
                    System.out.println(3);
                }
            } else {
                System.out.println("?");
            }
        } else {
            System.out.println("?");
        }
    }

}

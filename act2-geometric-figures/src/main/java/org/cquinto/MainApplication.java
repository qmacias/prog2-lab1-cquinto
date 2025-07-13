package org.cquinto;

import org.cquinto.domain.*;

import java.util.Scanner;

/**
 * Cristian Ezequiel Quinto
 */
public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the circle radius: ");
        Double circleRadius = Double.parseDouble(scanner.next());

        Shape circle = new Circle(circleRadius);
        System.out.println(circle);

        System.out.print("Enter the rectangle base: ");
        Double rectangleBase = Double.parseDouble(scanner.next());

        System.out.print("Enter the rectangle height: ");
        Double rectangleHeight = Double.parseDouble(scanner.next());

        Shape rectangle = new Rectangle(rectangleBase, rectangleHeight);
        System.out.println(rectangle);

        System.out.print("Enter the scalene triangle A side: ");
        Double scaleneTriangleASide = Double.parseDouble(scanner.next());

        System.out.print("Enter the scalene triangle B side: ");
        Double scaleneTriangleBSide = Double.parseDouble(scanner.next());

        System.out.print("Enter the scalene triangle C side: ");
        Double scaleneTriangleCSide = Double.parseDouble(scanner.next());

        Shape scaleneTriangle = new ScaleneTriangle(scaleneTriangleASide, scaleneTriangleBSide, scaleneTriangleCSide);
        System.out.println(scaleneTriangle);

        System.out.print("Enter the equilateral triangle A side: ");
        Double equilateralTriangleASide = Double.parseDouble(scanner.next());

        System.out.print("Enter the equilateral triangle B side: ");
        Double equilateralTriangleBSide = Double.parseDouble(scanner.next());

        System.out.print("Enter the equilateral triangle C side: ");
        Double equilateralTriangleCSide = Double.parseDouble(scanner.next());

        Shape equilateralTriangle = new EquilateralTriangle(equilateralTriangleASide, equilateralTriangleBSide, equilateralTriangleCSide);
        System.out.println(equilateralTriangle);

        System.out.print("Enter the isosceles triangle A side: ");
        Double isoscelesTriangleASide = Double.parseDouble(scanner.next());

        System.out.print("Enter the isosceles triangle B side: ");
        Double isoscelesTriangleBSide = Double.parseDouble(scanner.next());

        System.out.print("Enter the isosceles triangle C side: ");
        Double isoscelesTriangleCSide = Double.parseDouble(scanner.next());

        Shape isoscelesTriangle = new IsoscelesTriangle(isoscelesTriangleASide, isoscelesTriangleBSide, isoscelesTriangleCSide);
        System.out.println(isoscelesTriangle);

        System.out.print("Enter the square side: ");
        Double squareSide = Double.parseDouble(scanner.next());

        Shape square = new Square(squareSide);
        System.out.println(square);
    }

}

package org.cquinto.domain;

public class Circle implements Shape {
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return String.format("Circle, area: %.3f\nperimeter: %.4f", this.calculateArea(), this.calculatePerimeter());
    }

}

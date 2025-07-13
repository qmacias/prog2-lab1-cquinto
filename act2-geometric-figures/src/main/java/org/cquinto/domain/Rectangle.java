package org.cquinto.domain;

public class Rectangle implements Shape {
    private final Double base;
    private final Double height;

    public Rectangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return this.base * this.height;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * this.base + 2 * this.height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle, area: %.0f\nperimeter: %.0f", this.calculateArea(), this.calculatePerimeter());
    }

}

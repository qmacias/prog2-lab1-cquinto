package org.cquinto.domain;

public class Square extends Rectangle {
    public Square(Double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return String.format("Square, area: %.0f\nperimeter: %.0f", this.calculateArea(), this.calculatePerimeter());
    }

}

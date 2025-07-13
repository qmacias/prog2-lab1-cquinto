package org.cquinto.domain;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(Double aSide, Double bSide, Double cSide) {
        super(aSide, bSide, cSide);
    }

    public Double calculateArea() {
        double area = (Math.sqrt(3) / 4) * Math.pow(this.aSide, 2);

        return Math.floor(area * 1000) / 1000.0;
    }

    public Double calculatePerimeter() {
        return 3 * this.aSide;
    }

    @Override
    public String toString() {
        return String.format("Equilateral Triangle, area: %.3f\nperimeter: %.0f", this.calculateArea(), this.calculatePerimeter());
    }

}

package org.cquinto.domain;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(Double aSide, Double bSide, Double cSide) {
        super(aSide, bSide, cSide);
    }

    protected Double calculateHeight() {
        return Math.sqrt(Math.pow(this.aSide, 2) - (Math.pow(this.cSide, 2) / 4));
    }

    public Double calculateArea() {
        return (this.cSide / 2) * this.calculateHeight();
    }

    public Double calculatePerimeter() {
        return 2 * this.aSide + this.cSide;
    }

    @Override
    public String toString() {
        return String.format("Isosceles Triangle, area: %.3f\nperimeter: %.0f", this.calculateArea(), this.calculatePerimeter());
    }

}

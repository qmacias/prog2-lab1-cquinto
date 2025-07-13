package org.cquinto.domain;

public class ScaleneTriangle extends Triangle {
    public ScaleneTriangle(Double aSide, Double bSide, Double cSide) {
        super(aSide, bSide, cSide);
    }

    private Double calculateSemiPerimeter() {
        return (this.aSide + this.bSide + this.cSide) / 2;
    }

    public Double calculateArea() {
        double s = this.calculateSemiPerimeter();

        return Math.sqrt(s * (s - this.aSide) * (s - this.bSide) * (s - this.cSide));
    }

    @Override
    public String toString() {
        return String.format("Scalene Triangle, area: %.3f\nperimeter: %.0f", this.calculateArea(), this.calculatePerimeter());
    }

}

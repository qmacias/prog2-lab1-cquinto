package org.cquinto.domain;

public abstract class Triangle implements Shape {
    protected final Double aSide;
    protected final Double bSide;
    protected final Double cSide;

    public Triangle(Double aSide, Double bSide, Double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    protected Double calculateHeight() {
        return (Math.sqrt(3) / 2) * this.aSide;
    }

    @Override
    public Double calculateArea() {
        return (this.aSide * this.calculateHeight()) / 2;
    }

    @Override
    public Double calculatePerimeter() {
        return this.aSide + this.bSide + this.cSide;
    }

    @Override
    public String toString() {
        return String.format("Triangle, area: %.3f\nperimeter: %.0f", this.calculateArea(), this.calculatePerimeter());
    }

}

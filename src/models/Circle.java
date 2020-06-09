package models;

public class Circle extends Figure {
    private double radio;
    private Coordinate position;

    public Circle(double radio, Coordinate position) {
        this.position = position;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    @Override
    public double obtainArea() {
        return (Math.PI * Math.pow(this.getRadio(),3));
    }

    @Override
    public String toString() {
        return "Radio del circulo : " + this.getRadio() + this.getPosition() +".";
    }
}

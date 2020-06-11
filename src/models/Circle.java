package models;

/**
 * cl
 */
public class Circle extends Figure {


    private double radio;
    private Coordinate position;

    /**
     * Constructor para la creación del circulo
     * @param radio Este parametro incluye el radio que se desea agregar al circulo
     * @param position Añade la posición de donde está situado el circulo
     */
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

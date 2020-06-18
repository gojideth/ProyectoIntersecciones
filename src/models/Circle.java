package models;

/**
 * Clase Circle que hereda de la clase Figura
 * @author Martin C
 */
public class Circle extends Figure {


    public double radio;
    private Coordinate position;

    /**
     * Constructor para la creación del círculo
     * @param radio Este parametro incluye el radio que se desea agregar al círculo
     * @param position Añade la posición de donde está situado el círculo
     */
    public Circle(double radio, Coordinate position) {
        this.position = position;
        this.radio = radio;
    }

    /**
     * Método que retorna el radio del círculo
     * @return radio del círculo pedido
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Método que modifica el radio del circulo ingresado
     * @param radio Valor a agregar al radio del círculo
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Método que retorna el centro del círculo en coordenada del plano cartesiano
     * @return Posición del círculo en ambos ejes (X y Y)
     */
    public Coordinate getPosition() {
        return position;
    }

    /**
     * Método que modifica la posición del círculo
     * @param position Posición a modificar en el círculo
     */
    public void setPosition(Coordinate position) {
        this.position = position;
    }

    /**
     * Método que obtiene si un círculo está siendo interceptado por otro círculo
     * @param circle El círculo que se quiere revisar si está siendo interceptado
     * @return True si está interceptado por otro círculo o false si no lo está
     */
    public boolean isIntersected(Circle circle){
        return (this.radio+circle.radio) >= (this.position.distanceTo(circle.getPosition()));
    }

    /**
     * Método que calcula el area del círculo
     * @return Area del círculo
     */
    @Override
    public double obtainArea() {
        return (Math.PI * Math.pow(this.getRadio(),2));
    }

    /**
     * Método que ofrece mejor descripción de la clase
     * @return Descripción de la clase Circle
     */
    @Override
    public String toString() {
        return "Radio del circulo : " + this.getRadio() + this.getPosition() +".";
    }
}

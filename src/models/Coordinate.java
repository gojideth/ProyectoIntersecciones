package models;

/**
 * Clase Coordenada
 * @author Martin C
 */
public class Coordinate {

    private double coordX;
    private double coordY;

    /**
     * Constructor por defecto
     * @param coordX recibe un punto en el eje X
     * @param coordY recibe un punto en el eje Y
     */
    public Coordinate(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    /**
     * Método que devuelve el punto X de la coordenada
     * @return punto X en el plano de la coordenada
     */
    public double getCoordX() {
        return coordX;
    }

    /**
     * Método que modifica el valor del punto en X de la coordenada
     * @param coordX punto en el eje X a modificar
     */
    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    /**
     * Método que devuelve el punto Y de la coordenada
     * @return punto Y en el plano de la coordenada
     */
    public double getCoordY() {
        return coordY;
    }

    /**
     * Método que modifica el valor del punto en Y de la coordenada
     * @param coordY punto en el eje Y a modificar
     */
    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    /**
     * Método que calcula la distancia desde un punto a otro en el plano cartesiano
     * @param coord2 distancia hasta esta coordenada
     * @return distancia entre dos coordenadas
     */
    public double distanceTo(Coordinate coord2){
        return Math.sqrt((Math.pow((coord2.getCoordX()-this.getCoordX()),2)+ Math.pow((coord2.getCoordY()-this.getCoordY()),2)));
    }

    /**
     * Override del método toString
     * @return devuelve una mejor descripción de la clase Coordenada
     */
    @Override
    public String toString() {
        return ". Eje X: " + this.getCoordX() + ", Eje Y: " + this.getCoordY();
    }
}

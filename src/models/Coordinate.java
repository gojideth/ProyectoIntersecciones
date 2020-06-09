package models;

public class Coordinate {
    private double coordX;
    private double coordY;

    public Coordinate(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;

    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public double distanceTo(Coordinate coord2){
        return Math.sqrt((Math.pow((this.getCoordX()-coord2.getCoordX()),2)+ Math.pow((this.getCoordY()-coord2.getCoordY()),2)));
    }
}

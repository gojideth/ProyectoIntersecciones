import java.sql.SQLOutput;
import java.util.Scanner;

public class CirclesInArea {
    public final static int MAX = 2;
    public Circle[] circles;

    public CirclesInArea(){
        this.circles = new Circle[1];
        circles[0] = null;

    }

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        this.circles = circles;
    }
    public void addCircle(Circle circle){
        circles[circles.length -1] = circle;
        resizeCirclesArray();

    }

    public void resizeCirclesArray(){
        Circle[] aux = new Circle[circles.length-+1];
        for (int i = 0; i < circles.length; i++) {
            aux[i] = circles[i];
        }
        aux[aux.length-1] = null;
        circles = aux;
    }

    public String showCircles(Circle circles[]){
        String salida = "";
        for (int i = 0; i <circles.length - 1; i++) {
            salida += circles[i] + "";
        }
        return  salida;
    }

    public double diferenceBetweenCoordinates(Circle circle1, Circle circle2){
         return (circle1.getPosition().distanceTo(circle2.getPosition()));
    }

    public double sumRadios(Circle circles[]){
        int i = 0;
        double salida = 0;
        while (circles[i]!= null){
            salida += circles[i].getRadio() + circles[i+1].getRadio();
            i++;

        }
        return salida;
    }
    public int obtainIntersection(double distanceBetweenCoordnates, double sumRadios){
        for (int i = 0; i < circles.length-1; i++) {
            for (int j = i+1; j <circles.length-2; j++) {
                if (distanceBetweenCoordnates > (sumRadios)) {

                }
            }
        }

    }


}

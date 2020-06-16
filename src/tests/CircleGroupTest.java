package tests;

import models.Circle;
import models.CircleGroup;
import models.Coordinate;

/**
 * Clase de prueba de grupo de círculos
 * @author Martin C
 */
public class CircleGroupTest {
    CircleGroup myCircleTest;

    /**
     * Método constructor por defecto
     */
    public CircleGroupTest(){
        this.myCircleTest = new CircleGroup();

    }

    /**
     * Método que crea un arreglo de círculos
     */
    public void aumentarCirclesThis(){
        myCircleTest.addCircle(new Circle(1,new Coordinate(-8,4)));
        myCircleTest.addCircle(new Circle(3,new Coordinate(-3,4)));
        myCircleTest.addCircle(new Circle(4,new Coordinate(3,4)));
        //myCircleTest.addCircle(new Circle(4,new Coordinate(6,4)));
        //myCircleTest.addCircle(new Circle(2,new Coordinate(9,4)));

    }

    /**
     * Método que prueba si hay intersecciones en el arreglo de círculos
     */
    public void tester(){
        System.out.println("Metodo show intersections");
        System.out.println("Caso de Prueba : " + myCircleTest.countIntersections(myCircleTest.getCircles()) + " intersecciones.");
    }

    public static void main(String args[]){
        CircleGroupTest myTest = new CircleGroupTest();
        myTest.aumentarCirclesThis();
        myTest.tester();
    }
}

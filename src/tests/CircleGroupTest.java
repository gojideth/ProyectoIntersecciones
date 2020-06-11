package tests;

import models.Circle;
import models.CircleGroup;
import models.Coordinate;

public class CircleGroupTest {
    CircleGroup myCircleTest;

    public CircleGroupTest(){
        this.myCircleTest = new CircleGroup();

    }

    public void aumentarCirclesThis(){
        Coordinate primerCor = new Coordinate(-3,4);
        Circle circle1 = new Circle(3,primerCor);
        Coordinate segundaCor = new Coordinate(3,4);
        Circle circle2 = new Circle(4,segundaCor);
        myCircleTest.addCircle(circle1);
        myCircleTest.addCircle(circle2);

    }

    public void tester(){
        System.out.println("Metodo show intersections");
       // System.out.println("Caso prueba 1: " + (new CircleGroup().obtainIntersections(new CircleGroup().diferenceBetweenCoordinates(myCircleTest.getCircles()),new CircleGroup().sumRadios(myCircleTest.getCircles()))));
        /**System.out.println("Caso prueba 2: " + (new CircleGroup().obtainIntersections(new CircleGroup().diferenceBetweenCoordinates())));
        new CircleGroup().diferenceBetweenCoordinates(new CircleGroup().addCircle(new Circle(3,new Coordinate(-3,4))));*/
    }

    public static void main(String args[]){
        CircleGroupTest myTest = new CircleGroupTest();
        //myTest.aumentarCirclesThis();
        myTest.tester();
    }
}

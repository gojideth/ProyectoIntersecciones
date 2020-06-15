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
        myCircleTest.addCircle(new Circle(1,new Coordinate(-8,4)));
        myCircleTest.addCircle(new Circle(3,new Coordinate(-3,4)));
        myCircleTest.addCircle(new Circle(4,new Coordinate(3,4)));
        //myCircleTest.addCircle(new Circle(4,new Coordinate(6,4)));
        //myCircleTest.addCircle(new Circle(2,new Coordinate(9,4)));

    }

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

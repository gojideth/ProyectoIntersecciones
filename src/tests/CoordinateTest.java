package tests;

import models.Coordinate;

public class CoordinateTest {
    private Coordinate coordinateTest;

    public CoordinateTest(){
        coordinateTest = new Coordinate(0,0);
    }
    public void tester(){
        System.out.println("Metodo distanceTo");
        System.out.println("Caso de prueba 1: " + (new Coordinate(3,4).distanceTo(new Coordinate(4,5))==Math.sqrt(2)?"OK":"Error"));
        System.out.println("Caso de prueba 2: " + (new Coordinate(-10,5).distanceTo(new Coordinate(0,5))==Math.sqrt(100)?"OK":"Error"));
        System.out.println("Caso de prueba 3: " + (new Coordinate(15,1).distanceTo(new Coordinate(2,3))==Math.sqrt(173)?"OK":"Error"));
        System.out.println("Caso de prueba 4: " + (new Coordinate(6,5).distanceTo(new Coordinate(7,6))==Math.sqrt(2)?"OK":"Error"));
        System.out.println("Caso de prueba 5: " + (new Coordinate(-1,5).distanceTo(new Coordinate(5,1))==Math.sqrt(52)?"OK":"Error"));
        System.out.println("Caso de prueba 6: " + (new Coordinate(4,2).distanceTo(new Coordinate(8,4))==Math.sqrt(20)?"OK":"Error"));
        System.out.println("Caso de prueba 7: " + (new Coordinate(2,1).distanceTo(new Coordinate(6,2))==Math.sqrt(17)?"OK":"Error"));
        System.out.println("Caso de prueba 8: " + (new Coordinate(-4,-3).distanceTo(new Coordinate(-8,-3))==Math.sqrt(16)?"OK":"Error"));
        System.out.println("Caso de prueba 9: " + (new Coordinate(6,6).distanceTo(new Coordinate(0,0))==Math.sqrt(72)?"OK":"Error"));
        System.out.println("Caso de prueba 10: " + (new Coordinate(-3,3).distanceTo(new Coordinate(4,5))==Math.sqrt(53)?"OK":"Error"));

    }

    public static void main(String args[]){
        new CoordinateTest().tester();
    }

}

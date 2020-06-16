package tests;

import models.Circle;
import models.Coordinate;

/**
 * Clase de prueba de círculo
 * @author Martin C
 */
public class CircleTest {
    Circle circleTest;

    /**
     * Método constructor por defecto
     */
    public CircleTest(){
        this.circleTest = new Circle(3,new Coordinate(3,2));
    }

    /**
     * Método que prueba si el área de los circulos está siendo obtenida correctamente
     */
    public void test(){
        System.out.println("Método obtainArea");
        System.out.println("Caso de prueba 1: " + (new Circle(2,new Coordinate(0,0)).obtainArea()==(Math.PI * Math.pow(2,3))?"OK":"ERROR"));
        System.out.println("Caso de prueba 2: " + (new Circle(4,new Coordinate(0,0)).obtainArea()==(Math.PI * Math.pow(4,3))?"OK":"ERROR"));
        System.out.println("Caso de prueba 3: " + (new Circle(8,new Coordinate(0,0)).obtainArea()==(Math.PI * Math.pow(8,3))?"OK":"ERROR"));
        System.out.println("Caso de prueba 4: " + (new Circle(5.6,new Coordinate(0,0)).obtainArea()==(Math.PI * Math.pow(5.6,3))?"OK":"ERROR"));
        System.out.println("Caso de prueba 5: " + (new Circle(4.3,new Coordinate(0,0)).obtainArea()==(Math.PI * Math.pow(4.3,3))?"OK":"ERROR"));
        System.out.println("Caso de prueba 6: " + (new Circle(1.5,new Coordinate(0,0)).obtainArea()==(Math.PI * Math.pow(1.5,3))?"OK":"ERROR"));
        System.out.println("Caso de prueba 7: " + (new Circle(2.3,new Coordinate(0,0)).obtainArea()==(Math.PI * Math.pow(2.3,3))?"OK":"ERROR"));
        System.out.println("Caso de prueba 8: " + (new Circle(4.2,new Coordinate(0,0)).obtainArea()==(Math.PI * Math.pow(4.2,3))?"OK":"ERROR"));
        System.out.println("Caso de prueba 9: " + (new Circle(7.79,new Coordinate(0,0)).obtainArea()==(Math.PI * Math.pow(7.79,3))?"OK":"ERROR"));
        System.out.println("Caso de prueba 10: " + (new Circle(2.245,new Coordinate(0,0)).obtainArea()==(Math.PI * Math.pow(2.245,3))?"OK":"ERROR"));
    }

    /**
     * Método que prueba si un circulo se intersecta con otro correctamente
     */
    public void test2(){
        System.out.println("Método isIntersected");
        System.out.println("Caso de prueba 1: " + (new Circle(4, new Coordinate(-3, 3)).isIntersected(new Circle(5, new Coordinate(4, 2))) ?"OK, INTERSECACIÓN":"NO HAY INTERSECACIÓN"));
        System.out.println("Caso de prueba 2: " + (new Circle(2,new Coordinate(-2,2)).isIntersected(new Circle(3, new Coordinate(2,3)))?"OK,INTERSECACIÓN":"NO HAY INTERSECACIÓN"));
        System.out.println("Caso de prueba 3: " + (new Circle(3, new Coordinate(-1, 1)).isIntersected(new Circle(2, new Coordinate(1, 2))) ?"OK,INTERSECACIÓN":"NO HAY INTERSECACIÓN"));
        System.out.println("Caso de prueba 4: " + (new Circle(1.5,new Coordinate(-2,2)).isIntersected(new Circle(2, new Coordinate(1,2)))?"OK,INTERSECACIÓN":"NO HAY INTERSECACIÓN"));
        System.out.println("Caso de prueba 5: " + (new Circle(3.6,new Coordinate(-5,2)).isIntersected(new Circle(4, new Coordinate(-1,-2)))?"OK,INTERSECACIÓN":"NO HAY INTERSECACIÓN"));
        System.out.println("Caso de prueba 6: " + (new Circle(6,new Coordinate(0,0)).isIntersected(new Circle(2, new Coordinate(1,2)))?"OK,INTERSECACIÓN":"NO HAY INTERSECACIÓN"));
        System.out.println("Caso de prueba 7: " + (new Circle(1.5,new Coordinate(-1,-5)).isIntersected(new Circle(2, new Coordinate(1,2)))?"OK,INTERSECACIÓN":"NO HAY INTERSECACIÓN"));
        System.out.println("Caso de prueba 8: " + (new Circle(4, new Coordinate(5, 2)).isIntersected(new Circle(2, new Coordinate(0, 2))) ?"OK,INTERSECACIÓN":"NO HAY INTERSECACIÓN"));
        System.out.println("Caso de prueba 9: " + (new Circle(5, new Coordinate(3, 3)).isIntersected(new Circle(2, new Coordinate(-4, 3))) ?"OK,INTERSECACIÓN":"NO HAY INTERSECACIÓN"));
        System.out.println("Caso de prueba 10: " + (new Circle(1.6, new Coordinate(-2, 2)).isIntersected(new Circle(2, new Coordinate(1, 2))) ?"OK,INTERSECACIÓN":"NO HAY INTERSECACIÓN"));

    }


    public static void main(String args[]){
        new CircleTest().test();
        System.out.println("");
        new CircleTest().test2();
    }
}

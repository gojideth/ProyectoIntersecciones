package tests;

import models.CircleGroup;
import models.Coordinate;
import models.Circle;


import java.util.Random;

public class CircleGroupLoad {
    private CircleGroup circleGroup;
    private Parameter parameter;

    public CircleGroupLoad(){
    }

    public void generate(){
        CircleGroup circleGroup = new CircleGroup();
        Circle[] circles = new Circle[parameter.ammount];
        for (int i = 0; i <circles.length ; i++) {
            circles[i] = new Circle(parameter.createRandomRadio(),parameter.createRandomCoordinate());

            //circleGroup.addCircle(circles[i]);
        }
        for (Circle circle: circles) {
            System.out.println("Circulos: "  + circle);
        }
    }


    public void test(Parameter parameter){
        this.parameter = parameter;
        generate();
        long timeInit = System.currentTimeMillis();
        System.out.println("Intersecciones: " + circleGroup.countIntersections(circleGroup.getCircles()));
        System.out.println("Duracion: " + (System.currentTimeMillis()-timeInit) + "milisegundos");
    }

    public static void main(String[] args) {
        CircleGroupLoad circleGroupLoad = new CircleGroupLoad();
        circleGroupLoad.test(circleGroupLoad.new Parameter(Integer.parseInt(args[0]), //cantidad
                Double.parseDouble(args[1]), //radio minimo
                Double.parseDouble(args[2]), //radio maximo
                        new Coordinate(Double.parseDouble(args[3]), //x minimo
                             Double.parseDouble(args[4])), //x maximo
                        new Coordinate(Double.parseDouble(args[5]), //y minimo
                            Double.parseDouble(args[6]))));

        //circleGroupLoad.test(circleGroupLoad.new Parameter(1000, 0.5, 200.0,new Coordinate(-1000.0,1000.0), new Coordinate(1000.0,-1000.0)));

    }

    /**
     * Parametros del generador del caso de prueba
     */
    public class Parameter{
        private int ammount;
        private double minRadio;
        private double maxRadio;
        private Coordinate minCoordinate;
        private Coordinate maxCoordinate;

        public Parameter(int ammount, double minRadio, double maxRadio, Coordinate minCoordinate, Coordinate maxCoordinate) {
            this.ammount = ammount;
            this.minRadio = minRadio;
            this.maxRadio = maxRadio;
            this.minCoordinate = minCoordinate;
            this.maxCoordinate = maxCoordinate;
        }

        public double createRandomRadio(){
            return randomValue(minRadio,maxRadio);
        }

        public Coordinate createRandomCoordinate(){
            return new Coordinate(randomValue(minCoordinate.getCoordX(),maxCoordinate.getCoordX()),
                    randomValue(minCoordinate.getCoordY(),maxCoordinate.getCoordY()));
        }

        private double randomValue(double min, double max){
            Random random = new Random();
            return min + random.nextDouble()*(max-min);
        }

    }
}

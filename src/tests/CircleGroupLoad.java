package tests;

import models.CircleGroup;
import models.Coordinate;
import models.Circle;


import java.util.Random;

/**
 * Clase para probar pruebas de estrés a los círculos
 * @author Martin C
 */
public class CircleGroupLoad {
    private CircleGroup circleGroup;
    private Parameter parameter;

    /**
     * Método constructor por defecto
     */
    public CircleGroupLoad(){
    }

    /**
     * Método que rellena el arreglo de círculos
     */
    public void generate(){
        CircleGroup circleGroup = new CircleGroup();
        this.circleGroup = circleGroup;
        Circle[] circles = new Circle[parameter.ammount];
        for (int i = 0; i <circles.length ; i++) {
            circles[i] = new Circle(parameter.createRandomRadio(),parameter.createRandomCoordinate());
            circleGroup.addCircle(circles[i]);
        }
        for (Circle circle: circleGroup.getCircles()) {
            System.out.println("Circulo: " + circle);
        }
    }

    /**
     * Método que evalua las cantidades de intersecciones y el tiempo estimado de demora.
     * @param parameter Parametros para la creación de los círculos
     */
    public void test(Parameter parameter){
        this.parameter = parameter;
        generate();
        long timeInit = System.currentTimeMillis();
        int totalIntersections = CircleGroup.countIntersections(this.circleGroup.getCircles());
        System.out.println("Intersecciones: " + String.valueOf(totalIntersections));
        System.out.println("Duracion: " + (System.currentTimeMillis()-timeInit) + " milisegundos");
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



    }

    /**
     * Clase que contiene los parametros del generador del caso de prueba
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

        /**
         * Método que genera un radio aleatorio mediante un minimo y un máximo
         * @return El radio
         */
        public double createRandomRadio(){
            return randomValue(minRadio,maxRadio);
        }

        /**
         * Método que genera una coordenada aleatoria mediante un punto minimo y uno máximo
         * @return Coordenada creada
         */
        public Coordinate createRandomCoordinate(){
            return new Coordinate(randomValue(minCoordinate.getCoordX(),maxCoordinate.getCoordX()),
                    randomValue(minCoordinate.getCoordY(),maxCoordinate.getCoordY()));
        }

        /**
         * Método que genera un valor aleatorio
         * @param min Minimo valor para ser generado
         * @param max Máximo valor para ser generado
         * @return Valor aleatorio creado
         */
        private double randomValue(double min, double max){
            Random random = new Random();
            return min + random.nextDouble()*(max-min);
        }

    }
}

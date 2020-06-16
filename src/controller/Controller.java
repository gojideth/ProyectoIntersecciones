package controller;
import models.CircleGroup;

import java.util.Scanner;
import javax.swing.JOptionPane;
import models.Circle;
import models.Coordinate;

/**
 * Clase Controller encargada de crear el programa
 * @author Martin C
 */
public class Controller {
    Controller.View myView;
    CircleGroup myCircles;

    /**
     * Método constructor que instancia un atributo de tipo CircleGroup
     */
    public Controller(){
        myCircles = new CircleGroup();
    }

    /**
     * Método que muestra el menú del programa
     */
    public void menu(){
        myView = new Controller.View();
        int option = 0;
        do {
            try {
                option = myView.readMenu();
                switch (option){
                    case 1:
                        agregateCircle();
                        break;
                    case 2:
                        printCircles();
                        break;
                    case 3:
                        myView.showMessage("Hay un total de: " + myCircles.countIntersections(myCircles.getCircles()) + " intersecciones. \n");
                        //System.out.println("Intersecciones: " + myCircles.obtainIntersections((myCircles.diferenceBetweenCoordinates(myCircles.getCircles())),(myCircles.sumRadios(myCircles.getCircles()))));
                        break;
                    case 4:
                        //System.out.println("Diference:" + myCircles.diferenceBetweenCoordinates(myCircles.getCircles()));
                        break;

                }
            }catch (NumberFormatException inputMismatchException){
                myView.showMessage("Indique una opción válida");
            }
        }while(option != 5);
    }

    /**
     * Método que agrega el círculo
     */
    public void agregateCircle(){
        myCircles.addCircle(createCircle());
    }

    /**
     * Método que crea un círculo
     * @return El círculo creado
     */
    public Circle createCircle(){
        double radio = myView.readDouble("Ingrese el radio: ");
        Coordinate coordinates = new Coordinate(myView.readDouble("Eje X: "),myView.readDouble("Eje Y: "));
        Circle circle = new Circle(radio,coordinates);
        return circle;
    }

    /**
     * Método que muestra todos los círculos en el arreglo
     */
    public void printCircles(){
        for (Circle circle:myCircles.getCircles()) {
            System.out.println(circle);
        }
    }

    /**
     * Clase estática creada encargada del input y output de datos
     * @author Martin C
     */
    public static class View{

        private Scanner input;

        /**
         * Método constructor que instancia e inicializa un objeto de tipo Scanner
         */
        public View() {
            input = new Scanner(System.in);
        }

        /**
         * Método encargado de mostrar y leer opciones del menú
         * @return La opción deseada del menú
         */
        public short readMenu() {
        String menuText = "1. Adicionar Circulos\n" +
                        "2. Mostrar circulos \n" +
                        "3. Obtener intersecciones\n" +
                        "4. Diferencia entre coordenadas\n" +
                        "5. Salir del menú\n";

                return readShort(menuText);
        }

        /**
         * Método que recibe una cadena de texto y la muestra
         * @param message El texto a mostrar
         */
        public void showMessage(String message) {
            System.out.print(message);
        }

        /**
         * Método que recibe un mensaje y lo muestra gráficamente
         * @param message Mensaje que se quiere mostrar
         */
        public void showMessageGUI(String message) {
                JOptionPane.showMessageDialog(null, message);
        }

        /**
         * Método que muestra un mensaje y lee un short
         * @param message Mensaje que se quiere mostrar
         * @return El número ingresado
         */
        public short readShort(String message) {
                this.showMessage(message);
                return input.nextShort();
        }

        /**
         * Método que muestra un mensaje y lee un short gráficamente
         * @param message Mensaje que se quiere mostrar
         * @return El número ingresado
         */
        public short readShortGUI(String message) {
            return Short.parseShort( JOptionPane.showInputDialog(message));
        }

        /**
         * Método que muestra un mensaje y lee un double
         * @param message Mensaje que se quiere mostrar
         * @return El número ingresado
         */
        public double readDouble(String message) {
            this.showMessage(message);
            return input.nextDouble();
        }

        /**
         *
         * Método que muestra un mensaje y lee un double gráficamente
         * @param message Mensaje que se quiere mostrar
         * @return El número ingresado
         */
        public double readDoubleGUI(String message) {
            return Double.parseDouble(JOptionPane.showInputDialog(message));
        }

        /**
         * Método que muestra un mensaje y lee un entero
         * @param message Mensaje que se quiere mostrar
         * @return El número ingresado
         */
        public int readIntegerGUI(String message) {
            return Integer.parseInt(JOptionPane.showInputDialog(message));
        }

        /**
         * Método que muestra un mensaje y lee texto
         * @param message Mensaje que se quiere mostrar
         * @return El texto ingresado
         */
        public String readString(String message) {
            this.showMessage(message);
            return input.next();
        }

        /**
         * Método que muestra un mensaje y lee texto gráficamente
         * @param message Mensaje que se quiere mostrar
         * @return El texto ingresado
         */
        public String readStringGUI(String message) {
            return JOptionPane.showInputDialog(message);
        }
    }

}



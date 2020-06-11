package controller;
import models.CircleGroup;

import java.util.Scanner;
import javax.swing.JOptionPane;
import models.Circle;
import models.Coordinate;

public class Controller {
    Controller.View myView;
    CircleGroup myCircles;

    public Controller(){
        myCircles = new CircleGroup();
    }

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
                        System.out.println("Num intersecciones" + myCircles.countIntersections(myCircles.getCircles()));
                        //System.out.println("Intersecciones: " + myCircles.obtainIntersections((myCircles.diferenceBetweenCoordinates(myCircles.getCircles())),(myCircles.sumRadios(myCircles.getCircles()))));
                        break;
                    case 4:
                        //System.out.println("Diference:" + myCircles.diferenceBetweenCoordinates(myCircles.getCircles()));
                        break;

                }
            }catch (NumberFormatException inputMismarchtException){
                myView.showMessage("Indique una opción válida");
            }
        }while(option != 5);
    }

    public void agregateCircle(){
        myCircles.addCircle(createCircle());
    }

    public Circle createCircle(){
        double radio = myView.readDouble("Ingrese el radio");
        Coordinate coordinates = new Coordinate(myView.readDouble("Eje X"),myView.readDouble("Eje Y"));
        Circle circle = new Circle(radio,coordinates);
        return circle;
    }

    public void printCircles(){
        for (Circle circle:myCircles.getCircles()) {
            System.out.println(circle);
        }
    }

    public static class View{

        private Scanner input;
        public View() {
            input = new Scanner(System.in);
        }

        public short readMenu() {
        String menuText = "1. Adicionar Circulos\n" +
                        "2. Mostrar circulos \n" +
                        "3. Obtener intersecciones\n" +
                        "4. Diferencia entre coordenadas\n" +
                        "5. Salir del menú\n";

                return readShort(menuText);
        }

        public void showMessage(String message) {
            System.out.println(message);
        }

        public void showMessageGUI(String message) {
                JOptionPane.showMessageDialog(null, message);
        }

        public short readShort(String message) {
                this.showMessage(message);
                return input.nextShort();
        }

        public short readShortGUI(String message) {
            return Short.parseShort( JOptionPane.showInputDialog(message));
        }

        public double readDouble(String message) {
            this.showMessage(message);
            return input.nextDouble();
        }

        public double readDoubleGUI(String message) {
            return Double.parseDouble(JOptionPane.showInputDialog(message));
        }

        public int readIntegerGUI(String message) {
            return Integer.parseInt(JOptionPane.showInputDialog(message));
        }
        public String readString(String message) {
            this.showMessage(message);
            return input.next();
        }

        public String readStringGUI(String message) {
            return JOptionPane.showInputDialog(message);
        }
    }

}



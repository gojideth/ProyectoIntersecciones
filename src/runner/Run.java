package runner;
import controller.Controller;

/**
 * Clase que corre el programa
 * @author Martin C
 */
public class Run {
    /**
     * Método main
     * @param args Parámetros para correr el programa
     */
    public static void main(String args[]){
        new Controller().menu();
    }

}

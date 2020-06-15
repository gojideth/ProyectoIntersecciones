package models;

/**
 * Clase CircleGroup
 * @author Martin C
 */
public class CircleGroup {
    private final static int MAX = 2;
    private Circle[] circles;

    /**
     * Método constructor que inicializa el arreglo con un círculos nulo en la posición 0
     */
    public CircleGroup(){
        this.circles = new Circle[1];
        circles[0] = null;
    }

    /**
     * Método que retorna el arreglo de circulos
     * @return los círculos dentro del arreglo
     */
    public Circle[] getCircles() {
        return circles;
    }

    /**
     * Método que mediante el ingreso de un arreglo de círculos lo modifica en el atributo de la clase
     * @param circles arreglo de círculos que se quiere agregar en el atributo
     */
    public void setCircles(Circle[] circles) {
        this.circles = circles;
    }

    /**
     * Método que agrega un circulo al arreglo de círculos y redimensiona el arreglo
     * @param circle círculos que se quiere incluir en el arreglo
     */
    public void addCircle(Circle circle){
        circles[circles.length - 1] = circle;
        resizeCirclesArray();
    }

    /**
     * Método que redimensiona el arrelgo de círculos dejando nula la última posición de este
     */
    public void resizeCirclesArray(){
        Circle[] aux = new Circle[circles.length+1];
        for (int i = 0; i < circles.length; i++) {
            aux[i] = circles[i];
        }
        aux[aux.length-1] = null;
        circles = aux;
    }

    /**
     * Método que cuenta las intersecciones que hay entre los círculos
     * @param circles el arreglo de círculos al cual se quiere contar las intersecciones
     * @return la cantidad de intersecciones
     */
    public int countIntersections(Circle[]circles){
        int count = 0; String salida = "";
        int i = 0;
        for (int j = 0; j < circles.length-2 ; j++) {
            for (int k = 0; k < circles.length - 1 ; k++) {
                if (circles[i+1]!= null){
                    if (circles[i].isIntersected(circles[i+1])) {
                        count += 1;
                        i++;

                    }
                }
            }
        }

        return count;
    }
}

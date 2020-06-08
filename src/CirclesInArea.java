public class CirclesInArea {
    public final static int MAX = 2;
    public Circle[] circles;

    public CirclesInArea(){
        this.circles = new Circle[1];
        circles[0] = null;

    }

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        this.circles = circles;
    }
    public void addCircle(Circle circle){
        circles[circles.length -1] = circle;
        resizeCirclesArray();

    }

    public void resizeCirclesArray(){
        Circle[] aux = new Circle[circles.length-+1];
        for (int i = 0; i < circles.length; i++) {
            aux[i] = circles[i];
        }
        aux[aux.length-1] = null;
        circles = aux;
    }

    public String showCircles(Circle circles[]){
        String salida = "";
        for (int i = 0; i <circles.length - 1; i++) {
            salida += circles[i] + "";
        }
        return  salida;
    }
    public double diferenceBetweenCoordinates(Circle circle1, Circle circle2){
        return 

    }
    public int obtainIntersection(){

    }
}

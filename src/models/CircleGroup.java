package models;

public class CircleGroup {
    private final static int MAX = 2;
    private Circle[] circles;

    public CircleGroup(){
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
        circles[circles.length - 1] = circle;
        resizeCirclesArray();
    }

    public void resizeCirclesArray(){
        Circle[] aux = new Circle[circles.length+1];
        for (int i = 0; i < circles.length; i++) {
            aux[i] = circles[i];
        }
        aux[aux.length-1] = null;
        circles = aux;
    }

    public String countIntersections(Circle[]circles){
        int i = 0; int count = 0;
        String out = "";
        while (circles[i+1]!=null){
            if(circles[i].isIntersected(circles[i+1],circles[i].differenceBetweenCoordinates(circles[i+1])) == true){
                out += "Hay número de interseccion" + count + "\n";
                count ++;
                i++;
            }
        }
        return out;
    }

    /**public String showCircles(Circle circles[]){
        String out = "";
        for (int i = 0; i <circles.length - 2; i++) {
            out += circles[i] + "";
        }
        return  out;
    }



    public double diferenceBetweenCoordinates(Circle circles[]){
        double out = 0;
        for (int i = 0; i < circles.length - 2 ; i++) {
            for (int j = i +1; j < circles.length - 1; j++) {
                if (circles[j] != null){
                    out = circles[i].getPosition().distanceTo(circles[j].getPosition());
                }
            }
        }
        return out;
    }

    public double sumRadios(Circle circles[]){
        int i = 0;
        double out = 0;
        while(circles[i+1]!=null){
            out = circles[i].getRadio() + circles[i+1].getRadio();
            i++;
        }
        return out;
    }

    public int obtainIntersections(double distanceBetweenCoordinates, double sumRadios){
        int count = 0;
        for (int i = 0; i < circles.length-1 ; i++) {
            for (int j = i + 1; j <circles.length-2 ; j++) {
                if ((distanceBetweenCoordinates > sumRadios)&&((distanceBetweenCoordinates-sumRadios) != 0)) {
                    count ++;
                }
            }
        }
        return count;
    }

    @Override
    public String toString() {
        String salida = "";
        for (int i = 0; i < ; i++) {

        }
        return salida;
    }*/

}


import Shape.Point;
import Shape.Triangle;


public class Main {

    public static void main(String[] args) {
        Point a = new Point('A', 5, 3);
        Point b = new Point('B', 1, 2);
        Point c = new Point('C', 3, 4);
        Triangle tamGiac = new Triangle();
        tamGiac.checkTypeTriangle(a, b, c);
        
    }
}

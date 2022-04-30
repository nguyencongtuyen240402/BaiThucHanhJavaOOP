
package Shape;
import java.lang.Math;

public class Triangle extends Point {

    

    public void checkTypeTriangle(Point x, Point y, Point z) {
        float a = calculateLength(x, y);
        System.out.println(a);
        float b = calculateLength(x, z);
        System.out.println(b);
        float c = calculateLength(y, z);
        System.out.println(c);

        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            System.out.println("Đây là tam giác !");
        }
        if ((a == b) || (b == c) || (c == a)) {
            System.out.println("Đây là tam giác cân !");
        } else if ((a == b) && (b == c) && (c == a)) {
            System.out.println("Đây là tam giác đều !");
        } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
            System.out.println("Đây là tam giác vuông !");
        } else {
            System.out.println("Đây không phải tam giác");
        }
    }

    public float calculateLength(Point x, Point y) {
        float a = Math.abs((x.getHoanhDo() - y.getHoanhDo()) * (x.getHoanhDo() - y.getHoanhDo()) + (x.getTungDo() - y.getTungDo()) * (x.getTungDo() - y.getTungDo()));
        return a;
    }
}

package Shapes;

public class HinhHoc {
    public final float PI = 3.14f;
    
    public String ten;
    public float chuvi;
    public float dientich;
    public float thetich;

    public void display() {
        System.out.println("\n\n===== " + ten + " =====");
    }
    public void inChuvi() {
        System.out.println("Chu vi = "+ chuvi);
    }
    public void inDientich() {
        System.out.println("Diện tích: " + dientich);
    }
    public void inThetich() {
        System.out.println("Thể tích: " + thetich);
    }
}

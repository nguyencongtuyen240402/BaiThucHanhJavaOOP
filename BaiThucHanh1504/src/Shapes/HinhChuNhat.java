package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    
    public HinhChuNhat() {
        ten = "Hình Chữ Nhật";
    }
    public void nhapChieudai() {
        System.out.println("Nhập chiều dài: ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
        scanner.close();
    }
    public void nhapChieurong() {
        System.out.println("Nhập chiều rộng: ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
        sc.close();
    }
    public void tinhChuvi() {
        chuvi = 2 * (dai + rong);
    }
    public void tinhDienTich() {
        dientich = dai * rong;
    }
}

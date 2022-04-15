package Shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    public float bankinh;
    public HinhTron() {
        ten = "Hình Tròn";
    }
    public void nhapBankinh() {
        System.out.println("Nhập bán kính: ");
        Scanner scanner = new Scanner(System.in);
        bankinh = scanner.nextFloat();
        scanner.close();
    }
    public void tinhChuvi() {
        chuvi = 2 * PI * bankinh;
    }
    public void tinhDienTich() {
        dientich = PI * bankinh * bankinh;
    }
    
}

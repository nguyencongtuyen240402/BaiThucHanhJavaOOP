package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieucao;
    public HinhTru() {
        ten = "Hình Trụ";
    }
    public void nhapChieucao() {
        nhapBankinh();
        System.out.println("Nhập chiều cao: ");
        Scanner sc = new Scanner("System.in");
        chieucao = sc.nextFloat();
        sc.close();
    }
    public void tinhThetich() {
        tinhDienTich();
        thetich = dientich * chieucao;
    }
}

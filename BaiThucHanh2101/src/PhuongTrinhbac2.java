package BaiThucHanh2101.src;

import java.util.Scanner;

public class PhuongTrinhbac2 {
    public static void main(String[] args){
        Double HeSoA,HeSoB,HeSoC,Delta;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap he so A");
        HeSoA= sc.nextDouble();
        System.out.println("nhap he so B");
        HeSoB= sc.nextDouble();
        System.out.println("nhap he so C");
        HeSoC= sc.nextDouble();
        Delta=HeSoB*HeSoB-4*HeSoA*HeSoC;
        if(Delta>0){
           Double x1,x2;
           x1=-HeSoB+Math.sqrt(Delta)/2*HeSoA;
           x2=-HeSoB-Math.sqrt(Delta)/2*HeSoA;
            System.out.printf("x1=%f",x1);
            System.out.printf("x2=%f",x2);

        }else if(Delta==0){
            Double x=-HeSoB/2*HeSoA;
            System.out.println("phuong trinh co nghiem kep");
            System.out.printf("x=%f",x);
        }
        else{
            System.out.println("phuong trinh vo nghiem");
        }
    }
}

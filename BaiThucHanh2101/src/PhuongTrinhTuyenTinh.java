import java.util.Objects;
import java.util.Scanner;


public class PhuongTrinhTuyenTinh {
    public static void main(String[] args){
        Double a1,a2,b1,b2,c1,c2;
        Scanner sc= new Scanner(System.in);
        System.out.println("a1=");
        a1= sc.nextDouble();
        System.out.println("b1=");
        b1= sc.nextDouble();
        System.out.println("c1=");
        c1= sc.nextDouble();
        System.out.println("a2=");
        a2= sc.nextDouble();
        System.out.println("b2=");
        b2= sc.nextDouble();
        System.out.println("c2=");
        c2= sc.nextDouble();
        Double D,Dx,Dy;
        D = a1*b2-a2*b1;
	Dx = c1*b2 -c2*b1;
	Dy = a1*c2 - a2*c1;
        if(D==0){
                if(Objects.equals(Dx, Dy)){
                        System.out.println("phuong trinh vo so nghiem");
                }else{
                       System.out.println("phuong trinh vo nghiem");
                }
        }else{
                Double x,y;
                x = Dx/D;
                y = Dy/D;
                System.out.printf("phuong trinh co nghiem x,y = %f,%f", x,y);
        }

    }
}
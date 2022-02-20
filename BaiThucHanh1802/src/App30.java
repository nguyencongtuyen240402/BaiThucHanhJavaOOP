import java.util.Scanner;
public class App30 {
    

    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen duong: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; ++i) {
            sum += i;
        }
        System.out.println("Tong cua so tu nhien vua nhap la: "+sum);
    }
}
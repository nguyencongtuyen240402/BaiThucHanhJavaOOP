import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class App3 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("nhap n>0):");
            n=sc.nextInt();
           
        }while(n<=0);
        System.out.println("Các số nguyên tố nhỏ hơn n là: ");
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
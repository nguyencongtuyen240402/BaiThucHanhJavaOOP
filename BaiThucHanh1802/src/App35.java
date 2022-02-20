import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class App35 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a=");
        a=sc.nextInt();
        System.out.println("nhap b=");
        b=sc.nextInt();
        System.out.println("so lon hon la "+(a>b?a:b));
              
    }
}

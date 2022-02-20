import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class App47 {
    public static void main(String[] args) {
        int tong=0,num;
        Scanner sc=new Scanner(System.in);
        do {
            num=sc.nextInt();
            tong+=num;
        }while (tong<100);
        System.out.println(tong);
    }
}
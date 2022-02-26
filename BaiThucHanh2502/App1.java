import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class App1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        do{
           System.out.println("nhap lan luot a va b: ");
           a=sc.nextInt();
           b=sc.nextInt();
        }while(a<=0||b<=0);
        if(a>b){
            for(int i=b;i>0;i--){
                if(a%i==0&&b%i==0){
                    System.out.println("uoc chung lon nhat la "+i);
                    break;
                }
            }
        }
        else if(a<b){
            for(int i=a;i>0;i--){
                if(a%i==0&&b%i==0) {
                    System.out.println("uoc chung lon nhat la "+i);
                    break;
                }
            }
        }
        else{
            System.out.println(" uoc chung lon nhat la "+ b); 
        }
    }
}
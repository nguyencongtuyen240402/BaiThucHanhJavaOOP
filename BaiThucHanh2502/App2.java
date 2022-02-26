import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class App2 {
    public static void main(String[] args) {
        int a,b,c,vuong=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("nhap lan luot 3 canh cua tam giac(a,b,c>0):");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
        }while(a<=0||b<=0||c<=0);
        if( a<b+c && b<a+c && c<a+b ){
        if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
                System.out.println("Day la tam giac vuong");
        else if(a==b && b==c)
                System.out.println("Day la tam giac deu");
        else if(a==b || a==c || b==c)
                System.out.println("Day la tam giac can");
        else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b)    
                System.out.println("Day la tam giac tu");
        else
                System.out.println("Day la tam giac nhon");
    }
    else
            System.out.println("Ba canh a, b, c khong phai la ba canh cua mot tam giac");
        } 
   }
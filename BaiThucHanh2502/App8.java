import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        int max=0,a;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=100;i++){
            a=sc.nextInt();
            if(a>max&&a%5==0){
                max=a;
            }
            if(a==0) break;
        }
        System.out.println("so lon nhat trong nhung so vua nhap la " + max);
                
    }
}
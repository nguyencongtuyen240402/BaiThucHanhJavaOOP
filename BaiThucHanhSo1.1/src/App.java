import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);    
    int x;
    x=sc.nextInt();
   for(int i=0 ; i<x ; i++);{
    for (int j=0; j<x ; j++);{
        System.out.print("*");
    }
    System.out.println();
   }
}
}
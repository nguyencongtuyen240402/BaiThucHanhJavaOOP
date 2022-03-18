package baitap1803;
import java.util.Scanner;


public class Person {
    Scanner sc=new Scanner(System.in);
    String PersonId;
    String PersonName;
    String Gender;
    String Addrees;

    public void input(){
        System.out.print("nhap ID:");
        PersonId=sc.nextLine();
        System.out.print("nhap ho va ten:");
        PersonName=sc.nextLine();
        System.out.print("nhap dia chi:");
        Addrees=sc.nextLine();
        System.out.print("nhap gioi tinh:");
        Gender=sc.nextLine();
    }
    public void output(){
        System.out.println("ID:"+PersonId);
        System.out.println("Ho va Ten:"+PersonName);
        System.out.println("Dia chi:"+Addrees);
        System.out.println("Gioi tinh:"+Gender);
    }
}
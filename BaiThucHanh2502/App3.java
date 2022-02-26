import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class App3 {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("nhap n>0):");
            n=sc.nextInt();
           
        }while(n<=0);
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0) System.out.println(n +" la so nguyen to");
        else System.out.println(n +" khong la so nguyen to");
    }
}
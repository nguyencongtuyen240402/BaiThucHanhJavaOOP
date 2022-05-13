import  java.util.Scanner;
import java.util.HashSet;;
public class App54 {
    public static void main(String[] args) throws Exception {
       
        HashSet<Integer> hashSetIntegers = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetIntegers.add(0);
        hashSetIntegers.add(3);
        hashSetIntegers.add(1);
        hashSetIntegers.add(4);
        hashSetIntegers.add(2);
        hashSetIntegers.add(8);
        System.out.println("Các phần tử trong hashSetInteger: " + hashSetIntegers);
        System.out.println("Nhập các phần tử cần thêm :");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            System.out.println("Nhap so phan tu can them :");
            int number = sc.nextInt();
        if (hashSetIntegers.contains(number))
         System.out.println("Phan tu " + number + "da ton tai");
        else{
            hashSetIntegers.add(number);
            System.out.println("Them thanh cong . ");

        }
        }
        System.out.println("Cac phan tu trong hashSetInt sau khi them :" + hashSetIntegers);
      
    }
}

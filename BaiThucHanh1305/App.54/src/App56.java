import  java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.HashSet;;
public class App56 {
    public static void main(String[] args) throws Exception {
      
       HashSet<String> hashSetStrings = new HashSet<>();
       Scanner sc = new Scanner(System.in);
       hashSetStrings.add("Wilson");
       hashSetStrings.add("Nike");
       hashSetStrings.add("Volvo");
       hashSetStrings.add("Kia");
       hashSetStrings.add("Lenovo");
       hashSetStrings.add("Lenovo");
        System.out.println("Các phần tử trong hashSetString:");
        System.out.println(hashSetStrings);
        System.out.println("Nhập phần tử cần xóa :");
        int n = sc.nextInt();
        sc.nextLine();
        for ( int i = 0 ; i < n ; i++) {
            System.out.println(" Nhap phan tu can xoa");
            String name = sc.nextLine();
            if(hashSetStrings.contains(name)){
                hashSetStrings.remove(name);
                System.out.println("xoa thanh cong ");
            }
            else 
            System.out.println("xoa khong thanh cong");

        }
        System.out.println("cac phan tu trong hashsetString: " + hashSetStrings);
    }
}

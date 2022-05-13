public class javauperkeyson {
    public static void main(String [] args){
        playWithVariables();
    }
    // static thi chi choi voi static
    public static void playWithVariables() {
        // bien la 1 vung ram duoc dat ten chiem 1 so byte nhat dinh tuy loai
        //du lieu/ thong tin ma no se chua ben trong -data type
        // so chu anh ....
        //bien la cach dat ten cho 1 dai luong 1 gia tri -don,phuc
        int age = 20;
        int a=10,b;
        b=100;
        // ton 12byte trong RAM
        System.out.println("age: "+ age); //~print("age:%d/n, age")
        int yob = 2001; //year of birth
        age = 2021 - yob;  
        System.out.println("age again: "+ age);

        System.out.println("age by using transitive tech: " + (2021 - yob));
        System.out.printf("age printed by using %% as in C: %d/n", (2021-yob));
    }
}

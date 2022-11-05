import java.util.Scanner;

public class serviceBilling {
    static Scanner sc=new Scanner(System.in);
    static payment p=new payment();
    void serBilling(double price){
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("name "+ name + "price "+ price);
        p.serPayment( price);

    }
}

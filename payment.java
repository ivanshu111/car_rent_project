import java.util.Scanner;

public class payment {
    static Scanner sc=new Scanner(System.in);
    void payment(int price){
        System.out.println("select payment method");
        System.out.println("1. UPI \n 2. Debit card");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("UPI");
                System.out.println("Payment of Rs "+ price +" completed");
                break;
            case 2:
                System.out.println("Debit card");
                System.out.println("Payment od Rs "+ price + " completed");

        }
    }
    void serPayment(double price){
        System.out.println("select payment method");
        System.out.println("1. UPI \n 2. Debit card");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("UPI");
                System.out.println("Payment of Rs "+ price +" completed");
                break;
            case 2:
                System.out.println("Debit card");
                System.out.println("Payment od Rs "+ price + " completed");

        }
    }
}

import java.util.Scanner;

public class welcome {
    static Scanner sc=new Scanner(System.in);
    static carRent cr=new carRent();
    static carService cs=new carService();
    void details(){
        System.out.println("Welcome To Car Rent Services");
        System.out.println("Please choose our services");
        System.out.println("1. Car for rent \n 2. Car service " );
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("car for rent");
                cr.carRent();
                break;
            case 2:
                System.out.println("Car service");
                cs.service();
                break;

            default:
                System.out.println("please choose carefully Invalid choice");
        }
    }
}

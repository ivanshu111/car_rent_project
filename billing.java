import java.util.Scanner;

public class billing {
    payment p=new payment();
    static Scanner sc=new Scanner(System.in);
    void billing(int price,String car, int km){
        System.out.println("enter your name, city, mobile");
        String name=sc.nextLine();
        String city=sc.nextLine();
        String mobile=sc.nextLine();
        System.out.println("Your Bill");
        System.out.println("Car"+ car + "for "+km +"Kms" + "your total amount is "+ price);
        System.out.println("Name "+ name + "city "+ city + "mobile "+ mobile);
        p.payment(price);
    }
}

import java.util.Scanner;

public class carService {
    static Scanner sc=new Scanner(System.in);
    static serviceBilling sb=new serviceBilling();
    double price;
    void service(){
        System.out.println("enter car name to be serviced");
        String carName=sc.nextLine();
        System.out.println("how much Km between 1000 to 50000 your car driven");
       int kmdriven=sc.nextInt();
        if(kmdriven>=1000 || kmdriven<=20000){
            price=kmdriven*1.5;
            System.out.println("car "+ carName);
            System.out.println("your total service cost is "+ price);
            sb.serBilling(price);
        }else if(kmdriven>20000 || kmdriven<=50000){
            price=kmdriven*2.5;
            System.out.println("car "+ carName);
            System.out.println("your total service cost is "+ price);
            sb.serBilling(price);
        }
    }
}

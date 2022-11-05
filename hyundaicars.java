import java.util.Scanner;

public class hyundaicars {
    static Scanner sc=new Scanner(System.in);
    static billing b=new billing();
    int km;
    int price;
    void hyurent(){
        System.out.println("List of Hyundai cars available for rent");
        System.out.println("1. i10 \n 2. i20 \n 3. verna \n 4. Elentra");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("i10 price 100KM for 1800 Rs");
                System.out.println("Enter for how many KM you needs Car");
                km=sc.nextInt();
                String i10="i10";
                if(km>=50 || km<=100){
                    price=km*18;
                    System.out.println("your total amount is "+ price);

                    b.billing(price,i10,km);
                }else if(km>100 || km<=200){
                    price=km*20;
                    System.out.println("your total amount is "+ price);
                    b.billing(price,i10,km);
                }else if(km>200 || km<=500){
                    price=km*22;
                    System.out.println("your total amount is "+ price);
                    b.billing(price,i10,km);
                }
                break;
            case 2:
                System.out.println("i20 price 100KM for 2100 Rs");
                System.out.println("Enter for how many KM you needs Car");
                km=sc.nextInt();
                String i20="i20";
                if(km>=50 || km<=100){
                    price=km*21;
                    System.out.println("your total amount is "+ price);

                    b.billing(price,i20,km);
                }else if(km>100 || km<=200){
                    price=km*23;
                    System.out.println("your total amount is "+ price);
                    b.billing(price,i20,km);
                }else if(km>200 || km<=500){
                    price=km*25;
                    System.out.println("your total amount is "+ price);
                    b.billing(price,i20,km);
                }
                break;
            case 3:
                System.out.println("verna price 100KM for 2400 Rs ");
                System.out.println("Enter for how many KM you needs Car");
                km=sc.nextInt();
                String verna="verna";
                if(km>=50 || km<=100){
                    price=km*24;
                    System.out.println("your total amount is "+ price);

                    b.billing(price,verna,km);
                }else if(km>100 || km<=200){
                    price=km*26;
                    System.out.println("your total amount is "+ price);
                    b.billing(price,verna,km);
                }else if(km>200 || km<=500){
                    price=km*27;
                    System.out.println("your total amount is "+ price);
                    b.billing(price,verna,km);
                }
                break;
            case 4:
                System.out.println("Elentra price 100KM for 2600 Rs");
                System.out.println("Enter for how many KM you needs Car");
                km=sc.nextInt();
                String elentra="elentra";
                if(km>=50 || km<=100){
                    price=km*26;
                    System.out.println("your total amount is "+ price);

                    b.billing(price,elentra,km);
                }else if(km>100 || km<=200){
                    price=km*28;
                    System.out.println("your total amount is "+ price);
                    b.billing(price,elentra,km);
                }else if(km>200 || km<=500){
                    price=km*29;
                    System.out.println("your total amount is "+ price);
                    b.billing(price,elentra,km);
                }
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}

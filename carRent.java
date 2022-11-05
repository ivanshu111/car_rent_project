import java.util.Scanner;

public class carRent {
    static Scanner sc=new Scanner(System.in);
    static hyundaicars hy=new hyundaicars();
    static billing b=new billing();
    int price;
    int km;
    void carRent(){
        System.out.println("List of car brands available");
        System.out.println("1. Maruti suzuki \n 2. Hyundai ");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("List of maruti cars with price");
                System.out.println("1. swift for price 100KM for 2000 Rs");
                System.out.println("2. breaza for price 100KM for 2500 Rs");
                System.out.println("3. alto for price 100KM for 1500 Rs");
                System.out.println("4. ciaz for price 100KM for 2300 Rs");
                int ch1=sc.nextInt();
                switch (ch1){
                    case 1:
                        System.out.println("choosen Swift enter Km between 50 to 500 you need to travel");
                        km=sc.nextInt();
                        String Swift = "swift";
                        if(km>=50 || km<=100){
                           price=km*20;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,Swift,km);
                        }else if(km>100 || km<=200){
                            price=km*20;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,Swift,km);
                        }else if(km>200 || km<=500){
                            price=km*20;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,Swift,km);
                        }

                        break;
                    case 2:
                        System.out.println("choosen breaza enter km you need to travel");
                         km=sc.nextInt();
                        String breaza = "breaza";
                        if(km>=50 || km<=100){
                            price=km*25;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,breaza,km);
                        }else if(km>100 || km<=200){
                            price=km*20;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,breaza,km);
                        }else if(km>200 || km<=500){
                            price=km*20;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,breaza,km);
                        }
                        break;
                    case 3:
                        System.out.println("choosen alto");
                        System.out.println("choosen alto enter km you need to travel");
                        km=sc.nextInt();
                        String alto = "alto";
                        if(km>=50 || km<=100){
                            price=km*15;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,alto,km);
                        }else if(km>100 || km<=200){
                            price=km*20;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,alto,km);
                        }else if(km>200 || km<=500){
                            price=km*20;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,alto,km);
                        }
                        break;
                    case 4:
                        System.out.println("choosen ciaz");
                        km=sc.nextInt();
                        String ciaz = "alto";
                        if(km>=50 || km<=100){
                            price=km*23;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,ciaz,km);
                        }else if(km>100 || km<=200){
                            price=km*20;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,ciaz,km);
                        }else if(km>200 || km<=500){
                            price=km*20;
                            System.out.println("your total amount is "+ price);
                            b.billing(price,ciaz,km);
                        }
                        break;
                    default:
                        System.out.println("invalid choice");

                }
            case 2:
                hy.hyurent();
        }

    }
}

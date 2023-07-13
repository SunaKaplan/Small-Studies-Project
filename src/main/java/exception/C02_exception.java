package exception;

import java.util.Scanner;

public class C02_exception {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            do{
                System.out.println("kan vermek istiyo musunuz eger evetse true hayırsa false yaziniz");
                boolean izin=scan.nextBoolean();
                if (izin){
                    System.out.println("o zaman yasinizi girebilir misiniz");
                    int yas= scan.nextInt();
                    if (yas>18){
                        System.out.println("yasiniz tutuyor lutfen kilonuzu giriniz");
                        double kilo= scan.nextDouble();
                        if (kilo>50){
                            System.out.println("kan verebilirsiniz");
                            break;
                        }else {
                            throw new AußerReichweite_AraliktaDegil("kan veremezsiniz");
                        }
                    }else {
                        throw new AußerReichweite_AraliktaDegil("Yasiniz kucuk oldugu icin kan veremezsiniz");
                    }
                }
                System.out.println("lutfen kan vermek istediginiz zaman tekrar geliniz");
                break;
            }while (true);}
    }


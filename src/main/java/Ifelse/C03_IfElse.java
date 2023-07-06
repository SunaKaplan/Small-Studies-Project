package Ifelse;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        /*
       Kullanicidan gun ismini alin
       ve haftaici veya hafta sonu oldugunu yazdirin
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi=scan.next().toLowerCase();
        boolean haftaIciMi=gunIsmi.equals("pazartesi")||gunIsmi.equals("sali")||gunIsmi.equals("carsamba")||gunIsmi.equals("persembe")||gunIsmi.equals("cuma");
        // if (haftaIciMi){
        //     System.out.println("haftaici");
        // }
        boolean haftaSonuMu=!haftaIciMi&&(gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi"));
        // if (haftaSonuMu){
        //     System.out.println("haftaSonu");
        // }
        // if (!(haftaIciMi||haftaSonuMu)){
        //     System.out.println("lutfen gecerli bir gun giriniz");
        // }

        if (haftaIciMi){
            System.out.println("haftaici");
        } else if (haftaSonuMu) {
            System.out.println("haftaSonu");
        }else System.out.println("lutfen gecerli bir gun giriniz");

    }

}

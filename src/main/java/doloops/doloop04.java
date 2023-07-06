package doloops;

import java.util.Scanner;

public class doloop04 {

    public static void main(String[] args) {
        //3.soru negatif bir deger girilene kadar kullanicidan girisleri
        //kabul eden ve girilen degerlerden cift sayilari toplayan program yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("sadece pozitif cift sayilari toplayan programa hosgeldiniz negatif sayi giresiye kadar calisacak");
        int sayi;
        int toplam=0;
        do {
            System.out.println("lutfen bir tamsayi giriniz");
            sayi= scan.nextInt();
            if (sayi%2==0){
                toplam+=sayi;
            }else System.out.println("lutfen cift sayi giriniz");

        }while (sayi>0);
        System.out.println("toplamlari : "+toplam);
    }
}

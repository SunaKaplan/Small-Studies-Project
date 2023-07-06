package doloops;

import java.util.Random;
import java.util.Scanner;

public class doLoop06 {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        Scanner scan=new Scanner(System.in);
        int kullaniciSayi;
        int tahminSayisi=0;

        do {
            System.out.println("lutfen tahminde bulunmak icin sayi giriniz");
            kullaniciSayi= scan.nextInt();
            tahminSayisi++;
            if (kullaniciSayi<sayi){
                System.out.println("daha buyuk bir deger giriniz");
            } else if (kullaniciSayi>sayi) {
                System.out.println("daha kucuk bir deger giriniz");
            }

        }while (sayi!=kullaniciSayi);
        System.out.println("bilgisayarin tuttugu sayiyi : "+tahminSayisi+". tahminde buldunuz");

    }
}

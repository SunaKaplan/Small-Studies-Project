package forloops;

import java.util.Scanner;

public class ForLoops02 {
    public static void main(String[] args) {

        //Kullanicidan 100 den kucuk bir tamsayi isteyin
        //1' den baslayarak girilen sayiya kadar (istenen sayi dahil) 3 un kati olan sayilari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%3==0){
               if (i<sayi){
                   System.out.print(i+",");
               }
            }else {
                System.out.println("sayi ucun kati degil");
            }

        }

        /*
        Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
         girilen sayidan baslayarak -50' kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */
    }
}

package passbyvalues;

import java.util.Scanner;

public class PassByValue_01 {
    public static void main(String[] args) {
         /*
        kullanicidan bir int deger alalim ve
        bu degeri 3 katina cikaran bir method olusturalim
        olusturdugumuz degeri method icinde
        ve main method icinde ayri ayri yazdiralim
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();//5
        System.out.println(sayi*3);//15
        System.out.println(sayi);//5
        carpim(sayi);//15
        System.out.println(sayi);//5
    }
    private static void carpim(int sayi) {
        sayi=sayi*3;
        System.out.println(sayi);//
    }
}

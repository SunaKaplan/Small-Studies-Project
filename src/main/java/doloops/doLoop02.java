package doloops;

import java.util.Scanner;

public class doLoop02 {
    public static void main(String[] args) {
        //2. Örnek
        //Girilen tamsayının basamaklarının toplamını yazan program.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;

        do {
            sayi=Math.abs(sayi);
            toplam+= sayi%10;//birler basamagini aldik
            sayi=sayi/10;//basamak azalttik
        }while (sayi>0);
        System.out.println("basamaklarin toplami : "+toplam);
    }
}

package forloops;

import java.util.Scanner;

public class ForLoops01 {
    public static void main(String[] args) {


        //Soru 1) ekrana 10 kere "Java guzeldir" yazdirin

        for (int i = 0; i < 10; i++) {
            System.out.println("Java guzeldir");

        }

        //10-30 arasinda ki sayilari (10 ve 30 dahil) aralarinda virgul olarak ayni satirda yazdiriniz

        for (int i = 10; i <= 30; i++) {
            if (i < 30) {
                System.out.print(i + ",");
            } else
                System.out.println(i);

        }

        // 100 e kadar tek ve cift sayilari iki ayri dongu ile yazdirin

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        for (int k = 0; k <= 100; k++) {

            if (k % 2 != 0) {
                System.out.print(k + " ");

            }
        }


// belirlenen sayinin 1 den 10 a kadar carpim sonuclarini yapan Java programini yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(sayi + "X" + i + "=" + sayi * i);

        }


//100 en baslayarak 50 ye kadar olan sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i = 100; i >= 50; i--) {
            if (i > 50) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }
    }
}
